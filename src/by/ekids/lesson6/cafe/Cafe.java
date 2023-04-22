package by.ekids.lesson6.cafe;

import by.ekids.museum.Day;

import java.util.List;

public class Cafe {
    private List<People> personal;
    private List<Dish> menu;
    private String name;
    private Day[] workingDays;

    public Cafe(String name) {
        this.name = name;
    }

    public List<People> getPersonal() {
        return personal;
    }

    public void setPersonal(List<People> personal) {
        this.personal = personal;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Day[] getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Day[] workingDays) {
        this.workingDays = workingDays;
    }
}
