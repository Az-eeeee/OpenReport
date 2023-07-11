/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 *  java.util.Map$Entry
 *  s.s.s.d.C
 */
package s.s.s.d;

import java.util.Comparator;
import java.util.Map;
import s.s.s.d.C;

/*
 * Exception performing whole class analysis ignored.
 */
class G
implements Comparator<Map.Entry<String, Integer>> {
    final /* synthetic */ C ALLATORIxDEMO;

    G(C c) {
        G a = c;
        G a2 = this;
        a2.ALLATORIxDEMO = a;
    }

    /*
     * WARNING - void declaration
     */
    public int ALLATORIxDEMO(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        void a;
        Map.Entry<String, Integer> a2 = entry2;
        Map.Entry<String, Integer> a3 = this;
        return ((Integer)a2.getValue()).compareTo((Integer)a.getValue());
    }
}
