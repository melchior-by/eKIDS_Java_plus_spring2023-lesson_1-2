package by.ekids;

public class School extends ScienceOrganisation {
    //переменные
    //простые, primitive
    //целочисленные
    //byte -127 - 127
    //short -32000 - 32000
    //int
    //long
    private int numberOfStudents; //10
    private int numberOfTeachers;
    private long funds = 1_000_000L;

    //дробные
    private float averageHeight = 150.5F;
    private double averageMarks = 8.5;

    //char
    final private char symbol = 'c';

    //логический
    private boolean gimnasium = true;

    //сложные, объектные, ссылочные
    private String name = "Школа №1"; //null
    private String area = new String("Минский");

    public School(String name) {
        super(name.length() * 100.1);
        this.name = name;
    }


    public void open() {
        System.out.println(name + " открылась");
    }

    protected int getNumberOfStudents() {
        return numberOfStudents;
    }

    public School(int aNumberOfStudents, int numberOfTeachers, long funds, float averageHeight, double averageMarks, boolean gimnasium, String name, String area) {
        super(aNumberOfStudents * 50.5);
        numberOfStudents = aNumberOfStudents;
        this.numberOfTeachers = numberOfTeachers;
        this.funds = funds;
        this.averageHeight = averageHeight;
        this.averageMarks = averageMarks;
        this.gimnasium = gimnasium;
        this.name = name;
        this.area = area;
    }

    public School() {
        super(null);
    }

    public void printCurrentActivity() {
        System.out.println("все по плану обчения, ученики учатся");
    }

    public void printCurrentActivity(String action) {
        System.out.println(action);
    }

    public void printCurrentActivity(String action, int participants) {
        System.out.println(action);
        System.out.println("в нем участвует " + participants + " учеников");
    }


}
