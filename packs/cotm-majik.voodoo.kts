@file:GenerateMods(name = "Mod", mc = "1.12.2")
@file:GenerateMods(name = "Mod", mc = "1.12.1")
@file:GenerateMods(name = "Mod", mc = "1.12")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.2")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.1")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12")
@file:GenerateForge(name = "Forge", mc = "1.12.2")

mcVersion = "1.12.2"
title = "CotM-Majik"
authors = listOf("AnsuzThuriaz")
version = "0.3.8-testing"
forge = Forge.mc1_12_2.forge_14_23_5_2847
icon = rootDir.resolve("icon.png")
pack {
    skcraft {
        userFiles = UserFiles(
                include = listOf(
                        "options.txt"
                ),
                exclude = listOf("")
        )
    }
}

pack {
    multimc {
        skPackUrl = "https://centerofthemultiverse.net/launcher/cotm-majik.json"
    }
}
root(CurseProvider) {
    releaseTypes = setOf(FileType.Release, FileType.Beta, FileType.Alpha)
    validMcVersions = setOf("1.12.2", "1.12.1", "1.12")
    list {

        // Vazkii
        +(Mod.akashicTome)
        +(Mod.botania)
        +(Mod.psi)
        +(Mod.quark)
        (+Mod.quarkOddities)
        +(Mod.morphOTool)

        // Sangar
        +(Mod.architect)
        +(Mod.bedrockores)

        // HellFirePvP
        +(Mod.astralSorcery)

        // Nuchaz
        +(Mod.bibliocraft)

        // chiselTeam
        +(Mod.chisel)

        // AlgorithmX2
        +(Mod.chiselsBits)

        // jaredlll08
        +(Mod.clumps)

        // TheIllusiveC4
        +(Mod.comforts)

        // BlayTheNinth
        +(Mod.cookingForBlockheads)
        +(Mod.farmingForBlockheads)

        // ZLainSama
        +(Mod.cosmeticArmorReworked)

        // copygirl
        +(Mod.wearableBackpacks)

        // mezz
        +(Mod.jei)

        // Benimatic
        +(Mod.theTwilightForest)

        // The_Wabbit
        +(Mod.upsizerMod)

        // Viesis
        +(Mod.viescraftAirships)

        // Subaraki
        +(Mod.paintings)

        // azanor
        +(Mod.thaumcraft)
        +(Mod.baubles)

        // TheRandomLabs
        +(Mod.randomtweaks)
        +(Mod.randompatches)

        // asie
        +(Mod.charsetLib)
        +(Mod.charsetTweaks)
        +(Mod.charsetBlockCarrying)
        +(Mod.charsetCrafting)
        +(Mod.charsetAudio)
        +(Mod.charsetTools)
        +(Mod.charsetpatches)
        +(Mod.charsetImmersion)
        +(Mod.foamfixForMinecraft)
        +(Mod.unlimitedChiselWorks)
        +(Mod.preston)

        +(Mod.enderStorage18)
        +(Mod.extraBitManipulation)
        +(Mod.fairyLights)
        +(Mod.ftbUtilities)
        +(Mod.ftblib)
        +(Mod.initialInventory)
        +(Mod.inventoryTweaks)
        +(Mod.metalchests)
        +(Mod.redstonePaste)
        +(Mod.mmmmmmmmmmmm)
        +(Mod.kleeslabs)
        +(Mod.malisisdoors)
        +(Mod.naturesCompass)
        +(Mod.netherex)
        +(Mod.netherportalfix)
        +(Mod.stimmedcowNomorerecipeconflict)
        +(Mod.notenoughids)
        +(Mod.openblocks)
        +(Mod.pamsHarvestcraft)
        +(Mod.passthroughSigns)
        +(Mod.randomThings)
        +(Mod.redstoneFlux)
        +(Mod.roguelikeDungeons)
        +(Mod.roots)
        +(Mod.simpleSponge)
        +(Mod.spartanShields)
        +(Mod.storageDrawers)
        +(Mod.storageDrawersExtras)
        +(Mod.tails)
        +(Mod.tinkersConstruct)
        +(Mod.tinkersToolLeveling)
        +(Mod.toolBelt)
        +(Mod.torchmaster)
        +(Mod.quickLeafDecay)
        +(Mod.bloodMagic)
        +(Mod.constructsArmory)
        +(Mod.yoyos)
        +(Mod.badWitherNoCookieReloaded)
        +(Mod.waystones)
        +(Mod.theAether)
        +(Mod.thaumcraftInventoryScanning)
        +(Mod.peckish)
        +(Mod.electroblobsWizardry)
        +(Mod.reliquaryV13)
        +(Mod.fastworkbench)
        +(Mod.fastfurnace)
        +(Mod.dimensionaldoors)
        +(Mod.betterBuildersWands)
        +(Mod.loginShield)
        +(Mod.caliper)
        +(Mod.flopper)
        +(Mod.wallJump)
        +(Mod.magicalMap)
        +(Mod.pewter)
        +(Mod.grapplingHookMod)
        +(Mod.embersRekindled)
        +(Mod.outfox)
        +(Mod.chococraft3)
        +(Mod.surge)
        +(Mod.armoryExpansion)
        +(Mod.huntingDimension)
        +(Mod.doggyTalents)
        +(Mod.lootbags)
        +(Mod.snad)
        +(Mod.compactdrawers)
        +(Mod.blockcraftery)
        +(Mod.colytra)
        +(Mod.cathedral)
        +(Mod.architecturecraftTridev)
        +(Mod.futureMc)
        +(Mod.theLostCities)
        +(Mod.evilcraft)
        +(Mod.abyssalcraft)
        +(Mod.abyssalcraftIntegration)
        +(Mod.angelOfVengeance)
        +(Mod.grimoireOfGaia)
        +(Mod.wizardryMod)
        +(Mod.rustic)
        +(Mod.angryPixelTheBetweenlandsMod)
        +(Mod.biomesOPlenty)
        +(Mod.magicalPsi)
        +(Mod.theBeneath)
        +(Mod.bloodArsenal)
        +(Mod.culinaryConstruct)
        +(Mod.wings)
        +(Mod.theErebus)
        +(Mod.hwyla)
        +(Mod.wawlaWhatAreWeLookingAt)
        +(Mod.dm2)
        +(Mod.smoothbedrock)
        +(Mod.natura)
        +(Mod.animania)
        +(Mod.apotheosis)
        +(Mod.aiImprovements)
        +(Mod.atum)
        +(Mod.charm)
        +(Mod.roost)
        +(Mod.simpleVoidWorld)
        +(Mod.baseMetals)
        +(Mod.denseMetals)
        +(Mod.endMetals)
        +(Mod.netherMetals)
        +(Mod.earthworks)
        +(Mod.villagerMarket)
        +(Mod.recurrentComplex)
        +(Mod.arcaneArchives)
        +(Mod.bewitchment)
        +(Mod.timberjack)
        +(Mod.bedPatch)
        +(Mod.culinaryConstruct)
        +(Mod.mobGrindingUtils)
        +(Mod.plustic)
        +(Mod.maxPotionIdExtender)
        +(Mod.cyclic)
        +(Mod.spiceOfLifeCarrotEdition)
        +(Mod.dm2)
        +(Mod.projectIntelligence)
        +(Mod.customMainMenu)
        +(Mod.shadowfactsForgelin)
        +(Mod.hardcoreQuestingMode)
        +(Mod.bedPatch)
        +(Mod.minetweakerRecipemaker)
        +(Mod.crafttweaker)
        +(Mod.modtweaker)
        +(Mod.tweakersConstruct)
        +(Mod.dragonDropsElytra)
        +(Mod.clockworkPhase)
        +(Mod.bonsaiTrees)
        +(Mod.incorporeal)
        +(Mod.mrcrayfishFurnitureMod)
        +(Mod.chestTransporter)
        +(Mod.mysticalGears)
        +(Mod.mysticalmechanics)

        withProvider(DirectProvider).list {
            +"Nutrition" configure {
                url = "https://github.com/WesCook/Nutrition/releases/download/v4.4.0/Nutrition-1.12.2-4.4.0.jar"
            }
        }

        // Unstable Dependancies
        +(Mod.bookshelf)
        +(Mod.placebo)
        +(Mod.shadowfactsForgelin)

        // Pre-Testing / Un-used
        // +(Mod.inControl)
        // +(Mod.justEnoughDimensions)
        // +(Mod.customMainMenu)

        // Pulled due to outstanding issues

        withProvider(JenkinsProvider) {
            jenkinsUrl = "https://ci.elytradev.com"
        }.list {
            // b0undrybreaker
            +"friendship-bracelet" job "elytra/FriendshipBracelet/master"

            // Falkreon
            +"magic-arsenal" job "elytra/MagicArsenal/master"

            // unascribed
            +"glass-hearts" job "elytra/GlassHearts/1.12.1"
        }

        group {
            side = Side.SERVER
        }.list {
            +(Mod.btfuContinuousRsyncIncrementalBackup)
            +(Mod.swingthroughgrass)
            +(Mod.colorchat)

            withProvider(JenkinsProvider) {
                jenkinsUrl = "https://ci.elytradev.com"
            }.list {
                +"matterlink" job "elytra/MatterLink/master"
            }
        }

        group {
            side = Side.BOTH
            optional {
                selected = false
            }

        }.list {

            +(Mod.laggoggles) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.sampler) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.openeye) configure {
                description =
                        "Automatically collects and submits crash reports. Enable if asked or wish to help sort issues with the pack."
            }
        }

        group {
            side = Side.CLIENT
        }.list {
            +(Mod.toastControl)
            +(Mod.jeiIntegration)
            +(Mod.appleskin)
            +(Mod.betterfps)
            +(Mod.nonausea)
            +(Mod.betterPlacement)
            +(Mod.controlling)
            +(Mod.defaultOptions)
            +(Mod.fullscreenWindowedBorderlessForMinecraft)
            +(Mod.modNameTooltip)
            +(Mod.reauth)
            +(Mod.cleanview)
            +(Mod.craftingTweaks)
            +(Mod.betterAdvancements)
            +(Mod.tinkersJei)
            +(Mod.noRecipeBook)
            +(Mod.ctm)
            +(Mod.antighost)
            +(Mod.wailaHarvestability)
            +(Mod.soot)

            // OPT-OUT
            group {
                optional {
                    selected = true
                    skRecommendation = Recommendation.starred
                }
            }.list {

                +(Mod.journeymap) configure {
                    description = "Mod-compatible mini-map."
                }

                +(Mod.mage) configure {
                    description = "Configurable graphics enhancements. Highly recomended."
                }

                +(Mod.neat) configure {
                    description = "Simple health and unit frames."
                }

                +(Mod.clientTweaks) configure {
                    description = "Various client related fixes and tweaks, all in a handy menu."
                }

                +(Mod.mouseTweaks) configure {
                    description = "Add extra mouse gestures for inventories and crafting grids."
                }

                +(Mod.smoothFont) configure {
                    description = "It smoothes fonts."
                }

                +(Mod.inventoryTweaks) configure {
                    description = "Adds amll changes to invetory handling to minor conviniences."
                }

                +(Mod.customFov) configure {
                    description = "Removes dynamic FOV shifting due to ingame effects."
                }
            }

            // OPT-IN
            group {
                optional {
                    selected = false
                }
            }.list {

                +(Mod.betterFoliage) configure {
                    description = "Improves the flora in the world. Very heavy, but very pretty. (Sane defaults set.)"
                }

                +(Mod.thaumicJei) configure {
                    description = "JEI Integration for Thaumcraft."
                }

                +(Mod.justEnoughHarvestcraft) configure {
                    description = "JEI Integration for Pam's HarvestCraft."
                }

                +(Mod.justEnoughResourcesJer) configure {
                    description = "JEI Integration that gives drop-rates for mobs, dungeon loot, etc."
                }

                +(Mod.itemScroller) configure {
                    description = "Alternative to MouseTweaks."
                }

                +(Mod.xaerosMinimap) configure {
                    description = "Alternative to Journeymap."
                }

                +(Mod.minemenu) configure {
                    description =
                            "Radial menu that can be used for command/keyboard shortcuts. Some keybinds cannot be added to radial menu."
                }

                +(Mod.itemzoom) configure {
                    description = "Enable this if you like to get a closer look at item textures."
                }

                +(Mod.lightLevelOverlayReloaded) configure {
                    description = "Smol light-level overlay if you aren't using Dynamic Surroundings."
                }

                +(Mod.durabilityShow) configure {
                    description = "Toggle-able item/tool/armor durability HUD. Duplicates with RPG-HUD."
                }

                +(Mod.fancyBlockParticles) configure {
                    description =
                            "Caution: Resource heavy. Adds some flair to particle effects and animations. Highly configurable, costs fps."
                }

                +(Mod.dynamicSurroundings) configure {
                    description =
                            "Caution: Resource heavy. Lots of configurable features that add immersive sound/visual effects. Includes light-level overlay."
                }

                +(Mod.chunkAnimator) configure {
                    description = "Configurable chunk pop-in animator."
                }

                +(Mod.fasterLadderClimbing) configure {
                    description = "Helps you control ladder climb speed and allows you to go a bit faster."
                }

                // Resource packs
                +TexturePack.unity configure {
                    fileName = "Unity.zip"
                    description = "Multi-mod compatible resource pack."
                }

                withProvider(DirectProvider).list {
                    +"Slice" configure {
                        description = "Custom client font based off of Chicago. Made by Falkreon."
                        folder = "resourcepacks"
                        url = "https://centerofthemultiverse.net/launcher/mirror/Slice.zip"
                    }
                }
            }
        }
    }
}