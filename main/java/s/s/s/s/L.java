/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  net.md_5.bungee.config.Configuration
 *  net.md_5.bungee.config.ConfigurationProvider
 *  net.md_5.bungee.config.YamlConfiguration
 *  s.s.s.G
 *  s.s.s.g.C
 *  s.s.s.g.L
 */
package s.s.s.s;

import java.io.File;
import java.io.IOException;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import s.s.s.G;
import s.s.s.g.C;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L {
    public static void ALLATORIxDEMO(Configuration configuration, String string) {
        Object a22 = string;
        Configuration a = configuration;
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(a, new File(G.ALLATORIxDEMO.getDataFolder(), new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"\u0002#E!Yo")).append((String)a22).toString()));
            return;
        }
        catch (IOException a22) {
            throw new RuntimeException((Throwable)a22);
        }
    }

    public static Configuration ALLATORIxDEMO(String string) {
        String string2 = string;
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(G.ALLATORIxDEMO.getDataFolder(), new StringBuilder().insert(0, C.ALLATORIxDEMO((String)"0ZwXk\u0016")).append(string2).toString()));
        }
        catch (IOException a) {
            throw new RuntimeException((Throwable)a);
        }
    }

    public static void ALLATORIxDEMO(String string) {
        String string2 = string;
        String a2 = G.ALLATORIxDEMO;
        File file = new File(a2.getDataFolder(), C.ALLATORIxDEMO((String)"\u0016|Q~M"));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!a2.getDataFolder().exists()) {
            a2.getDataFolder().mkdir();
        }
        if (!(a2 = new File(a2.getDataFolder(), new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"\u0002#E!Yo")).append(string2).toString())).exists()) {
            try {
                a2.createNewFile();
                return;
            }
            catch (IOException a2) {
                a2.printStackTrace();
            }
        }
    }

    public L() {
        L a;
    }

    public static boolean ALLATORIxDEMO(String string) {
        String string2 = string;
        String a = G.ALLATORIxDEMO;
        File file = new File(a.getDataFolder(), C.ALLATORIxDEMO((String)"\u0016|Q~M"));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!a.getDataFolder().exists()) {
            a.getDataFolder().mkdir();
        }
        return new File(a.getDataFolder(), new StringBuilder().insert(0, s.s.s.g.L.ALLATORIxDEMO((String)"\u0002#E!Yo")).append(string2).toString()).exists();
    }
}
