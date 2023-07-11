/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.Listener
 *  net.md_5.bungee.api.plugin.Plugin
 *  s.s.s.d.C
 *  s.s.s.d.L
 *  s.s.s.d.M
 *  s.s.s.d.b
 *  s.s.s.d.h
 *  s.s.s.g.C
 *  s.s.s.g.G
 *  s.s.s.g.L
 *  s.s.s.s.C
 *  s.s.s.s.G
 *  s.s.s.z.C
 *  s.s.s.z.G
 */
//Main主类，By yml:main: s.s.s.G+
//指令/reports
//Utf8Nmsl
package s.s.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import s.s.s.d.M;
import s.s.s.d.b;
import s.s.s.d.h;
import s.s.s.g.C;
import s.s.s.g.L;

public final class G
extends Plugin {
    //展示
    public String J = "4.0.0Cracked";
    public HashMap<ProxiedPlayer, Long> g;
    public static G ALLATORIxDEMO;
    
    public void onEnable() {
        G a;
        s.s.s.s.C.ALLATORIxDEMO();
        ProxyServer.getInstance().getConsole().sendMessage(L.ALLATORIxDEMO((String)"\u008a!`!J)N\u00e7K\u0012H0B2Y`\u008aw\u0013\u00e7\u0015~\r\u00e7L\u615f\u8c0f\u60e8\u76a9\u4f3f\u7505\uff4c\u63ff\u4eb6\u5ddf\u5f40\u59e6\u52e0\u8f50n\u0003n"));
        ProxyServer.getInstance().getConsole().sendMessage(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u009e~t~^vZ\u00b8_M\\oVmM?\u009e(\u0007\u00b8\u0001!\u0019\u00b8X\u7257\u6715?\u009em\u0014!\u0019")).append(a.J).toString());
        G g = a;
        G g2 = a;
        G g3 = a;
        g.getProxy().getPluginManager().registerCommand((Plugin)g2, (Command)new b());
        g.getProxy().getPluginManager().registerCommand((Plugin)a, (Command)new s.s.s.d.C());
        g2.getProxy().getPluginManager().registerCommand((Plugin)a, (Command)new s.s.s.d.L());
        g.getProxy().getPluginManager().registerCommand((Plugin)a, (Command)new h());
        g.getProxy().getPluginManager().registerCommand((Plugin)a, (Command)new M());
        g.getProxy().getPluginManager().registerListener((Plugin)a, (Listener)new s.s.s.z.G());
        g.getProxy().getPluginManager().registerListener((Plugin)a, (Listener)new s.s.s.z.C());
        ProxyServer.getInstance().getConsole().sendMessage(L.ALLATORIxDEMO((String)"\u00e7L\rL'D#\u008a&\u007f%]/_4\r\u00e7\u001a~\u008ax\u0013`\u008a!\u63ff\u4eb6\u528d\u8f3d\u5ba1\u6b95\uff21\u791d\u6085\u4f3f\u7505\u6149\u5fc6\uff41"));
        ProxyServer.getInstance().getScheduler().schedule((Plugin)a, () -> ProxyServer.getInstance().getPlayers().forEach(proxiedPlayer -> {
            int a;
            ProxiedPlayer proxiedPlayer2 = proxiedPlayer;
            List list = s.s.s.s.C.ALLATORIxDEMO((String)L.ALLATORIxDEMO((String)"!A,\u00039@,")).getStringList(C.ALLATORIxDEMO((String)"XsU"));
            ArrayList arrayList = new ArrayList();
            int n = a = 0;
            while (n < list.size()) {
                if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(a) + L.ALLATORIxDEMO((String)"\u00039@,"))).getBoolean(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017wXq]zUz]")) && !s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(a) + L.ALLATORIxDEMO((String)"\u00039@,"))).getBoolean(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                    arrayList.add(list.get(a));
                }
                n = ++a;
            }
            if (proxiedPlayer2.hasPermission(L.ALLATORIxDEMO((String)"\u007f%]/_4\u00033Y!K&")) || proxiedPlayer2.hasPermission(C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
                proxiedPlayer2.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(L.ALLATORIxDEMO((String)"\u008a&\u5f7e\u520d\u6724`\u008av")).append(arrayList.size()).append(C.ALLATORIxDEMO((String)"?\u009em\u4e13\u4e21\u629c\u6735\u8892\u53c8\u743f")).toString());
            }
        }), 0L, 15L, TimeUnit.MINUTES);
    }

    public G() {
        G a;
        G g = a;
        a.g = new HashMap();
    }

    public void onDisable() {
        ProxyServer.getInstance().getConsole().sendMessage(C.ALLATORIxDEMO((String)"\u009e~t~^vZ\u00b8_M\\oVmM?\u009e(\u0007\u00b8\u0001!\u0019\u00b8X\u63cd\u4ecf\u6b7c\u5711\u5367\u8f44"));
    }

    public void onLoad() {
        G a;
        ALLATORIxDEMO = a;
    }
}
