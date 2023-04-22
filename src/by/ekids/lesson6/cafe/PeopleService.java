package by.ekids.lesson6.cafe;

import java.util.ArrayList;
import java.util.List;

public class PeopleService {
    private List<People> personal;

    public PeopleService(List<People> personal) {
        this.personal = personal;
    }

    public PeopleService() {
        this.personal = new ArrayList<>();
        personal.add(new People("Иван", "Иванов", 40, 1000));
        personal.add(new People("Джон", "Доу", 50, 10000));
        personal.add(new People("Рамаджан", "Кришна", 25, 860));
    }

    public List<People> getPersonal() {
        return personal;
    }
}
