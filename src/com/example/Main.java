package com.example;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        TreeNode Tree1 = new TreeNode(1);
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        TreeNode h = new TreeNode(9);
        Tree1.left = a;
        Tree1.right = b;
        a.left = c;
        c.left = h;
        TreeNode Tree2 = new TreeNode(2);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(7);
        Tree2.left = d;
        Tree2.right = e;
        d.right = f;
        e.right = g;
        System.out.println(Tree1);
        System.out.println(Tree2);
        System.out.println(mergeTrees(Tree1, Tree2));


    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
