// package 28.Binary Tree;
// height of a tree

import java.util.*;

public class t2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static int height(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int lh = height(root.left);
    // int rh = height(root.right);
    // return Math.max(lh, rh) + 1;
    // }

    // // count of a node
    // public static int count(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int leftCount = count(root.left);
    // int rightCount = count(root.right);
    // return leftCount + rightCount + 1;
    // }

    // // sum of node
    // public static int sum(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int leftSum = sum(root.left);
    // int rightSum = sum(root.right);
    // return leftSum + rightSum + root.data;
    // }

    // // diameter
    // public static int diameter2(Node root) { // O(n^2)
    // if (root == null) {
    // return 0;
    // }

    // int leftDiam = diameter2(root.left);
    // int leftHt = height(root.left);
    // int rightDiam = diameter2(root.right);
    // int rightHt = height(root.right);

    // int selfDiam = leftHt + rightHt + 1;

    // return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    // }

    // static class Info {
    // int diam;
    // int ht;

    // public Info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }
    // }

    // public static Info diameter(Node root) { // O(n)
    // if (root == null) {
    // return new Info(0, 0);
    // }
    // Info leftInfo = diameter(root.left);
    // Info rightInfo = diameter(root.right);

    // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht +
    // rightInfo.ht + 1);
    // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    // return new Info(diam, ht);
    // }

    // // subtree of another tree
    // public static boolean isIdentical(Node node, Node subRoot) {
    // if (node == null && subRoot == null) {
    // return true;
    // } else if (node == null || subRoot == null || node.data != subRoot.data) {
    // return false;
    // }

    // if (!isIdentical(node.left, subRoot.left)) {
    // return false;
    // }
    // if (!isIdentical(node.right, subRoot.right)) {
    // return false;
    // }

    // return true;
    // }

    // public static boolean isSubtree(Node root, Node subRoot) {
    // if (root == null) {
    // return false;
    // }
    // if (root.data == subRoot.data) {
    // if (isIdentical(root, subRoot)) {
    // return true;
    // }
    // }

    // // boolean leftAns = isSubtree(root.left, subRoot); //lsubtree -> true
    // // boolean rightAns = isSubtree(root.right, subRoot);

    // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    // top view of a tree
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) { // first time my hd is occurring
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    // kth level of a tree

    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }






    // lowest common ancertor
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor

        int i = 0;
        for(; i < path1.size() && i < path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        //last equal node -> i - 1th
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));

        // System.out.println(count(root));

        // System.out.println(sum(root));

        // System.out.println(diameter2(root));

        // System.out.println(diameter(root).diam);
        // System.out.println(diameter(root).ht);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot));

        // topView(root);

        // int k = 3;

        int n1 = 4, n2 = 5;
        System.out.println(lca(root, n1, n2).data);

    }
}
