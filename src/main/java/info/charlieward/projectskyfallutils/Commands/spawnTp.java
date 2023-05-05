package info.charlieward.projectskyfallutils.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class spawnTp implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        Location spawn = new Location(Bukkit.getWorld("tester_world"),-538,72,-274, 0, 0);

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.teleport(spawn);
        }

        return true;
    }
}
