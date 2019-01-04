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

    }
}
