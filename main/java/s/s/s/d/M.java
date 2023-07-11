/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.TabExecutor
 *  s.s.s.g.C
 *  s.s.s.g.L
 */
package s.s.s.d;

import java.util.HashSet;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import s.s.s.g.C;
import s.s.s.g.L;

public class M
extends Command
implements TabExecutor {
    public void execute(CommandSender commandSender, String[] stringArray) {
        M a = commandSender;
        M a2 = this;
        if (a instanceof ProxiedPlayer) {
            if ((a = (ProxiedPlayer)a).hasPermission(L.ALLATORIxDEMO((String)"\fy\u0010\u00035^%"))) {
                ProxiedPlayer a3;
                if (((void)a3).length == 1) {
                    a3 = ProxyServer.getInstance().getPlayer((String)a3[0]);
                    if (a3 instanceof ProxiedPlayer) {
                        a.connect(a3.getServer().getInfo());
                        return;
                    }
                    a.sendMessage(C.ALLATORIxDEMO((String)"\u00b8[\u00b8U\u5c1e\u79b8\u7ce4\u7ee6?\u009em\u009e'\u0082?\u009em\u6b5d\u73b6\u5b8f\u4e12\u5711\u7ea0\u622f\u4e12\u5b61\u5737\u303b"));
                    return;
                }
                a.sendMessage(L.ALLATORIxDEMO((String)"\u008a\"\u008a,\u5c2c\u79c1\u7cd6\u7e9f\r\u00e7_\u00e7\u0015\u00fb\r\u00e7_\u7568\u6cf8z\roA4]`\u0011\u73e9\u5b9b~"));
                return;
            }
            a.sendMessage(C.ALLATORIxDEMO((String)"\u00b8[\u00b8U\u5c1e\u79b8\u7ce4\u7ee6?\u009em\u009e'\u0082?\u009em\u6091\u6cbe\u6730\u675c\u9669\u6278\u8875\u6b7b\u5444\u4efb\u303b"));
        }
    }

    public M() {
        super(C.ALLATORIxDEMO((String)"KzIpKkUkI"));
        M a;
    }

    public Iterable<String> onTabComplete(CommandSender commandSender, String[] stringArray) {
        Object a = stringArray;
        String[] a2 = this;
        HashSet a3 = new HashSet();
        if (((String[])a).length == 1) {
            a = a[0].toLowerCase();
            for (ProxiedPlayer proxiedPlayer : ProxyServer.getInstance().getPlayers()) {
                if (!proxiedPlayer.getName().toLowerCase().startsWith((String)a)) continue;
                a3.add((Object)proxiedPlayer.getName());
            }
        }
        return a3;
    }
}
