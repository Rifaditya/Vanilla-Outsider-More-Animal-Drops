package com.dasik.moreanimaldrops

import net.fabricmc.fabric.api.loot.v3.LootTableEvents
import net.minecraft.world.item.Items
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator

/**
 * Modifies vanilla loot tables to ADD drops without replacing them.
 * This approach is compatible with other mods that also modify loot tables.
 */
object LootTableModifier {

    fun register() {
        LootTableEvents.MODIFY.register { key, tableBuilder, source, _ ->
            // Only modify vanilla loot tables
            if (!source.isBuiltin) return@register

            // Use toString() for comparison since API changed
            val keyString = key.toString()

            when {
                // === FARM ANIMALS ===
                keyString.endsWith("entities/chicken") -> {
                    tableBuilder.pool(createSimplePool(Items.FEATHER, 1, 1))
                }

                keyString.endsWith("entities/cow") -> {
                    tableBuilder.pool(createSimplePool(Items.LEATHER, 1, 1))
                }

                keyString.endsWith("entities/rabbit") -> {
                    tableBuilder.pool(createSimplePool(Items.RABBIT, 1, 1))
                    tableBuilder.pool(createSimplePool(Items.RABBIT_HIDE, 1, 1))
                }

                keyString.endsWith("entities/mooshroom") -> {
                    tableBuilder.pool(createSimplePool(Items.LEATHER, 1, 1))
                }

                // === RIDEABLE ANIMALS ===
                keyString.endsWith("entities/horse") ||
                keyString.endsWith("entities/mule") ||
                keyString.endsWith("entities/llama") ||
                keyString.endsWith("entities/camel") -> {
                    tableBuilder.pool(createSimplePool(Items.LEATHER, 1, 2))
                    tableBuilder.pool(createSimplePool(Items.BEEF, 1, 3))
                }

                keyString.endsWith("entities/donkey") -> {
                    tableBuilder.pool(createSimplePool(Items.LEATHER, 1, 2))
                    tableBuilder.pool(createSimplePool(Items.BEEF, 1, 2))
                }

                // === AQUATIC ANIMALS ===
                keyString.endsWith("entities/dolphin") -> {
                    tableBuilder.pool(createSimplePool(Items.COD, 1, 2))
                }

                keyString.endsWith("entities/turtle") -> {
                    tableBuilder.pool(createSimplePool(Items.SEAGRASS, 1, 1))
                }

                keyString.endsWith("entities/axolotl") -> {
                    tableBuilder.pool(createSimplePool(Items.COD, 1, 1))
                }

                // === TAMEABLE/WILD ANIMALS ===
                keyString.endsWith("entities/wolf") -> {
                    tableBuilder.pool(createSimplePool(Items.BEEF, 1, 1))
                }

                keyString.endsWith("entities/cat") -> {
                    tableBuilder.pool(createSimplePool(Items.COD, 1, 1))
                }

                keyString.endsWith("entities/ocelot") -> {
                    tableBuilder.pool(createSimplePool(Items.COD, 1, 1))
                }

                keyString.endsWith("entities/parrot") -> {
                    tableBuilder.pool(createSimplePool(Items.CHICKEN, 1, 1))
                    tableBuilder.pool(createSimplePool(Items.FEATHER, 1, 2))
                }

                // Fox: Add 1 rabbit (vanilla held item behavior is preserved!)
                keyString.endsWith("entities/fox") -> {
                    tableBuilder.pool(createSimplePool(Items.RABBIT, 1, 1))
                }

                // === SPECIAL ANIMALS ===
                keyString.endsWith("entities/panda") -> {
                    tableBuilder.pool(createSimplePool(Items.BAMBOO, 1, 2))
                    tableBuilder.pool(createSimplePool(Items.BEEF, 1, 2))
                }

                keyString.endsWith("entities/goat") -> {
                    tableBuilder.pool(createSimplePool(Items.MUTTON, 1, 2))
                }

                keyString.endsWith("entities/frog") -> {
                    tableBuilder.pool(createSimplePool(Items.SLIME_BALL, 1, 2))
                }

                keyString.endsWith("entities/armadillo") -> {
                    tableBuilder.pool(createSimplePool(Items.ARMADILLO_SCUTE, 1, 2))
                }

                keyString.endsWith("entities/sniffer") -> {
                    tableBuilder.pool(createSimplePool(Items.MOSS_BLOCK, 1, 2))
                }

                keyString.endsWith("entities/allay") -> {
                    tableBuilder.pool(createSimplePool(Items.WIND_CHARGE, 1, 2))
                }

                keyString.endsWith("entities/bat") -> {
                    tableBuilder.pool(createSimplePool(Items.CHICKEN, 1, 1))
                }

                // === NETHER ===
                keyString.endsWith("entities/hoglin") -> {
                    tableBuilder.pool(createSimplePool(Items.LEATHER, 1, 1))
                }
            }
        }
    }

    /**
     * Creates a simple loot pool with a single item drop.
     */
    private fun createSimplePool(item: net.minecraft.world.item.Item, minCount: Int, maxCount: Int): LootPool {
        return if (minCount == maxCount) {
            LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1f))
                .add(
                    LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(minCount.toFloat())))
                )
                .build()
        } else {
            LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1f))
                .add(
                    LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minCount.toFloat(), maxCount.toFloat())))
                )
                .build()
        }
    }
}
