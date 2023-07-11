/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  net.md_5.bungee.config.Configuration
 *  net.md_5.bungee.config.ConfigurationProvider
 *  net.md_5.bungee.config.YamlConfiguration
 *  s.s.s.G
 */
package s.s.s.s;

import java.io.File;
import java.io.IOException;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import s.s.s.G;

public class C {
    /*
     * Exception decompiling
     */
    public static void ALLATORIxDEMO() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.Main.doClass(Main.java:18)
         *     at org.benf.cfr.reader.PluginRunner.getDecompilationFor(PluginRunner.java:115)
         *     at cn.enaium.joe.service.decompiler.CFRDecompiler.decompile(CFRDecompiler.java:63)
         *     at cn.enaium.joe.task.SaveAllSourceTask.get(SaveAllSourceTask.java:60)
         *     at cn.enaium.joe.task.SaveAllSourceTask.get(SaveAllSourceTask.java:39)
         *     at java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1590)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
         *     at java.lang.Thread.run(Thread.java:748)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public C() {
        C a;
    }

    public static void ALLATORIxDEMO(Configuration configuration, String string) {
        Object a22 = string;
        Configuration a = configuration;
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(a, new File(G.ALLATORIxDEMO.getDataFolder(), (String)a22));
            return;
        }
        catch (IOException a22) {
            throw new RuntimeException((Throwable)a22);
        }
    }

    public static Configuration ALLATORIxDEMO(String string) {
        String string2 = string;
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(G.ALLATORIxDEMO.getDataFolder(), string2));
        }
        catch (IOException a) {
            throw new RuntimeException((Throwable)a);
        }
    }
}
