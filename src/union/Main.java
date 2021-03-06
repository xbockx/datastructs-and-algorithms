package union;

/**
 * @Description
 * @Author xbockx
 * @Date 1/14/2022
 */
public class Main {
    public static void main(String[] args) {
        UnionFind uf = new QuickUnion(12);

        uf.union(0, 4);
        uf.union(0, 1);
        uf.union(0, 3);
        uf.union(2, 3);
        uf.union(2, 5);

        uf.union(6, 7);

        uf.union(8, 10);
        uf.union(8, 9);
        uf.union(9, 11);

        System.out.println(uf.isSame(0, 5));
        System.out.println(uf.isSame(0, 6));

        uf.union(4, 6);
        System.out.println(uf.isSame(2, 7));

    }
}
