package com.company;

import java.util.ArrayList;

public class Tree {
    private String name;
    private ArrayList<Leaf> leafs;
    private boolean leafsOnTree = true;

    public Tree(String name, ArrayList<Leaf> leafs, boolean leafsOnTree) {
        this.name = name;
        this.leafs = leafs;
        this.leafsOnTree = leafsOnTree;
    }

    public Tree(String name, ArrayList<Leaf> leafs) {
        this.name = name;
        this.leafs = leafs;
    }

    public Tree() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(ArrayList<Leaf> leafs) {
        this.leafs = leafs;
    }

    public boolean isLeafsOnTree() {
        return leafsOnTree;
    }

    public void setLeafsOnTree(boolean leafsOnTree) {
        this.leafsOnTree = leafsOnTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (leafsOnTree != tree.leafsOnTree) return false;
        return leafs != null ? leafs.equals(tree.leafs) : tree.leafs == null;
    }

    @Override
    public int hashCode() {
        int result = leafs != null ? leafs.hashCode() : 0;
        result = 31 * result + (leafsOnTree ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafs=" + leafs +
                ", leafsOnTree=" + leafsOnTree +
                '}';
    }

    public void bloom() {
        System.out.println("Tree is Blooming");
    }

    public void makeLeafsYellow() {
        for (int i = 0; i < this.leafs.size(); i++) {
            this.leafs.get(i).setColorOfLeaf(ColorOfLeaf.YELLOW);
        }
        for (int i = 0; i < leafs.size(); i++) {
            System.out.println(leafs.get(i).getColorOfLeaf());
        }

    }

    public void makeLeafsFall() {
        this.leafsOnTree = false;
        this.leafs.removeAll(this.leafs);
        System.out.println("There is " + this.leafs.size() + " leafs on the tree");
    }


}
