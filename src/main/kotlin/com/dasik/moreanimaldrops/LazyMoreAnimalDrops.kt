package com.dasik.moreanimaldrops

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object LazyMoreAnimalDrops : ModInitializer {
    private val logger = LoggerFactory.getLogger("vanilla-outsider-more-animal-drops")

    override fun onInitialize() {
        LootTableModifier.register()
        logger.info("Vanilla Outsider: More Animal Drops loaded! Animals will now drop more loot.")
    }
}
