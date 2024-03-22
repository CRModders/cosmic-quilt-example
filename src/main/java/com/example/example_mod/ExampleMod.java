package com.example.example_mod;

import org.coolcosmos.cosmicquilt.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		System.out.println("Example Mod Initialized!");
	}
}

