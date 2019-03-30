package main.java.pro.gamerexde.bot;

import main.java.pro.gamerexde.bot.Events.JoinEvent;
import main.java.pro.gamerexde.bot.Events.LeaveEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

/**Created by Gamerexde**/
/**https://github.com/Gamerexde**/
/**-------------------------------*/
/**Enjoy!**/

public final class Main {

    /**Put your Bot Auth Token Here**/
    private static String TOKEN="YOUR_TOKEN_HERE";

    public static void main(String args[]) throws Exception {

        JDA jda = new JDABuilder(TOKEN).build();

        /**Event Listeners of the events**/
        jda.addEventListener(new JoinEvent());
        jda.addEventListener(new LeaveEvent());
    }

}