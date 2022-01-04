package com.zoider.zeta
import com.zoider.zeta.items.MusicDiscHSItem
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.client.sound.Sound
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.MusicDiscItem
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.minecraft.util.registry.Registry;

@Suppress("UNUSED")
object Zeta: ModInitializer {
    private const val MOD_ID = "zeta"

    private val HS_MUSIC_ID = Identifier("zeta:hs_music")

    val HS_MUSIC_EVENT: SoundEvent = SoundEvent(HS_MUSIC_ID)
    val MUSIC_DISC_HS: Item = MusicDiscHSItem(12, SoundEvent(HS_MUSIC_ID), FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC))

    override fun onInitialize() {
        Registry.register(Registry.SOUND_EVENT, Zeta.HS_MUSIC_ID, HS_MUSIC_EVENT)

        Registry.register(Registry.ITEM, Identifier("zeta", "music_disc_hs"), MUSIC_DISC_HS)
    }
}