import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;
    private int count;

    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i=0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    /**
     * quick-find
     * @param p
     * @return
     */
    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public boolean connected(int p, int q) {
        int pR = find(p);
        int qR = find(q);
        return pR == qR;
    }

    /**
     * quick-union
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pR = find(p);
        int qR = find(q);

        if (pR == qR) return;

        id[pR] = qR;
        count--;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }
}
