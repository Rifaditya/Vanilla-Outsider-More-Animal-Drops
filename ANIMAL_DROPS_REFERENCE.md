# Lazy More Animal Drops - Reference Guide (Minecraft 1.21.11 Java Edition) and Fabric API and if i dont mention it keep it vanila

## 🏷️ Suggested Mod Names

Following the "Lazy" naming theme from your other mods:

| Name | Description | ✅ Pick |
|------|-------------|---------|
| **Lazy More Animal Drops** | Simple, describes what it does | ✅ |
| **Lazy Better Loot** | Focuses on improved loot tables |  |
| **Lazy Enhanced Drops** | Emphasizes enhancements |  |
| **Lazy Animal Bounty** | Suggests more generous drops |  |
| **Lazy Mob Harvest** | Farm/harvest themed |  |

---

## 📋 Complete Entity Drop List (Minecraft 1.21.1)

### 🐄 Passive Farm Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Chicken** | 1 Raw Chicken, 0-2 Feathers | 1 Raw Chicken, 1-2 Feathers |
| **Cow** | 1-3 Raw Beef, 0-2 Leather | 1-3 Raw Beef, 1-2 Leather |
| **Pig** | 1-3 Raw Porkchop | Keep Vanilla |
| **Sheep** | 1 Wool, 1-2 Raw Mutton | Keep Vanilla |
| **Rabbit** | 0-1 Raw Rabbit, 0-1 Hide, 10% Foot | 1 Raw Rabbit, 1 Hide, 10% Foot |
| **Mooshroom** | 1-3 Raw Beef, 0-2 Leather | 1-3 Raw Beef, 1-2 Leather |

**Other Interactions:**

- Chicken: Lays eggs every 5-10 minutes
- Cow/Mooshroom: Milk with bucket
- Mooshroom: Shear for 5 mushrooms
- Sheep: Shear for 1-3 wool

---

### 🐴 Rideable Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Horse** | 0-2 Leather | 1-2 leather, 1-3 raw beef |
| **Donkey** | 0-2 Leather | 1-2 leather, 1-2 raw beef |
| **Mule** | 0-2 Leather | 1-2 leather, 1-3 raw beef |
| **Llama** | 0-2 Leather | 1-2 leather, 1-3 raw beef |
| **Camel** | XP only | 1-2 leather, 1-3 raw beef |

---

### 🐟 Aquatic Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Cod** | 1 Raw Cod | Keep Vanilla |
| **Salmon** | 1 Raw Salmon | Keep Vanilla |
| **Tropical Fish** | 1 Tropical Fish | Keep Vanilla |
| **Pufferfish** | 1 Pufferfish | Keep Vanilla |
| **Squid** | 1-3 Ink Sacs | Keep Vanilla |
| **Glow Squid** | 1-3 Glow Ink Sacs | Keep Vanilla |
| **Dolphin** | 0-1 Raw Cod | 1-3 Raw Cod |
| **Turtle** | 0-2 Seagrass | 1-2 Seagrass |
| **Axolotl** | Nothing | 1 Raw Cod |

---

### 🐺 Tameable/Wild Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Wolf** | Nothing | 1 Raw Beef |
| **Cat** | Nothing | 1 Raw Cod |
| **Ocelot** | Nothing | 1 Raw Cod |
| **Parrot** | Nothing | 1 Raw Chicken, 1-2 Feathers |
| **Fox** | Nothing (may drop held items) | 1 Raw Rabbit |

---

### 🐼 Special Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Panda** | 0-2 Bamboo | 1-2 Bamboo, 1-2 Raw Beef |
| **Goat** | Nothing (horn from ramming) | 1-2 Raw Mutton |
| **Frog** | Nothing (slimeball/froglight) | 1-2 Slimeballs |
| **Armadillo** | Nothing (periodic scute) | 1-2 Armadillo Scutes |
| **Sniffer** | Nothing | 1-2 Moss Blocks |
| **Allay** | Nothing | 1-2 Wind Charges |
| **Bat** | Nothing | 1 Raw Chicken |

---

### 🔥 Nether Animals

| Entity | Default Drops | ✏️ Your Custom Drops |
|--------|---------------|----------------------|
| **Strider** | 2-5 String | Keep Vanilla |
| **Hoglin** | 2-4 Raw Porkchop, 0-2 Leather | 2-4 Raw Porkchop, 1-2 Leather |

---

## 📊 Looting Enchantment Effects

The Looting enchantment increases drop quantities:

| Level | Effect |
|-------|--------|
| Looting I | +1 max drops |
| Looting II | +2 max drops |
| Looting III | +3 max drops |

**Rabbit's Foot:** Base 10% → +3% per level (max 19% with Looting III)

---

## 💡 Mod Ideas for Tweaking

### Possible Enhancements

1. **Add drops to animals with none** (Wolf, Cat, Parrot, etc.) -
2. **Increase base drop quantities** -
3. **Add rare drops** (e.g., Wolf → Fur, Cat → Whisker) No keep the drop vanilla
4. **Add bone drops** to all animals Yes
5. **Scale drops with animal size/age** yes
6. **Add XP to animals that give none** Yes

### Vanilla Loot Table Locations

```
data/minecraft/loot_tables/entities/
├── chicken.json
├── cow.json
├── pig.json
├── sheep.json
├── rabbit.json
└── ... (etc)
```

---

## 🔧 Technical Notes

- **Baby animals** don't drop common loot
- **Fire kills** auto-cook meat drops
- **Player kills only** required for XP
- Loot tables are data-driven in 1.21+
- Use data packs or Fabric API for modifications

---

*Last Updated: December 2025 | Minecraft 1.21.11 Java Edition*
