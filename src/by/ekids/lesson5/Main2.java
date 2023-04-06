package by.ekids.lesson5;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] zoo = new String[3];
        zoo[0] = "жираф";
        zoo[1] = "слон";
        zoo[2] = "попугай";
        String tiger = "тигр";

        for (String animal : zoo) {
            System.out.println(animal);
        }

        String[] zoo2 = Arrays.copyOf(zoo, 4);
        //elementData[s] = e;
        zoo2[3] = tiger;
        for (String animal : zoo2) {
            System.out.println(animal);
        }
    }//zoo, zoo2 -> deleted
}
