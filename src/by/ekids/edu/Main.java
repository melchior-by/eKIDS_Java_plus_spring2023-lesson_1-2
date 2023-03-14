package by.ekids.edu;

import by.ekids.School;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.open();
        school.printCurrentActivity();
        school.printCurrentActivity("происходит отмечание 8 марта");
        school.printCurrentActivity("сдается ЕГЭ", 100);

        Liceum liceum = new Liceum();
        liceum.printCurrentActivity();
        liceum.printCurrentActivity("происходит встреча с арабским шейхом");
        liceum.printCurrentActivity("сдается ЕГЭ", 50);

    }
}
