/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.config.Configuration
 *  s.s.s.g.G
 *  s.s.s.g.L
 *  s.s.s.s.C
 *  s.s.s.s.G
 */
package s.s.s.d;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.config.Configuration;
import s.s.s.g.G;
import s.s.s.s.C;

public class L
extends Command {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void execute(CommandSender commandSender, String[] stringArray) {
        void a;
        void a2;
        L l = this;
        if (((void)a2).length != 2) return;
        Configuration configuration = s.s.s.s.G.ALLATORIxDEMO((String)new StringBuilder().insert(0, (String)a2[0]).append(s.s.s.g.L.ALLATORIxDEMO((String)"\u00039@,")).toString());
        configuration.getString(s.s.s.g.L.ALLATORIxDEMO((String)"E!C$A%\u00033Y!K&"));
        String string = configuration.getString(s.s.s.g.L.ALLATORIxDEMO((String)"_%]/_4H2"));
        boolean bl = configuration.getBoolean(s.s.s.g.L.ALLATORIxDEMO((String)"]/D.YnD.K/"));
        if (!a.getName().equalsIgnoreCase(string)) return;
        if (!bl) {
            try {
                int n;
                double d;
                int n2;
                double d2;
                double d3;
                double d4 = (double)Integer.parseInt((String)a2[1]) * 1.0;
                if (!(d3 >= 1.0) || !(d4 <= 5.0)) return;
                Configuration configuration2 = configuration;
                configuration2.set(s.s.s.g.L.ALLATORIxDEMO((String)"]/D.YnD.K/"), (Object)true);
                configuration2.set(s.s.s.g.L.ALLATORIxDEMO((String)"]/D.YnI!Y!"), (Object)d4);
                a.sendMessage(G.ALLATORIxDEMO + s.s.s.g.L.ALLATORIxDEMO((String)"\u00e7K\u615f\u8c0f\u538d\u99a5l\r\u791d\u6085\u6e78\u6222\u6149\u5fc6>"));
                Configuration configuration3 = C.ALLATORIxDEMO((String)s.s.s.g.L.ALLATORIxDEMO((String)"4B0\u00039@,"));
                configuration3.getInt(string);
                int a222 = configuration3.getInt(new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"]/D.Y%In")).append(string).toString());
                configuration3.set(new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"]/D.Y%In")).append(string).toString(), (Object)(a222 + 1));
                String[] stringArray2 = configuration3.getString(new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"]/D.Yn")).append(string).toString());
                if (stringArray2.equalsIgnoreCase("")) {
                    d2 = 0.0;
                    n2 = a222;
                } else {
                    d2 = Double.parseDouble((String)stringArray2);
                    n2 = a222;
                }
                d4 = (double)n2 * d2 + d4;
                d2 = a222 + 1;
                d4 /= d2;
                if (d > 5.0) {
                    d4 = 5.0;
                } else if (d4 < 1.0) {
                    d4 = 1.0;
                }
                String a222 = "";
                stringArray2 = String.valueOf((double)d4).split("");
                int n3 = n = 0;
                while (true) {
                    if (n3 >= 3) {
                        configuration3.set(new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"]/D.Yn")).append(string).toString(), (Object)a222);
                        C.ALLATORIxDEMO((Configuration)configuration3, (String)s.s.s.g.L.ALLATORIxDEMO((String)"4B0\u00039@,"));
                        s.s.s.s.G.ALLATORIxDEMO((Configuration)configuration, (String)new StringBuilder().insert(0, (String)a2[0]).append(s.s.s.g.L.ALLATORIxDEMO((String)"\u00039@,")).toString());
                        return;
                    }
                    String string2 = stringArray2[n];
                    a222 = new StringBuilder().insert(0, a222).append(string2).toString();
                    n3 = ++n;
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        a.sendMessage(new StringBuilder().insert(0, G.ALLATORIxDEMO).append(s.s.s.g.L.ALLATORIxDEMO((String)"\u008a#\u8bda\u52bf\u91e0\u594d\u8be9\u5246")).toString());
    }

    public L() {
        super(s.s.s.g.L.ALLATORIxDEMO((String)"2H0B2Y0B)C4"));
        L a;
    }
}
