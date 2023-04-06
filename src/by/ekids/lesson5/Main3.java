package by.ekids.lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        //List zoo = new ArrayList();
        //List<String> zoo = new ArrayList<String>();
        List<String> zoo = new ArrayList<>();
        zoo.add("жираф");
        zoo.add("слон");
        zoo.add("попугай");
        String tiger = "тигр";

        for (Object animal : zoo) {
            System.out.println(animal);
        }
        zoo.add(tiger);
        //zoo.add(100);
        for (Object animal : zoo) {
            System.out.println(animal);
        }

    }
}
