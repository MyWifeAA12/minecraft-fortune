package com.MWAA12.fortune;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class fortunecommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use that command");
            return true;
        }
        Player player = (Player) commandSender;
        if (command.getName().equalsIgnoreCase("fortune")){
            List choices = new ArrayList();
            choices.add("§5Your Fortune: Reply hazy, try again");
            choices.add("§4Your Fortune: Excellent Luck");
            choices.add("§cYour Fortune: Good Luck");
            choices.add("§6Your Fortune: Average Luck");
            choices.add("§aYour Fortune: Bad Luck");
            choices.add("§2Your Fortune: Good news will come to you by mail");
            choices.add("§2Your Fortune: （  `_ゝ`）ﾌｰﾝ ");
            choices.add("§bYour Fortune: ｷﾀ━━━━━━(ﾟ∀ﾟ)━━━━━━ !!!! ");
            choices.add("§3Your Fortune: You will meet a dark handsome stranger");
            choices.add("§1Your Fortune: Better not tell you now");
            choices.add("§9Your Fortune: Outlook good");
            choices.add("§dYour Fortune: Very Bad Luck");
            choices.add("§5Your Fortune: Godly Luck");

            Random rand = new Random();
            int n = rand.nextInt(13);
            player.chat((String) choices.get(n));

        }
        return true;


    }
}
