/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 *  net.luckperms.api.LuckPermsProvider
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.TabExecutor
 *  net.md_5.bungee.config.Configuration
 *  s.s.s.G
 *  s.s.s.g.C
 *  s.s.s.g.G
 *  s.s.s.g.L
 *  s.s.s.s.C
 *  s.s.s.s.G
 */
package s.s.s.d;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.luckperms.api.LuckPermsProvider;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import net.md_5.bungee.config.Configuration;
import s.s.s.G;
import s.s.s.g.C;
import s.s.s.g.L;

public class b
extends Command
implements TabExecutor {
    public static String ALLATORIxDEMO(int n) {
        int n2;
        int n3 = n;
        String[] a = C.ALLATORIxDEMO((String)"~[|]z_xQvStUrWpInKlMjOhAfC");
        a = new StringBuilder().insert(0, a.toUpperCase()).append(L.ALLATORIxDEMO((String)"\u001dq\u001fs\u0019u\u001bw\u0015y")).toString().split("");
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int n4 = n2 = 0;
        while (n4 < n3 + 1) {
            stringBuilder.append(a[random.nextInt(a.length)]);
            n4 = ++n2;
        }
        return stringBuilder.toString();
    }

    public b() {
        b a;
        String[] stringArray = new String[6];
        stringArray[0] = L.ALLATORIxDEMO((String)"7I2");
        stringArray[1] = C.ALLATORIxDEMO((String)"hXkZw]p^m\\oVmM");
        stringArray[2] = L.ALLATORIxDEMO((String)"-L'D#_%]/_4");
        stringArray[3] = C.ALLATORIxDEMO((String)"\u4e21\u629c");
        stringArray[4] = L.ALLATORIxDEMO((String)"\u774b\u95c5\u7297");
        stringArray[5] = C.ALLATORIxDEMO((String)"\u7732\u95f7\u72ee\u4e21\u629c");
        super(C.ALLATORIxDEMO((String)"m\\oVmM"), "", stringArray);
    }

    public Iterable<String> onTabComplete(CommandSender commandSender, String[] stringArray) {
        Object a = stringArray;
        String[] a2 = this;
        HashSet hashSet = new HashSet();
        if (((String[])a).length == 1) {
            Iterator a3;
            a = a[0].toLowerCase();
            ProxiedPlayer cfr_ignored_0 = (ProxiedPlayer)a3;
            for (ProxiedPlayer proxiedPlayer : ProxyServer.getInstance().getPlayers()) {
                if (!proxiedPlayer.getName().toLowerCase().startsWith((String)a)) continue;
                hashSet.add((Object)proxiedPlayer.getName());
            }
        }
        return hashSet;
    }

    /*
     * WARNING - void declaration
     */
    public void execute(CommandSender commandSender, String[] stringArray) {
        void a;
        b b2 = this;
        if (a instanceof ProxiedPlayer) {
            ProxiedPlayer proxiedPlayer2 = (ProxiedPlayer)a;
            if (proxiedPlayer2.hasPermission(L.ALLATORIxDEMO((String)"\u007f%]/_4\u00035^%"))) {
                void a2;
                if (((void)a2).length == 2) {
                    ProxiedPlayer proxiedPlayer3 = ProxyServer.getInstance().getPlayer((String)a2[0]);
                    if (G.ALLATORIxDEMO.g.containsKey((Object)proxiedPlayer2) && (Long)G.ALLATORIxDEMO.g.get((Object)proxiedPlayer2) <= System.currentTimeMillis() || !G.ALLATORIxDEMO.g.containsKey((Object)proxiedPlayer2)) {
                        if (proxiedPlayer3 instanceof ProxiedPlayer) {
                            G.ALLATORIxDEMO.g.put((Object)proxiedPlayer2, (Object)(System.currentTimeMillis() + 10000L));
                            if (!a2[0].equalsIgnoreCase(proxiedPlayer2.getName())) {
                                void var5_7 = a2[1];
                                String string = b.ALLATORIxDEMO(s.s.s.s.C.ALLATORIxDEMO((String)C.ALLATORIxDEMO((String)"|Vq_v^1@rU")).getInt(L.ALLATORIxDEMO((String)"d$~)W%")));
                                s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, string).append(C.ALLATORIxDEMO((String)"1@rU")).toString());
                                b a222 = s.s.s.s.C.ALLATORIxDEMO((String)L.ALLATORIxDEMO((String)"!A,\u00039@,"));
                                List list = a222.getStringList(C.ALLATORIxDEMO((String)"XsU"));
                                list.add((Object)string);
                                b b3 = a222;
                                b3.set(L.ALLATORIxDEMO((String)"!A,"), list);
                                s.s.s.s.C.ALLATORIxDEMO((Configuration)b3, (String)C.ALLATORIxDEMO((String)"XsU1@rU"));
                                b b4 = a222 = s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, string).append(L.ALLATORIxDEMO((String)"\u00039@,")).toString());
                                b b5 = a222;
                                b b6 = a222;
                                a222.set(C.ALLATORIxDEMO((String)"Q~Zt\\mfoKz_vA"), LuckPermsProvider.get().getUserManager().getUser(proxiedPlayer3.getDisplayName()).getCachedData().getMetaData().getPrefix().replaceAll(L.ALLATORIxDEMO((String)"f"), C.ALLATORIxDEMO((String)"\u009e")));
                                b6.set(L.ALLATORIxDEMO((String)"_%]/_4H2"), proxiedPlayer2.getName());
                                b6.set(C.ALLATORIxDEMO((String)"KzIpKk\\mfoKz_vA"), LuckPermsProvider.get().getUserManager().getUser(proxiedPlayer2.getDisplayName()).getCachedData().getMetaData().getPrefix().replaceAll(L.ALLATORIxDEMO((String)"f"), C.ALLATORIxDEMO((String)"\u009e")));
                                b5.set(L.ALLATORIxDEMO((String)"E!N+H2"), proxiedPlayer3.getName());
                                b5.set(C.ALLATORIxDEMO((String)"m\\~JpW"), var5_7);
                                b4.set(L.ALLATORIxDEMO((String)"D$"), string);
                                a222.set(C.ALLATORIxDEMO((String)"l\\mOzK"), proxiedPlayer3.getServer().getInfo().getName());
                                list = new SimpleDateFormat(L.ALLATORIxDEMO((String)"T9T9\u0000\r`mI$"));
                                b4.set(C.ALLATORIxDEMO((String)"kPr\\"), list.format((Object)System.currentTimeMillis()));
                                a222.set(L.ALLATORIxDEMO((String)"(L.I,HnE!C$H,H$"), false);
                                a222.set(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"), false);
                                b b7 = a222;
                                s.s.s.s.G.ALLATORIxDEMO((Configuration)a222, (String)(string + L.ALLATORIxDEMO((String)"\u00039@,")));
                                b b8 = a222 = s.s.s.s.C.ALLATORIxDEMO((String)C.ALLATORIxDEMO((String)"Mp]~@1@rU"));
                                int a222 = b8.getInt(new StringBuilder().insert(0, list.format((Object)System.currentTimeMillis())).append(L.ALLATORIxDEMO((String)"n")).append(proxiedPlayer3.getName()).toString()) + 1;
                                b8.set(new StringBuilder().insert(0, list.format((Object)System.currentTimeMillis())).append(C.ALLATORIxDEMO((String)"\u0017")).append(proxiedPlayer3.getName()).toString(), a222);
                                s.s.s.s.C.ALLATORIxDEMO((Configuration)b8, (String)L.ALLATORIxDEMO((String)"4B$L9\u00039@,"));
                                a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(C.ALLATORIxDEMO((String)"\u4f59\u4e21\u629c\u4e99\u0019\u00b8\u000e")).append((String)a2[0]).append(L.ALLATORIxDEMO((String)"`\u008a&\u742b\u7571\u0017`\u008aw")).append((String)a2[1]).append(C.ALLATORIxDEMO((String)"?\u009ey\u0015?\u009e(\u001a")).append(string).toString());
                                ProxyServer.getInstance().getPlayers().forEach(proxiedPlayer -> {
                                    String a = proxiedPlayer;
                                    String a2 = string;
                                    if (a.hasPermission(C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                        L.D((String)a2, (String)a.getName(), (ProxiedPlayer)a);
                                        return;
                                    }
                                    if (a.hasPermission(L.ALLATORIxDEMO((String)"\u007f%]/_4\u00033Y!K&"))) {
                                        L.ALLATORIxDEMO((String)a2, (String)a.getName(), (ProxiedPlayer)a);
                                    }
                                });
                                return;
                            }
                            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(L.ALLATORIxDEMO((String)"\u4f20\u4e20\u53af\u4ec8\u4e7e\u6288\u81aa\u5ddca")).toString());
                            return;
                        }
                        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(C.ALLATORIxDEMO((String)"\u8fe0\u4e35\u7390\u5ba9\u4e34\u5737\u7e86")).toString());
                        return;
                    }
                    int n = (int)((Long)G.ALLATORIxDEMO.g.get((Object)proxiedPlayer2) - System.currentTimeMillis()) / 1000;
                    a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(L.ALLATORIxDEMO((String)"\u008a&\u8bda\u7b09\u5fa8`\u008av")).append(n).append(C.ALLATORIxDEMO((String)"\u79cd\u0019\u00b8_\u5411\u51b4\u8bca\u303b")).toString());
                    return;
                }
                a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(L.ALLATORIxDEMO((String)"\u00e7N\u7568\u6cf8z\ro_%]/_4\r|\u7384\u5bf6\u0013`\u0011\u7446\u751c~")).toString());
                return;
            }
            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(C.ALLATORIxDEMO((String)"\u00b8Z\u4f7f\u6c98\u6716\u677a\u964f\u303b")).toString());
            return;
        }
        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(L.ALLATORIxDEMO((String)"\u00e7L\u53aa\u6724\u73e9\u5b9b\u53af\u4ec8\u6227\u8861\u8f99\u674c\u543d\u4ec9\u3042")).toString());
    }
}
