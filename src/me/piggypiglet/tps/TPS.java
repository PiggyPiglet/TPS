package me.piggypiglet.tps;

import de.Herbystar.TTA.TTA_Methods;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

import org.bukkit.entity.Player;

public class TPS extends PlaceholderExpansion {

    public boolean canRegister() {
        return true;
    }
    public String getIdentifier() {
        return "tps";
    }
    public String getPlugin() {
        return null;
    }
    public String getAuthor() {
        return "PiggyPiglet";
    }
    public String getVersion() {
        return "1.0.0";
    }

    public String onPlaceholderRequest(Player p, String identifier) {
        if (identifier.equals("tps")) {
            double tps = (double) Math.round(TTA_Methods.getTPS(100) * 100.0) / 100.0;
            return String.valueOf(tps);
        }
        return null;
    }
}
