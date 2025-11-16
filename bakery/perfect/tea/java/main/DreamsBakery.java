package net.perfect.tea.dreamsbakery

import net.perfect.tea.dreamsbakery;
import net.dreamsbakery.bakery;
import net.perfect.tea.dreamsbakery.openbakery;

public final class Bakery extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("A Padaria foi Aberta!");
        Bukkit.getConsoleSender().sendMessage("A Padaria abriu!");
        // Plugin startup logic

    }

    @Override
    public void onLoad() {
        getLogger().info("Peraí Padeira(o)! Tá carregando!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Padaria fechada com sucesso!")
            Bukkit.getConsoleSender().sendMessage("A Padaria foi fechada!")
    }
}
}

public class OpenBakery {
    long open = OpenBakery.getPlayer().send("Olá {player}! A Padaria está aberta!")
}