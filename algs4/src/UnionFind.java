import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UnionFind {
    private int[] id;
    private int count;

    public UnionFind(int N) {
        count = N;
        id = new int[N];
        for (int i=0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {

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

    /**
     * quick-union
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        if (find(p) == find(q)) return;
        while (p != id[p]) p = id[p];
        id[p] = q;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UnionFind uf = new UnionFind(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }
}
