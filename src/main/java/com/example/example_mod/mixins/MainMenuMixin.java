package com.example.example_mod.mixins;

import com.example.example_mod.ExampleMod;
import finalforeach.cosmicreach.gamestates.MainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MainMenu.class)
public class MainMenuMixin {
    @Inject(method = "create", at = @At("HEAD"))
    private void injected(CallbackInfo ci) {
        ExampleMod.LOGGER.info("Example mixin logged!");
    }
}
