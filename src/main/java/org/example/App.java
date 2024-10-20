package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HuffmanCodec codec = new HuffmanCodec();
        codec.encode("src/main/resources/dummyFile.txt");
    }
}
