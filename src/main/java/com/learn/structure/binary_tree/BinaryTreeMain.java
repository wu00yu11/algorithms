package com.learn.structure.binary_tree;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode();
        root.setData(1);
        BinaryTreeNode leftChirld = new BinaryTreeNode();
        leftChirld.setData(2);
        root.setLeftChirld(leftChirld);
        BinaryTreeNode rightChirld = new BinaryTreeNode();
        rightChirld.setData(2);
        root.setRightChirld(rightChirld);
        BinaryTree binaryTree = new BinaryTree(root);

        binaryTree.PreOrder(binaryTree.getRoot());
        System.out.println("============================");
        binaryTree.InOrder(binaryTree.getRoot());
        System.out.println("============================");
        binaryTree.PostOrder(binaryTree.getRoot());

    }
}
