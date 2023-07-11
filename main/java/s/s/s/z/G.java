/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.PostLoginEvent
 *  net.md_5.bungee.api.plugin.Listener
 *  net.md_5.bungee.event.EventHandler
 *  s.s.s.g.C
 *  s.s.s.g.G
 *  s.s.s.s.C
 *  s.s.s.s.G
 */
package s.s.s.z;

import java.util.ArrayList;
import java.util.List;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import s.s.s.g.C;

public class G
implements Listener {
    @EventHandler
    public void a(PostLoginEvent postLoginEvent) {
        int a;
        ProxiedPlayer a2;
        G g = this;
        a2 = a2.getPlayer();
        List list = s.s.s.s.C.ALLATORIxDEMO((String)C.ALLATORIxDEMO((String)"XsU1@rU")).getStringList(C.ALLATORIxDEMO((String)"XsU"));
        ArrayList arrayList = new ArrayList();
        int n = a = 0;
        while (n < list.size()) {
            if (!s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(a) + C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017wXq]zUz]")) && !s.s.s.s.G.ALLATORIxDEMO((String)((String)list.get(a) + C.ALLATORIxDEMO((String)"1@rU"))).getBoolean(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
                arrayList.add(list.get(a));
            }
            n = ++a;
        }
        if (a2.hasPermission(C.ALLATORIxDEMO((String)"M\\oVmM1JkXy_")) || a2.hasPermission(C.ALLATORIxDEMO((String)"M\\oVmM1X{TvW"))) {
            a2.sendMessage(new StringBuilder().insert(0, s.s.s.g.G.ALLATORIxDEMO).append(C.ALLATORIxDEMO((String)"\u00b8_\u5f4c\u5274\u6716\u0019\u00b8\u000f")).append(arrayList.size()).append(C.ALLATORIxDEMO((String)"?\u009em\u4e13\u4e21\u629c\u6735\u8892\u53c8\u743f")).toString());
        }
    }

    public G() {
        G a;
    }
}
