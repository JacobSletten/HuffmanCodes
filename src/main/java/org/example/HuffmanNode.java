package org.example;

public class HuffmanNode {
    double weight;
    char character;
    HuffmanNode left, right;

    public HuffmanNode(double weight, char character) {
        this.weight = weight;
        this.character = character;
        left = right = null;
    }
}
