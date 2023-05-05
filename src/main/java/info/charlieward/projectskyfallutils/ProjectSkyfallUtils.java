package info.charlieward.projectskyfallutils;

import info.charlieward.projectskyfallutils.Commands.spawnTp;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProjectSkyfallUtils extends JavaPlugin {

    public static ProjectSkyfallUtils plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getCommand("spawn").setExecutor(new spawnTp());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ProjectSkyfallUtils getPlugin(){
        return plugin;
    }
}
