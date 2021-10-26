package me.bristermitten.mittenlibtest;

import com.google.inject.Injector;
import me.bristermitten.mittenlib.MittenLib;
import org.bukkit.plugin.java.JavaPlugin;

public final class MittenLibTest extends JavaPlugin {

    @Override
    public void onEnable() {
        final Injector injector = MittenLib
                .withDefaults(this)
                .addConfigModules(Config.CONFIG)
                .build();

        System.out.println(
                injector.getInstance(Config.class)
                        .welcomeMessage());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
