package by.ekids.lesson6;

import by.ekids.lesson6.cafe.Cafe;
import by.ekids.lesson6.cafe.CulinaryBook;
import by.ekids.lesson6.cafe.People;
import by.ekids.lesson6.cafe.PeopleService;
import by.ekids.museum.Day;

import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Cafe royal = new Cafe("Royal");
        royal.setWorkingDays(new Day[]{Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY});

        PeopleService hrAgency = new PeopleService();
        royal.setPersonal(hrAgency.getPersonal());

        CulinaryBook culinaryBook = new CulinaryBook();
        royal.setMenu(culinaryBook.getMenu());

        List<People> staff = royal.getPersonal();

        for (People human : staff) {
            System.out.println(human.getName() + " " + human.getSalary());
        }

        Collections.sort(staff);


        for (People human : staff) {
            System.out.println(human.getName() + " " + human.getSalary());
        }

        System.out.println(staff.get(0).equals(staff.get(1)));

    }
}
