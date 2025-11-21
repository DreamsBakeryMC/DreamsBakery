package net.perfect.tea.dreamsbakery;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

import net.dreamsbakery.mc.main.dreamsbakerymc;



public final class dreamsbakery extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Anti-Troca de nome do plugin no plugin.yml
        naoroube = getServer().getPluginManager().getPlugin("NaoTroque".replace("Na", "Tr").replace("Ok", "qu").replace("o", "e"));
        if (bluemoedas == null) {
            getLogger().log(Level.SEVERE, "Não, você não pode editar o nome deste plugin!");
            getServer().getPluginManager().disablePlugin(this);
            return;


            Bukkit.getConsoleSender().sendMessage("Iniciando DreamsBakery...");
        }

        File file = new File(getDataFolder(), "conf_template.yml");
        file2.renameTo(new File(getDataFolder(), "config.yml"));

        // Crie a Config.yml se ela não existir
        File file = new File(getDataFolder(), "config.yml");
        if (!file.exists()) {
            try
            {
                saveResource("config_template.yml", false);
                File file2 = new File(getDataFolder(), "config_template.yml");
                file2.renameTo(new File(getDataFolder(), "dreamsbakery.yml"));
            }
            catch (Exception localException1) {}
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getConsoleSender().sendMessage("A Padaria foi Fechada!")
    }
}