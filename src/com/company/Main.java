package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	create class Tree using classes  Leaf

	methods
		bloom()
		makeLeafsYellow()
		makeLeafsFall()
	 */
        Leaf leafOfOak1 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak2 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak3 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak4 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak5 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak6 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak7 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        Leaf leafOfOak8 = new Leaf(ColorOfLeaf.RED, ShapeOfLeaf.CANADIAN);
        ArrayList<Leaf> oakLeafs = new ArrayList<>();
        oakLeafs.add(leafOfOak1);
        oakLeafs.add(leafOfOak2);
        oakLeafs.add(leafOfOak3);
        oakLeafs.add(leafOfOak4);
        oakLeafs.add(leafOfOak5);
        oakLeafs.add(leafOfOak6);
        oakLeafs.add(leafOfOak7);
        oakLeafs.add(leafOfOak8);

        Tree treeOak = new Tree("Oak", oakLeafs);

        Leaf leafOfMaple1 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple2 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple3 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple4 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple5 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple6 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        Leaf leafOfMaple7 = new Leaf(ColorOfLeaf.GREEN, ShapeOfLeaf.TRIANGLE);
        ArrayList<Leaf> mapleLeafs = new ArrayList<>();
        mapleLeafs.add(leafOfMaple1);
        mapleLeafs.add(leafOfMaple2);
        mapleLeafs.add(leafOfMaple3);
        mapleLeafs.add(leafOfMaple4);
        mapleLeafs.add(leafOfMaple5);
        mapleLeafs.add(leafOfMaple6);
        mapleLeafs.add(leafOfMaple7);

        Tree treeMaple = new Tree("Maple", mapleLeafs);

        treeOak.bloom();

        treeOak.makeLeafsYellow();

        treeMaple.makeLeafsFall();


    }
}
