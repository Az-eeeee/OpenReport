/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.TabExecutor
 *  s.s.s.g.L
 */
package s.s.s.d;

import java.util.HashSet;
import java.util.Iterator;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import s.s.s.g.L;

public class h
extends Command
implements TabExecutor {
    public h() {
        super(L.ALLATORIxDEMO((String)"N(L4_%N/_$"));
        h a;
    }

    /*
     * Exception decompiling
     */
    public void execute(CommandSender var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
}
