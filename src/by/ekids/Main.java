package by.ekids;

public class Main {
    public static void main(String[] args) {
        School school1 = new School();
        school1.open();
        System.out.println("число студентов в школе " + school1.getNumberOfStudents());

//        Gimasium gimasium1 = new Gimasium("Гимназия 3");
//        gimasium1.open();
//        System.out.println(gimasium1.getNumberOfStudents());

        School school2 = new School("Школа 2");
        school2.open();
    }
}