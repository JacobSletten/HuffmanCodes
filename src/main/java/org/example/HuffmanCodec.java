package org.example;
import org.w3c.dom.Node;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HuffmanCodec{
    Map<Character, Double> frequency;
    Node huffmanTree;

    public String encode(String filepath) {
        findFrequency(filepath);
        return filepath;
    }

    public String decode(String filepath) {
        return filepath;
    }

    private void findFrequency(String filepath) {
        try {
            frequency = new HashMap<>(); // Create a new frequency map and reader
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            int size = 0;
            int c; // count each char in the file
            while ((c = br.read()) != -1){
                char character = (char) c;
                frequency.put(character, frequency.getOrDefault(character, 0.0) + 1);
                size++;
            }
            System.out.println("# of Occurrences: " + frequency.toString());
            System.out.println("Size:" + size);
            // convert the count of each character to a weighted frequency
            for (Map.Entry<Character, Double> entry: frequency.entrySet()){
                double weight =  (entry.getValue() / size);
                // weight = Math.round(weight * 1000) / 1000.0;
                frequency.put(entry.getKey(), weight);
            }
            System.out.print("Frequency: " + frequency.toString());

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
