/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.ChatEvent
 *  net.md_5.bungee.api.plugin.Listener
 *  net.md_5.bungee.config.Configuration
 *  net.md_5.bungee.event.EventHandler
 *  s.s.s.g.C
 *  s.s.s.g.L
 *  s.s.s.s.L
 */
package s.s.s.z;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.event.EventHandler;
import s.s.s.s.L;

public class C
implements Listener {
    public C() {
        C a;
    }

    @EventHandler
    public void ChatStorage(ChatEvent chatEvent) throws UnsupportedEncodingException {
        C a = chatEvent;
        C a2 = this;
        String string = a.getMessage();
        if (!(string.toLowerCase().startsWith(s.s.s.g.C.ALLATORIxDEMO((String)"\u0016s\u0019")) || string.toLowerCase().startsWith(s.s.s.g.L.ALLATORIxDEMO((String)"oA/J)C`")) || string.toLowerCase().startsWith(s.s.s.g.C.ALLATORIxDEMO((String)"\u0016m\\x\u0019")) || string.toLowerCase().startsWith(s.s.s.g.L.ALLATORIxDEMO((String)"\u00022H'D3Y%_`")))) {
            a = (ProxiedPlayer)a.getSender();
            Object object = new SimpleDateFormat(s.s.s.g.C.ALLATORIxDEMO((String)"@f@f\u0014Rt2]{\u0014Wq%Tr\u0003lJ"));
            Date date = new Date(System.currentTimeMillis());
            object = object.format(date);
            string = new StringBuilder().insert(0, (String)object).append(s.s.s.g.L.ALLATORIxDEMO((String)"\u522b$D6D$H\u5f40")).append(a.getServer().getInfo().getName()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u5219]vOv]z\u5f39")).append(string).toString();
            if (L.ALLATORIxDEMO((String)new StringBuilder().insert(0, a.getDisplayName()).append(s.s.s.g.L.ALLATORIxDEMO((String)"nN(L4")).toString())) {
                object = L.ALLATORIxDEMO((String)new StringBuilder().insert(0, a.getDisplayName()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0017|Q~M")).toString());
                date = object.getStringList(s.s.s.g.L.ALLATORIxDEMO((String)"@%^3L'H3"));
                date.add((Object)string);
                object.set(s.s.s.g.C.ALLATORIxDEMO((String)"r\\lJ~^zJ"), (Object)date);
                L.ALLATORIxDEMO((Configuration)object, (String)(a.getDisplayName() + s.s.s.g.L.ALLATORIxDEMO((String)"nN(L4")));
                return;
            }
            L.ALLATORIxDEMO((String)new StringBuilder().insert(0, a.getDisplayName()).append(s.s.s.g.C.ALLATORIxDEMO((String)"\u0017|Q~M")).toString());
            object = L.ALLATORIxDEMO((String)new StringBuilder().insert(0, a.getDisplayName()).append(s.s.s.g.L.ALLATORIxDEMO((String)"nN(L4")).toString());
            date = new ArrayList();
            date.add((Object)string);
            Object object2 = object;
            object2.set(s.s.s.g.C.ALLATORIxDEMO((String)"r\\lJ~^zJ"), (Object)date);
            L.ALLATORIxDEMO((Configuration)object2, (String)new StringBuilder().insert(0, a.getDisplayName()).append(s.s.s.g.L.ALLATORIxDEMO((String)"nN(L4")).toString());
        }
    }
}
