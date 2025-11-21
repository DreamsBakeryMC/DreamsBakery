// ************************************** //
// DreamsBakeryLauncher                   //
// ////////////////////////////////////// //

package net.perfect.tea.dreamsbakery.launcher;

import net.perfect.tea.dreamsbakery.launcher.start;
import net.perfect.tea.dreamsbakery.launcher;

public class DreamsBakeryLauncher {
    public static void(String[] args()) {

        // Save configurationFile //
        var configurationFile = File(System.getProperty("yml") ?: "./dreamsbakery.yml");

        // Start if the configurationFile exists //
        if (!configurationFile.exists()) {
            System.out.println("Welcome to DreamsBakery :3");
            System.out.println("");
            System.out.println("I want to see a smile on people's faces, and I know that's what we're going to achieve with this bakery!");
            System.out.println("");
            System.out.println("But, you have to configurate me!")
            System.out.println("And I haven't introduced myself yet, have I? My name is Claudio the Baker, and so, I created a file called \"dreamsbakery.yml\" that has a lot of things about the bakery.");
            System.out.println("After configuring the file, run me again!");
        }

        // But, if the configurationFile don't exists = restart the  DreamsBakery Server. //
        if (!configurationFile.not.exists()) {
            System.out.println("Hey!! The Configuration File don't exists! i will restart!");
            System.out.println("Create the file \"dreamsbakery.yml\" fast!");
            dreamsbakery.plugin.restart();
        }
    }

}
