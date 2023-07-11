/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map$Entry
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.TabExecutor
 *  net.md_5.bungee.config.Configuration
 *  s.s.s.d.G
 *  s.s.s.g.C
 *  s.s.s.g.G
 *  s.s.s.g.L
 *  s.s.s.s.C
 *  s.s.s.s.G
 */
package s.s.s.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import net.md_5.bungee.config.Configuration;
import s.s.s.d.G;
import s.s.s.g.L;

public class C
extends Command
implements TabExecutor {
    public C() {
        super(s.s.s.g.C.ALLATORIxDEMO((String)"KzIpKkJ"));
        C a;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void D(ProxiedPlayer proxiedPlayer, String[] stringArray, ProxiedPlayer proxiedPlayer2) {
        ProxiedPlayer a = proxiedPlayer2;
        ProxiedPlayer a2 = proxiedPlayer;
        if (a.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1JkXy_")) || a.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
            void a3;
            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8\u000e")).append(a2.getName()).append(s.s.s.g.C.ALLATORIxDEMO((String)"?\u009ey\u53ee\u7419\u4ebf\u4e21\u629c?\u009e(\u001a")).append((String)a3[1]).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(ProxiedPlayer proxiedPlayer, String[] stringArray, ProxiedPlayer proxiedPlayer2) {
        ProxiedPlayer a = proxiedPlayer2;
        ProxiedPlayer a2 = proxiedPlayer;
        if (a.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1JkXy_")) || a.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
            void a3;
            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8\u000e")).append(a2.getName()).append(s.s.s.g.C.ALLATORIxDEMO((String)"?\u009ey\u593d\u7419\u4ebf\u4e21\u629c?\u009e(\u001a")).append((String)a3[1]).toString());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void execute(CommandSender commandSender, String[] stringArray) {
        void a;
        C c = this;
        if (a instanceof ProxiedPlayer) {
            C a2 = (ProxiedPlayer)a;
            if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1JkXy_")) || a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                void a3;
                String string2 = s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u0014");
                if (((void)a3).length == 0) {
                    int n;
                    int n2;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration2 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    Configuration configuration3 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                    List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    ArrayList arrayList = new ArrayList();
                    int n3 = n2 = 0;
                    while (n3 < list.size()) {
                        if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n2) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017wXq]zUz]")) && !s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n2) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                            arrayList.add(list.get(n2));
                        }
                        n3 = ++n2;
                    }
                    Collections.reverse((List)arrayList);
                    n2 = configuration2.getInt(s.s.s.g.C.ALLATORIxDEMO((String)"ZX|QOXx\\"));
                    if (arrayList.size() <= n2) {
                        int n4;
                        a2.sendMessage(string2);
                        int n5 = n4 = 0;
                        while (n5 < arrayList.size()) {
                            if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                L.D((String)((String)arrayList.get(n4)), (String)a2.getName(), (ProxiedPlayer)a2);
                            } else {
                                L.ALLATORIxDEMO((String)((String)arrayList.get(n4)), (String)a2.getName(), (ProxiedPlayer)a2);
                            }
                            n5 = ++n4;
                        }
                        a2.sendMessage(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e~\b\u00b8K0\u009e~\b"));
                        a2.sendMessage(string2);
                        return;
                    }
                    int n6 = (int)Math.floor((double)(arrayList.size() / n2)) + 1;
                    a2.sendMessage(string2);
                    int n7 = n = arrayList.size() - n2;
                    while (n7 < arrayList.size()) {
                        ArrayList arrayList2 = arrayList;
                        if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                            L.D((String)((String)arrayList2.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                        } else {
                            L.ALLATORIxDEMO((String)((String)arrayList2.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                        }
                        n7 = ++n;
                    }
                    a2.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8X.\u009em\u0016\u00b8X")).append(n6).toString());
                    a2.sendMessage(string2);
                    return;
                }
                if (!(((void)a3).length != 1 || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"~Z|\\oMz]")) || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"MpI")) || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"XsU")) || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"m\\rVi\\")) || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"X|Z|\\oM")) || a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\")))) {
                    ArrayList arrayList;
                    int n;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration4 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    ArrayList arrayList3 = new ArrayList();
                    int n8 = n = 0;
                    while (n8 < list.size()) {
                        if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017wXq]zUz]")) && !s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                            arrayList3.add(list.get(n));
                        }
                        n8 = ++n;
                    }
                    Collections.reverse((List)arrayList3);
                    n = configuration4.getInt(s.s.s.g.C.ALLATORIxDEMO((String)"ZX|QOXx\\"));
                    int n9 = 0;
                    try {
                        n9 = Integer.parseInt((String)a3[0]);
                        arrayList = arrayList3;
                    }
                    catch (Exception exception) {
                        arrayList = arrayList3;
                        a.sendMessage(s.s.s.g.G.ALLATORIxDEMO + s.s.s.g.C.ALLATORIxDEMO((String)"\u009ey\u6b5a\u7871\u7511\u6cca\u0003?\u0016m\\oVmMl\u0019#\u984c\u656f\u0007"));
                    }
                    int n10 = (int)Math.floor((double)(arrayList.size() / n)) + 1;
                    a2.sendMessage(string2);
                    if (n9 > 0 && n9 <= n10) {
                        int n11;
                        int n12 = n9 - 1;
                        int n13 = n11 = n * n12;
                        while (n13 < n9 * n) {
                            if (n11 < arrayList3.size()) {
                                ArrayList arrayList4 = arrayList3;
                                if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                    L.D((String)((String)arrayList4.get(n11)), (String)a2.getName(), (ProxiedPlayer)a2);
                                } else {
                                    L.ALLATORIxDEMO((String)((String)arrayList4.get(n11)), (String)a2.getName(), (ProxiedPlayer)a2);
                                }
                            }
                            n13 = ++n11;
                        }
                        a2.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8X")).append(n9).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009em\u0016\u00b8X")).append(n10).toString());
                        a2.sendMessage(string2);
                        return;
                    }
                    a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009ey\u6002\u986a\u6549\u4e25\u0019\u00b8X")).append(n10).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8_\u986a\u303b")).toString());
                    return;
                }
                if (((void)a3).length == 2 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"~Z|\\oM"))) {
                    int n;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    ArrayList arrayList = new ArrayList();
                    int n14 = n = 0;
                    while (n14 < list.size()) {
                        if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017wXq]zUz]")) && !s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                            arrayList.add(list.get(n));
                        }
                        n14 = ++n;
                    }
                    if (arrayList.contains((Object)a3[1])) {
                        Configuration configuration5;
                        Configuration configuration6 = configuration5 = s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString());
                        configuration6.set(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"), (Object)true);
                        configuration6.set(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_"), (Object)a2.getName());
                        s.s.s.s.G.ALLATORIxDEMO((Configuration)configuration6, (String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString());
                        String string3 = L.D((String)a3[1]);
                        ProxiedPlayer proxiedPlayer = ProxyServer.getInstance().getPlayer(string3);
                        if (proxiedPlayer instanceof ProxiedPlayer) {
                            proxiedPlayer.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8_\u4f7f\u76bd\u4e21\u629c?\u009e(\u001a")).append((String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"?\u009ey\u5dcb\u88b4\u5ddc\u4f43\u4e83\u5447\u53ee\u7419\u303b")).toString());
                        }
                        ProxyServer.getInstance().getPlayers().forEach(arg_0 -> C.D((ProxiedPlayer)a2, (String[])a3, arg_0));
                        return;
                    }
                    a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e|\u8fe0\u4e35\u4e07\u62ba\u5dcb\u88b4\u53ee\u7419\u303b")).toString());
                    return;
                }
                if (((void)a3).length >= 2 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\"))) {
                    int n;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration7 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    Configuration configuration8 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                    Configuration configuration9 = s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString());
                    List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    ArrayList arrayList = new ArrayList();
                    int n15 = n = 0;
                    while (n15 < list.size()) {
                        if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1Q~W{Uz]"))) {
                            arrayList.add(list.get(n));
                        }
                        n15 = ++n;
                    }
                    if (arrayList.contains((Object)a3[1])) {
                        if (s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString()).getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                            void v13;
                            if (!s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString()).getString(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_")).equalsIgnoreCase(a2.getName())) return;
                            Configuration configuration10 = configuration9;
                            configuration10.set(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1Q~W{Uz]"), (Object)true);
                            s.s.s.s.G.ALLATORIxDEMO((Configuration)configuration10, (String)new StringBuilder().insert(0, (String)a3[1]).append(s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")).toString());
                            Configuration configuration11 = configuration8;
                            if (configuration8.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU")).contains((Object)a2.getName())) {
                                n = configuration11.getInt(a2.getName());
                                v13 = a3;
                                Configuration configuration12 = configuration8;
                                configuration12.set(a2.getName(), (Object)(n + 1));
                                s.s.s.s.C.ALLATORIxDEMO((Configuration)configuration12, (String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                            } else {
                                List list2 = configuration11.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                                v13 = a3;
                                list2.add((Object)a2.getName());
                                Configuration configuration13 = configuration8;
                                configuration8.set(a2.getName(), (Object)1);
                                configuration13.set(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"), (Object)list2);
                                s.s.s.s.C.ALLATORIxDEMO((Configuration)configuration13, (String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                            }
                            String string4 = L.D((String)v13[1]);
                            ProxiedPlayer proxiedPlayer = ProxyServer.getInstance().getPlayer(string4);
                            if (proxiedPlayer instanceof ProxiedPlayer) {
                                s.s.s.g.C.ALLATORIxDEMO((ProxiedPlayer)proxiedPlayer, (String)a3[1]);
                            }
                            if (((void)a3).length >= 3) {
                                String string5 = a3[2].replaceAll(s.s.s.g.C.ALLATORIxDEMO((String)"\u0014"), s.s.s.g.C.ALLATORIxDEMO((String)"\u0019"));
                                ProxyServer.getInstance().getPluginManager().dispatchCommand((CommandSender)a2, string5);
                            }
                            ProxyServer.getInstance().getPlayers().forEach(arg_0 -> C.ALLATORIxDEMO((ProxiedPlayer)a2, (String[])a3, arg_0));
                            return;
                        }
                        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e|\u8bce\u5157\u53ee\u7419\u8fe0\u4e35\u4e07\u62ba\u303b")).toString());
                        return;
                    }
                    a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e|\u8fe0\u4e35\u4e07\u62ba\u5dcb\u88b4\u593d\u7419\u303b")).toString());
                    return;
                }
                if (((void)a3).length == 1 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"MpI"))) {
                    int n;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration14 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    Configuration configuration15 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                    HashMap hashMap = new HashMap();
                    configuration15.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU")).forEach(string -> {
                        void a;
                        Object a2 = string;
                        HashMap a3 = hashMap;
                        Object object = a2;
                        a3.put(object, (Object)a.getInt((String)object));
                    });
                    ArrayList arrayList = new ArrayList((Collection)hashMap.entrySet());
                    arrayList.sort((Comparator)new G(c));
                    a2.sendMessage(string2);
                    int n16 = n = 0;
                    while (n16 < arrayList.size()) {
                        int n17 = n + 1;
                        if (configuration15.getInt(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"oVvWk\\{\u0017")).append((String)((Map.Entry)arrayList.get(n)).getKey()).toString()) > 0) {
                            String string6 = configuration15.getString(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"oVvWk\u0017")).append((String)((Map.Entry)arrayList.get(n)).getKey()).toString());
                            try {
                                double d = Double.parseDouble((String)string6);
                                String string7 = "";
                                if (d >= 4.0 && d <= 5.0) {
                                    string7 = new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(b\u00b8X")).append(d).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(d")).toString();
                                }
                                if (d >= 3.0 && d < 4.0) {
                                    string7 = new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(b\u00b8\\")).append(d).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(d")).toString();
                                }
                                if (d >= 2.0 && d < 3.0) {
                                    string7 = new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(b\u00b8\u000f")).append(d).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(d")).toString();
                                }
                                if (d >= 1.0 && d < 2.0) {
                                    string7 = new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(b\u00b8Z")).append(d).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(d")).toString();
                                }
                                if (d >= 0.0 && d < 1.0) {
                                    string7 = new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(b\u00b8\t")).append(d).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e(d")).toString();
                                }
                                a.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009ez\u001a")).append(n17).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append((String)((Map.Entry)arrayList.get(n)).getKey()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019")).append(string7).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append(((Map.Entry)arrayList.get(n)).getValue()).toString());
                            }
                            catch (Exception exception) {
                                a.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009ez\u001a")).append(n17).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append((String)((Map.Entry)arrayList.get(n)).getKey()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append(((Map.Entry)arrayList.get(n)).getValue()).toString());
                            }
                        } else {
                            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u009ez\u001a")).append(n17).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append((String)((Map.Entry)arrayList.get(n)).getKey()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e2\u0019\u00b8\\")).append(((Map.Entry)arrayList.get(n)).getValue()).toString());
                        }
                        n16 = ++n;
                    }
                    a2.sendMessage(string2);
                    return;
                }
                if (((void)a3).length == 1 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"~Z|\\oMz]"))) {
                    int n;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    a2.sendMessage(string2);
                    int n18 = n = 0;
                    while (n18 < list.size()) {
                        Configuration configuration16 = s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(n) + s.s.s.g.C.ALLATORIxDEMO((String)"1@rU")));
                        if (!configuration16.getBoolean(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1Q~W{Uz]")) && configuration16.getString(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_")).equalsIgnoreCase(a2.getName())) {
                            List list3 = list;
                            if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                L.D((String)((String)list3.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                            } else {
                                L.ALLATORIxDEMO((String)((String)list3.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                            }
                        }
                        n18 = ++n;
                    }
                    a2.sendMessage(string2);
                    return;
                }
                if (((void)a3).length == 1 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"))) {
                    int n;
                    List list;
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration17 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    Configuration configuration18 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"MpI1@rU"));
                    List list4 = list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                    Collections.reverse((List)list4);
                    int n19 = configuration17.getInt(s.s.s.g.C.ALLATORIxDEMO((String)"ZX|QOXx\\"));
                    if (list4.size() <= n19) {
                        int n20;
                        a2.sendMessage(string2);
                        int n21 = n20 = 0;
                        while (n21 < list.size()) {
                            List list5 = list;
                            if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                L.D((String)((String)list5.get(n20)), (String)a2.getName(), (ProxiedPlayer)a2);
                            } else {
                                L.ALLATORIxDEMO((String)((String)list5.get(n20)), (String)a2.getName(), (ProxiedPlayer)a2);
                            }
                            n21 = ++n20;
                        }
                        a2.sendMessage(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e~\b\u00b8K0\u009e~\b"));
                        a2.sendMessage(string2);
                        return;
                    }
                    int n22 = (int)Math.floor((double)(list.size() / n19)) + 1;
                    a2.sendMessage(string2);
                    int n23 = n = list.size() - n19;
                    while (n23 < list.size()) {
                        List list6 = list;
                        if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                            L.D((String)((String)list6.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                        } else {
                            L.ALLATORIxDEMO((String)((String)list6.get(n)), (String)a2.getName(), (ProxiedPlayer)a2);
                        }
                        n23 = ++n;
                    }
                    a2.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8X.\u009em\u0016\u00b8X")).append(n22).toString());
                    a2.sendMessage(string2);
                    return;
                }
                if (((void)a3).length == 2 && a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"))) {
                    Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    Configuration configuration19 = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"|Vq_v^1@rU"));
                    try {
                        List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                        int n = configuration19.getInt(s.s.s.g.C.ALLATORIxDEMO((String)"ZX|QOXx\\"));
                        int n24 = Integer.parseInt((String)a3[1]);
                        int n25 = (int)Math.floor((double)(list.size() / n)) + 1;
                        if (n24 > 0 && n24 <= n25) {
                            int n26;
                            int n27 = n24 - 1;
                            int n28 = n26 = n * n27;
                            while (n28 < n24 * n) {
                                if (n26 < list.size()) {
                                    List list7 = list;
                                    if (a2.hasPermission(s.s.s.g.C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                                        L.D((String)((String)list7.get(n26)), (String)a2.getName(), (ProxiedPlayer)a2);
                                    } else {
                                        L.ALLATORIxDEMO((String)((String)list7.get(n26)), (String)a2.getName(), (ProxiedPlayer)a2);
                                    }
                                }
                                n28 = ++n26;
                            }
                            a2.sendMessage(new StringBuilder().insert(0, s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8X")).append(n24).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009em\u0016\u00b8X")).append(n25).toString());
                            a2.sendMessage(string2);
                            return;
                        }
                        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009ey\u6002\u986a\u6549\u4e25\u0019\u00b8X")).append(n25).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0019\u00b8_\u986a\u303b")).toString());
                        return;
                    }
                    catch (Exception exception) {
                        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009ey\u6b5a\u7871\u7511\u6cca\u0003?\u0016m\\oVmMl\u0019~Us\u0019#\u984c\u656f\u0007")).toString());
                        return;
                    }
                }
                if (((void)a3).length != 2 || !a3[0].equalsIgnoreCase(s.s.s.g.C.ALLATORIxDEMO((String)"m\\rVi\\"))) return;
                Configuration configuration = s.s.s.s.C.ALLATORIxDEMO((String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                List list = configuration.getStringList(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"));
                if (list.contains((Object)a3[1])) {
                    list.remove((Object)a3[1]);
                    Configuration configuration20 = configuration;
                    configuration20.set(s.s.s.g.C.ALLATORIxDEMO((String)"XsU"), (Object)list);
                    s.s.s.s.C.ALLATORIxDEMO((Configuration)configuration20, (String)s.s.s.g.C.ALLATORIxDEMO((String)"XsU1@rU"));
                    a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009ey\u5dcb\u523f\u965d\u8bfa\u4e07\u62ba\u303b")).toString());
                    return;
                }
                a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e|\u4e34\u5b47\u5711\u769b\u4e07\u62ba\u303b")).toString());
                return;
            }
            a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u00b8Z\u4f7f\u6c98\u6716\u677a\u964f\u303b")).toString());
            return;
        }
        a.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u009e~\u53d3\u6716\u7390\u5ba9\u53d6\u4efa\u625e\u8853\u8fe0\u677e\u5444\u4efb\u303b")).toString());
    }

    public Iterable<String> onTabComplete(CommandSender commandSender, String[] stringArray) {
        String a;
        C c = this;
        HashSet a2 = new HashSet();
        if (((void)a).length == 1) {
            C a3 = new ArrayList();
            a3.add(s.s.s.g.C.ALLATORIxDEMO((String)"~Z|\\oM"));
            a3.add(s.s.s.g.C.ALLATORIxDEMO((String)"wXq]s\\"));
            a3.add(s.s.s.g.C.ALLATORIxDEMO((String)"MpI"));
            a3.add(s.s.s.g.C.ALLATORIxDEMO((String)"~Z|\\oMz]"));
            a = a[0].toLowerCase();
            a3 = a3.iterator();
            while (a3.hasNext()) {
                String string = (String)a3.next();
                if (!string.startsWith(a)) continue;
                a2.add((Object)string);
            }
        }
        return a2;
    }
}
