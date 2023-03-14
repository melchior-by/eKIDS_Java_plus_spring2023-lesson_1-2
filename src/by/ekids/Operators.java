package by.ekids;

public class Operators {
    public static void main(String[] args) {
        //арифметические операции
        System.out.println(2 + 3);
        System.out.println(2 - 3);
        System.out.println(2 * 3);
        System.out.println(2 / 3);
        System.out.println(2.0 / 3);

        //логические
        //= присваивание
        //== сравнение
        System.out.println(2 == 3);
        System.out.println(3 == 3);
        System.out.println(3 != 3);

        //унарные операции
        int i = 0;
        System.out.println(i++);//i = i + 1;
        System.out.println(++i);//i = i + 1;

        if(i > 0) {
            System.out.println("i больше 0");
        }

        if(i > 0) {
            System.out.println("i больше 0");
        } else {
            System.out.println("i меньше либо равно 0");
        }

        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(j);
        }

    }
}
