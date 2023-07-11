/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.text.SimpleDateFormat
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.ClickEvent
 *  net.md_5.bungee.api.chat.ClickEvent$Action
 *  net.md_5.bungee.api.chat.ComponentBuilder
 *  net.md_5.bungee.api.chat.HoverEvent
 *  net.md_5.bungee.api.chat.HoverEvent$Action
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.config.Configuration
 *  s.s.s.g.C
 *  s.s.s.s.C
 *  s.s.s.s.G
 *  s.s.s.s.L
 */
package s.s.s.g;

import java.text.SimpleDateFormat;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.config.Configuration;
import s.s.s.g.C;
import s.s.s.s.G;

public class L {
    /*
     * WARNING - void declaration
     */
    public static void D(String string, String string2, ProxiedPlayer proxiedPlayer) {
        void v10;
        TextComponent textComponent;
        TextComponent textComponent2;
        String string3;
        SimpleDateFormat simpleDateFormat;
        void v0;
        void a;
        String string4;
        String string5 = string;
        Configuration configuration = G.ALLATORIxDEMO((String)new StringBuilder().insert(0, string5).append(C.ALLATORIxDEMO((String)"1@rU")).toString());
        String a2 = configuration.getString(L.ALLATORIxDEMO("_%]/_4H2"));
        String string6 = configuration.getString(C.ALLATORIxDEMO((String)"KzIpKk\\mfoKz_vA"));
        String string7 = configuration.getString(L.ALLATORIxDEMO("E!N+H2"));
        String string8 = configuration.getString(C.ALLATORIxDEMO((String)"Q~Zt\\mfoKz_vA"));
        String string9 = configuration.getString(L.ALLATORIxDEMO("_%L3B."));
        String string10 = configuration.getString(C.ALLATORIxDEMO((String)"v]"));
        String string11 = configuration.getString(L.ALLATORIxDEMO("^%_6H2"));
        Configuration configuration2 = s.s.s.s.C.ALLATORIxDEMO((String)C.ALLATORIxDEMO((String)"Mp]~@1@rU"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(L.ALLATORIxDEMO("T9T9\u0000\r`mI$"));
        int n = configuration2.getInt(simpleDateFormat2.format((Object)System.currentTimeMillis()) + C.ALLATORIxDEMO((String)"\u0017") + string7);
        if (n >= 10) {
            string4 = L.ALLATORIxDEMO("\u008at");
            v0 = a;
        } else if (n >= 6) {
            string4 = C.ALLATORIxDEMO((String)"\u00b8Z");
            v0 = a;
        } else if (n >= 4) {
            string4 = L.ALLATORIxDEMO("\u008av");
            v0 = a;
        } else if (n >= 2) {
            string4 = C.ALLATORIxDEMO((String)"\u00b8\\");
            v0 = a;
        } else {
            string4 = L.ALLATORIxDEMO("\u008aw");
            v0 = a;
        }
        v0.sendMessage(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"3")).append(string4).append(L.ALLATORIxDEMO("m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000J")).toString());
        simpleDateFormat2 = new TextComponent();
        a2 = new TextComponent(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u0019\u73b6\u5b8f%\u0019\u00b8\u000e")).append(string8).append(string7).append(L.ALLATORIxDEMO("`\r\u00e7K\u4e7e\u6288\u8045\u0017`\u008aw")).append(string6).append(a2).append(C.ALLATORIxDEMO((String)"?\u009e'\u001a")).append(string10).append(L.ALLATORIxDEMO("`")).toString());
        String string12 = string6 = new TextComponent(C.ALLATORIxDEMO((String)"\u009e~\u0011K\u0010"));
        if (ProxyServer.getInstance().getPlayer(string7) instanceof ProxiedPlayer) {
            string12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, L.ALLATORIxDEMO("\u6200\u5705\u674d\u528c\u5628\u0017`\u008aw")).append(string11).toString()).create()));
            simpleDateFormat = simpleDateFormat2;
            string6.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u0016m\\oVmMsMo\u0019")).append(string7).toString()));
        } else {
            string12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u00e7\u001a\u73e9\u5b9b\u5db2\u7996\u7eff")).create()));
            simpleDateFormat = simpleDateFormat2;
        }
        simpleDateFormat.addExtra((BaseComponent)a2);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
        simpleDateFormat3.addExtra((BaseComponent)string6);
        TextComponent textComponent3 = new TextComponent(C.ALLATORIxDEMO((String)"\u009e|\u0011[\u0010"));
        textComponent3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a#\u520d\u9624\u8ff4\u4e6a\u4e13\u62e5")).create()));
        textComponent3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?KzTpOz\u0019")).append(string10).toString()));
        simpleDateFormat3.addExtra((BaseComponent)textComponent3);
        a2 = "";
        string6 = s.s.s.s.L.ALLATORIxDEMO((String)new StringBuilder().insert(0, string7).append(L.ALLATORIxDEMO("nN(L4")).toString()).getStringList(C.ALLATORIxDEMO((String)"r\\lJ~^zJ"));
        int n2 = string6.size() - 5;
        int n3 = string6.size();
        int n4 = n2 = n2;
        while (n4 < n3) {
            try {
                string3 = (String)string6.get(n2);
                textComponent2 = string3.split(L.ALLATORIxDEMO("\u522b$D6D$H\u5f40"));
                a2 = new StringBuilder().insert(0, a2).append(C.ALLATORIxDEMO((String)"3?\u009e(b")).append(textComponent2[0]).append(L.ALLATORIxDEMO("`\u0002`")).append(textComponent2[1]).append(C.ALLATORIxDEMO((String)"B\u0019")).append(textComponent2[2]).toString();
            }
            catch (Exception exception) {
                // empty catch block
            }
            n4 = ++n2;
        }
        TextComponent textComponent4 = textComponent = new TextComponent(L.ALLATORIxDEMO("\u00e7\u001ahni"));
        textComponent4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, a2).append(C.ALLATORIxDEMO((String)"3")).toString()).create()));
        textComponent4.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u0002#E!Y2H#B2I`")).append(string7).toString()));
        simpleDateFormat2.addExtra((BaseComponent)textComponent4);
        void v7 = a;
        v7.sendMessage((BaseComponent)simpleDateFormat2);
        string3 = new TextComponent();
        textComponent2 = new TextComponent(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u0019\u7419\u7508%\u0019\u00b8\u000e")).append(string9).append(L.ALLATORIxDEMO("\r`\u008a&\u6b0c\u6530\u0017`")).append(string4).append(n).toString());
        String string13 = string3;
        string13.addExtra((BaseComponent)textComponent2);
        a.sendMessage((BaseComponent)string13);
        v7.sendMessage(C.ALLATORIxDEMO((String)"\u0019"));
        a2 = new TextComponent();
        a2.addExtra(L.ALLATORIxDEMO("`"));
        if (configuration.getBoolean(C.ALLATORIxDEMO((String)"Q~W{Uz\u0017~Z|\\oMz]"))) {
            TextComponent textComponent5;
            void a3;
            string6 = new TextComponent(L.ALLATORIxDEMO("\u008a%v\u5397\u742b\u001d"));
            String string14 = a2;
            string6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u009e(\u5dcb\u88b4\u0019")).append(configuration.getString(L.ALLATORIxDEMO("E!C$A%\u00033Y!K&"))).append(C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e\u53c8\u743f")).toString()).create()));
            string14.addExtra((BaseComponent)string6);
            string14.addExtra(L.ALLATORIxDEMO("`"));
            if (configuration.getBoolean(C.ALLATORIxDEMO((String)"wXq]s\\1Q~W{Uz]")) && !configuration.getString(L.ALLATORIxDEMO("E!C$A%\u00033Y!K&")).equalsIgnoreCase((String)a3)) {
                textComponent = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000eD\u65d9\u6557d"));
                v10 = a;
                TextComponent textComponent6 = textComponent;
                textComponent6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00e7\u001a\u5db2\u8886`")).append(configuration.getString(C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_"))).append(L.ALLATORIxDEMO("`\u008aw\u5929\u7446")).toString()).create()));
                a2.addExtra((BaseComponent)textComponent6);
            } else if (configuration.getString(C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_")).equalsIgnoreCase((String)a3)) {
                textComponent5 = new TextComponent(L.ALLATORIxDEMO("\u008awv\u65a0\u6565\u001d"));
                TextComponent textComponent7 = textComponent = textComponent5;
                textComponent7.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).toString()));
                textComponent7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u00e7L\u5944\u742b\u8ba5\u4e13\u62e5")).create()));
                String string15 = a2;
                String string16 = a2;
                String string17 = a2;
                string17.addExtra((BaseComponent)textComponent);
                string16.addExtra(C.ALLATORIxDEMO((String)"\u0019\u00b8_\u5c1e\u79b8%\u0019"));
                TextComponent textComponent8 = new TextComponent(L.ALLATORIxDEMO("\u008avvw\u5904\u001d"));
                textComponent8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8\u000f\u5c1e\u79b8(\u5910")).create()));
                textComponent8.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"\u0019}Xq\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u001a$")).toString()));
                string17.addExtra((BaseComponent)textComponent8);
                string16.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
                TextComponent textComponent9 = new TextComponent(L.ALLATORIxDEMO("\u008a#v\u6c78\u4e68\u001d"));
                textComponent9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8Z\u5c1e\u79b8\u6c27\u4e7c")).create()));
                textComponent9.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"\u0019}Xq\u0014")).append(string7).toString()));
                string16.addExtra((BaseComponent)textComponent9);
                string16.addExtra(L.ALLATORIxDEMO("`\u79ac\u8a40\u0017`"));
                TextComponent textComponent10 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000fD\u000e\u5936d"));
                textComponent10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008av\u79ac\u8a40\u001a\u5969")).create()));
                textComponent10.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r-X4Hm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014(]")).toString()));
                string16.addExtra((BaseComponent)textComponent10);
                string15.addExtra(L.ALLATORIxDEMO("`"));
                TextComponent textComponent11 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8ZD\u6c01\u4e5ad"));
                textComponent11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a#\u79ac\u8a40\u6c15\u4e05")).create()));
                textComponent11.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r-X4Hm")).append(string7).toString()));
                string15.addExtra((BaseComponent)textComponent11);
                a2.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
                TextComponent textComponent12 = new TextComponent(L.ALLATORIxDEMO("\u008a\"v\u8e62\u51d7\u001d"));
                textComponent12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8[\u8e3d\u51c3")).create()));
                textComponent12.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?RvZt\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u7819\u570f\u6e15\u624f\u7382\u58c3")).toString()));
                string15.addExtra((BaseComponent)textComponent12);
                void v22 = a;
                v10 = v22;
                v22.sendMessage((BaseComponent)a2);
            } else {
                textComponent5 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000eD\u65d9\u6557d"));
                textComponent = textComponent5;
                v10 = a;
                textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00e7\u001a\u5db2\u8886`")).append(configuration.getString(C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_"))).append(L.ALLATORIxDEMO("`\u008aw\u53fa\u7446")).toString()).create()));
            }
        } else {
            String string18 = string6 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\\D\u53ee\u7419d"));
            string18.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u00e7H\u5397\u742b\u8ba5\u4e13\u62e5")).create()));
            string18.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?X|ZzIk\u0019")).append(string10).toString()));
            String string19 = a2;
            String string20 = a2;
            String string21 = a2;
            string21.addExtra((BaseComponent)string6);
            string20.addExtra(L.ALLATORIxDEMO("`"));
            textComponent = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000eD\u65d9\u6557d"));
            textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).toString()));
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u009e~\u593d\u7419\u8bdc\u4e21\u629c")).create()));
            string21.addExtra((BaseComponent)textComponent);
            string20.addExtra(L.ALLATORIxDEMO("`\u008a&\u5c2c\u79c1\u0017`"));
            TextComponent textComponent13 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000fD\u000e\u5936d"));
            textComponent13.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008av\u5c2c\u79c1\u001a\u5969")).create()));
            textComponent13.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("`O!Cm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014(]")).toString()));
            string20.addExtra((BaseComponent)textComponent13);
            string20.addExtra(L.ALLATORIxDEMO("`"));
            TextComponent textComponent14 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8ZD\u6c01\u4e5ad"));
            textComponent14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a#\u5c2c\u79c1\u6c15\u4e05")).create()));
            textComponent14.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("`O!Cm")).append(string7).toString()));
            string20.addExtra((BaseComponent)textComponent14);
            string20.addExtra(C.ALLATORIxDEMO((String)"\u0019\u799e\u8a39%\u0019"));
            TextComponent textComponent15 = new TextComponent(L.ALLATORIxDEMO("\u008avvw\u5904\u001d"));
            textComponent15.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8\u000f\u799e\u8a39(\u5910")).create()));
            textComponent15.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?TjMz\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u001a$")).toString()));
            string20.addExtra((BaseComponent)textComponent15);
            string19.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
            TextComponent textComponent16 = new TextComponent(L.ALLATORIxDEMO("\u008a#v\u6c78\u4e68\u001d"));
            textComponent16.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8Z\u799e\u8a39\u6c27\u4e7c")).create()));
            textComponent16.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?TjMz\u0014")).append(string7).toString()));
            string19.addExtra((BaseComponent)textComponent16);
            a2.addExtra(L.ALLATORIxDEMO("`"));
            TextComponent textComponent17 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8[D\u8e1b\u51e5d"));
            textComponent17.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a\"\u8e0f\u51ba")).create()));
            textComponent17.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r+D#Fm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014\u782b\u5776\u6e27\u6236\u73b0\u58ba")).toString()));
            string19.addExtra((BaseComponent)textComponent17);
            void v32 = a;
            v10 = v32;
            v32.sendMessage((BaseComponent)a2);
        }
        v10.sendMessage(new StringBuilder().insert(0, L.ALLATORIxDEMO("J")).append(string4).append(C.ALLATORIxDEMO((String)"\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u00142\u001423")).toString());
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, String string2, ProxiedPlayer proxiedPlayer) {
        void v8;
        TextComponent textComponent;
        TextComponent textComponent2;
        String string3;
        SimpleDateFormat simpleDateFormat;
        void v0;
        void a;
        String string4;
        String string5 = string;
        Configuration configuration = G.ALLATORIxDEMO((String)new StringBuilder().insert(0, string5).append(C.ALLATORIxDEMO((String)"1@rU")).toString());
        String a2 = configuration.getString(L.ALLATORIxDEMO("_%]/_4H2"));
        String string6 = configuration.getString(C.ALLATORIxDEMO((String)"KzIpKk\\mfoKz_vA"));
        String string7 = configuration.getString(L.ALLATORIxDEMO("E!N+H2"));
        String string8 = configuration.getString(C.ALLATORIxDEMO((String)"Q~Zt\\mfoKz_vA"));
        String string9 = configuration.getString(L.ALLATORIxDEMO("_%L3B."));
        String string10 = configuration.getString(C.ALLATORIxDEMO((String)"v]"));
        String string11 = configuration.getString(L.ALLATORIxDEMO("^%_6H2"));
        Configuration configuration2 = s.s.s.s.C.ALLATORIxDEMO((String)C.ALLATORIxDEMO((String)"Mp]~@1@rU"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(L.ALLATORIxDEMO("T9T9\u0000\r`mI$"));
        int n = configuration2.getInt(simpleDateFormat2.format((Object)System.currentTimeMillis()) + C.ALLATORIxDEMO((String)"\u0017") + string7);
        if (n >= 10) {
            string4 = L.ALLATORIxDEMO("\u008at");
            v0 = a;
        } else if (n >= 6) {
            string4 = C.ALLATORIxDEMO((String)"\u00b8Z");
            v0 = a;
        } else if (n >= 4) {
            string4 = L.ALLATORIxDEMO("\u008av");
            v0 = a;
        } else if (n >= 2) {
            string4 = C.ALLATORIxDEMO((String)"\u00b8\\");
            v0 = a;
        } else {
            string4 = L.ALLATORIxDEMO("\u008aw");
            v0 = a;
        }
        v0.sendMessage(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"3")).append(string4).append(L.ALLATORIxDEMO("m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000J")).toString());
        simpleDateFormat2 = new TextComponent();
        a2 = new TextComponent(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u0019\u73b6\u5b8f%\u0019\u00b8\u000e")).append(string8).append(string7).append(L.ALLATORIxDEMO("`\r\u00e7K\u4e7e\u6288\u8045\u0017`\u008aw")).append(string6).append(a2).append(C.ALLATORIxDEMO((String)"?\u009e'\u001a")).append(string10).append(L.ALLATORIxDEMO("`")).toString());
        String string12 = string6 = new TextComponent(C.ALLATORIxDEMO((String)"\u009e~\u0011K\u0010"));
        if (ProxyServer.getInstance().getPlayer(string7) instanceof ProxiedPlayer) {
            string12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, L.ALLATORIxDEMO("\u6200\u5705\u674d\u528c\u5628\u0017`\u008aw")).append(string11).toString()).create()));
            simpleDateFormat = simpleDateFormat2;
            string6.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u0016m\\oVmMsMo\u0019")).append(string7).toString()));
        } else {
            string12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u00e7\u001a\u73e9\u5b9b\u5db2\u7996\u7eff")).create()));
            simpleDateFormat = simpleDateFormat2;
        }
        simpleDateFormat.addExtra((BaseComponent)a2);
        simpleDateFormat2.addExtra((BaseComponent)string6);
        a2 = "";
        string6 = s.s.s.s.L.ALLATORIxDEMO((String)new StringBuilder().insert(0, string7).append(C.ALLATORIxDEMO((String)"\u0017|Q~M")).toString()).getStringList(L.ALLATORIxDEMO("@%^3L'H3"));
        int n2 = string6.size() - 5;
        int n3 = string6.size();
        int n4 = n2 = n2;
        while (n4 < n3) {
            try {
                string3 = (String)string6.get(n2);
                textComponent2 = string3.split(C.ALLATORIxDEMO((String)"\u5219]vOv]z\u5f39"));
                a2 = new StringBuilder().insert(0, a2).append(L.ALLATORIxDEMO("J\r\u00e7\u001a\u001b")).append(textComponent2[0]).append(C.ALLATORIxDEMO((String)"\u00190\u0019")).append(textComponent2[1]).append(L.ALLATORIxDEMO("p`")).append(textComponent2[2]).toString();
            }
            catch (Exception exception) {
                // empty catch block
            }
            n4 = ++n2;
        }
        TextComponent textComponent3 = textComponent = new TextComponent(C.ALLATORIxDEMO((String)"\u009e(\u0011\\\u0010"));
        textComponent3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, a2).append(L.ALLATORIxDEMO("J")).toString()).create()));
        textComponent3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0ZwXkKzZpK{\u0019")).append(string7).toString()));
        simpleDateFormat2.addExtra((BaseComponent)textComponent3);
        void v5 = a;
        v5.sendMessage((BaseComponent)simpleDateFormat2);
        string3 = new TextComponent();
        textComponent2 = new TextComponent(new StringBuilder().insert(0, L.ALLATORIxDEMO("`\u742b\u7571\u0017`\u008aw")).append(string9).append(C.ALLATORIxDEMO((String)"?\u0019\u00b8_\u6b3e\u6549%\u0019")).append(string4).append(n).toString());
        String string13 = string3;
        string13.addExtra((BaseComponent)textComponent2);
        a.sendMessage((BaseComponent)string13);
        v5.sendMessage(L.ALLATORIxDEMO("`"));
        a2 = new TextComponent();
        a2.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
        if (configuration.getBoolean(L.ALLATORIxDEMO("(L.I,HnL#N%]4H$"))) {
            TextComponent textComponent4;
            void a3;
            string6 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\\D\u53ee\u7419d"));
            String string14 = a2;
            string6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00e7\u001a\u5db2\u8886`")).append(configuration.getString(C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_"))).append(L.ALLATORIxDEMO("`\u008aw\u53fa\u7446")).toString()).create()));
            string14.addExtra((BaseComponent)string6);
            string14.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
            if (configuration.getBoolean(L.ALLATORIxDEMO("E!C$A%\u0003(L.I,H$")) && !configuration.getString(C.ALLATORIxDEMO((String)"wXq]s\\1JkXy_")).equalsIgnoreCase((String)a3)) {
                textComponent = new TextComponent(L.ALLATORIxDEMO("\u008awv\u65a0\u6565\u001d"));
                v8 = a;
                TextComponent textComponent5 = textComponent;
                textComponent5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u009e(\u5dcb\u88b4\u0019")).append(configuration.getString(L.ALLATORIxDEMO("E!C$A%\u00033Y!K&"))).append(C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e\u591b\u743f")).toString()).create()));
                a2.addExtra((BaseComponent)textComponent5);
            } else if (configuration.getString(L.ALLATORIxDEMO("E!C$A%\u00033Y!K&")).equalsIgnoreCase((String)a3)) {
                textComponent4 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000eD\u65d9\u6557d"));
                TextComponent textComponent6 = textComponent = textComponent4;
                textComponent6.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).toString()));
                textComponent6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u009e~\u593d\u7419\u8bdc\u4e21\u629c")).create()));
                String string15 = a2;
                String string16 = a2;
                String string17 = a2;
                string17.addExtra((BaseComponent)textComponent);
                string16.addExtra(L.ALLATORIxDEMO("`\u008a&\u5c2c\u79c1\u0017`"));
                TextComponent textComponent7 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000fD\u000e\u5936d"));
                textComponent7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008av\u5c2c\u79c1\u001a\u5969")).create()));
                textComponent7.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("`O!Cm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014(]")).toString()));
                string17.addExtra((BaseComponent)textComponent7);
                string16.addExtra(L.ALLATORIxDEMO("`"));
                TextComponent textComponent8 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8ZD\u6c01\u4e5ad"));
                textComponent8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a#\u5c2c\u79c1\u6c15\u4e05")).create()));
                textComponent8.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("`O!Cm")).append(string7).toString()));
                string16.addExtra((BaseComponent)textComponent8);
                string16.addExtra(C.ALLATORIxDEMO((String)"\u0019\u799e\u8a39%\u0019"));
                TextComponent textComponent9 = new TextComponent(L.ALLATORIxDEMO("\u008avvw\u5904\u001d"));
                textComponent9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8\u000f\u799e\u8a39(\u5910")).create()));
                textComponent9.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?TjMz\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u001a$")).toString()));
                string16.addExtra((BaseComponent)textComponent9);
                string15.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
                TextComponent textComponent10 = new TextComponent(L.ALLATORIxDEMO("\u008a#v\u6c78\u4e68\u001d"));
                textComponent10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8Z\u799e\u8a39\u6c27\u4e7c")).create()));
                textComponent10.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?TjMz\u0014")).append(string7).toString()));
                string15.addExtra((BaseComponent)textComponent10);
                a2.addExtra(L.ALLATORIxDEMO("`"));
                TextComponent textComponent11 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8[D\u8e1b\u51e5d"));
                textComponent11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a\"\u8e0f\u51ba")).create()));
                textComponent11.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r+D#Fm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014\u782b\u5776\u6e27\u6236\u73b0\u58ba")).toString()));
                string15.addExtra((BaseComponent)textComponent11);
                void v20 = a;
                v8 = v20;
                v20.sendMessage((BaseComponent)a2);
            } else {
                textComponent4 = new TextComponent(L.ALLATORIxDEMO("\u008awv\u65a0\u6565\u001d"));
                textComponent = textComponent4;
                v8 = a;
                textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"\u009e(\u5dcb\u88b4\u0019")).append(configuration.getString(L.ALLATORIxDEMO("E!C$A%\u00033Y!K&"))).append(C.ALLATORIxDEMO((String)"\u0019\u00b8\u000e\u53c8\u743f")).toString()).create()));
            }
        } else {
            String string18 = string6 = new TextComponent(L.ALLATORIxDEMO("\u008a%v\u5397\u742b\u001d"));
            string18.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u009ez\u53ee\u7419\u8bdc\u4e21\u629c")).create()));
            string18.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r!N#H0Y`")).append(string10).toString()));
            String string19 = a2;
            String string20 = a2;
            String string21 = a2;
            string21.addExtra((BaseComponent)string6);
            string20.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
            textComponent = new TextComponent(L.ALLATORIxDEMO("\u008awv\u65a0\u6565\u001d"));
            textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).toString()));
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u00e7L\u5944\u742b\u8ba5\u4e13\u62e5")).create()));
            string21.addExtra((BaseComponent)textComponent);
            string20.addExtra(C.ALLATORIxDEMO((String)"\u0019\u00b8_\u5c1e\u79b8%\u0019"));
            TextComponent textComponent12 = new TextComponent(L.ALLATORIxDEMO("\u008avvw\u5904\u001d"));
            textComponent12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8\u000f\u5c1e\u79b8(\u5910")).create()));
            textComponent12.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"\u0019}Xq\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u001a$")).toString()));
            string20.addExtra((BaseComponent)textComponent12);
            string20.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
            TextComponent textComponent13 = new TextComponent(L.ALLATORIxDEMO("\u008a#v\u6c78\u4e68\u001d"));
            textComponent13.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8Z\u5c1e\u79b8\u6c27\u4e7c")).create()));
            textComponent13.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"\u0019}Xq\u0014")).append(string7).toString()));
            string20.addExtra((BaseComponent)textComponent13);
            string20.addExtra(L.ALLATORIxDEMO("`\u79ac\u8a40\u0017`"));
            TextComponent textComponent14 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8\u000fD\u000e\u5936d"));
            textComponent14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008av\u79ac\u8a40\u001a\u5969")).create()));
            textComponent14.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r-X4Hm")).append(string7).append(C.ALLATORIxDEMO((String)"\u0014(]")).toString()));
            string20.addExtra((BaseComponent)textComponent14);
            string19.addExtra(L.ALLATORIxDEMO("`"));
            TextComponent textComponent15 = new TextComponent(C.ALLATORIxDEMO((String)"\u00b8ZD\u6c01\u4e5ad"));
            textComponent15.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(L.ALLATORIxDEMO("\u008a#\u79ac\u8a40\u6c15\u4e05")).create()));
            textComponent15.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0KzIpKkJ?Q~W{Uz\u0019")).append(string10).append(L.ALLATORIxDEMO("\r-X4Hm")).append(string7).toString()));
            string19.addExtra((BaseComponent)textComponent15);
            a2.addExtra(C.ALLATORIxDEMO((String)"\u0019"));
            TextComponent textComponent16 = new TextComponent(L.ALLATORIxDEMO("\u008a\"v\u8e62\u51d7\u001d"));
            textComponent16.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(C.ALLATORIxDEMO((String)"\u00b8[\u8e3d\u51c3")).create()));
            textComponent16.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, new StringBuilder().insert(0, L.ALLATORIxDEMO("\u00022H0B2Y3\r(L.I,H`")).append(string10).append(C.ALLATORIxDEMO((String)"?RvZt\u0014")).append(string7).append(L.ALLATORIxDEMO("m\u7819\u570f\u6e15\u624f\u7382\u58c3")).toString()));
            string19.addExtra((BaseComponent)textComponent16);
            void v30 = a;
            v8 = v30;
            v30.sendMessage((BaseComponent)a2);
        }
        v8.sendMessage(new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"3")).append(string4).append(L.ALLATORIxDEMO("m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000m\u0000J")).toString());
    }

    public L() {
        L a;
    }

    public static String D(String a) {
        return G.ALLATORIxDEMO((String)new StringBuilder().insert(0, a).append(C.ALLATORIxDEMO((String)"1@rU")).toString()).getString(L.ALLATORIxDEMO("_%]/_4H2"));
    }

    public static String ALLATORIxDEMO(String string) {
        String string2 = string;
        int n = string2.length();
        int a = n - 1;
        char[] cArray = new char[n];
        int n2 = 5 << 3 ^ 5;
        int cfr_ignored_0 = 4 << 3;
        int n3 = a;
        int n4 = 4 << 4;
        while (n3 >= 0) {
            int n5 = a--;
            cArray[n5] = (char)(string2.charAt(n5) ^ n4);
            if (a < 0) break;
            int n6 = a--;
            cArray[n6] = (char)(string2.charAt(n6) ^ n2);
            n3 = a;
        }
        return new String(cArray);
    }
}
