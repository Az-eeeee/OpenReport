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
 *  s.s.s.g.L
 */
package s.s.s.s;

import java.io.File;
import java.io.IOException;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import s.s.s.g.L;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class G {
    public static void ALLATORIxDEMO(String string) {
        String string2 = string;
        String a2 = s.s.s.G.ALLATORIxDEMO;
        File file = new File(a2.getDataFolder(), L.ALLATORIxDEMO((String)"\u00022H0B2Y3"));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!a2.getDataFolder().exists()) {
            a2.getDataFolder().mkdir();
        }
        if (!(a2 = new File(a2.getDataFolder(), new StringBuilder().insert(0, L.ALLATORIxDEMO((String)"o_%]/_4^o")).append(string2).toString())).exists()) {
            try {
                a2.createNewFile();
                return;
            }
            catch (IOException a2) {
                a2.printStackTrace();
            }
        }
    }

    public G() {
        G a;
    }

    public static void ALLATORIxDEMO(Configuration configuration, String string) {
        Object a22 = string;
        Configuration a = configuration;
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(a, new File(s.s.s.G.ALLATORIxDEMO.getDataFolder(), new StringBuilder().insert(0, L.ALLATORIxDEMO((String)"o_%]/_4^o")).append((String)a22).toString()));
            return;
        }
        catch (IOException a22) {
            throw new RuntimeException((Throwable)a22);
        }
    }

    public static Configuration ALLATORIxDEMO(String string) {
        String string2 = string;
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(s.s.s.G.ALLATORIxDEMO.getDataFolder(), new StringBuilder().insert(0, L.ALLATORIxDEMO((String)"o_%]/_4^o")).append(string2).toString()));
        }
        catch (IOException a) {
            throw new RuntimeException((Throwable)a);
        }
    }
}
