package by.ekids.lesson6.cafe;

import java.util.ArrayList;
import java.util.List;

public class CulinaryBook {
    private List<Dish> menu;

    public CulinaryBook(List<Dish> menu) {
        this.menu = menu;
    }

    public CulinaryBook() {
        this.menu = new ArrayList<>();
        menu.add(new Dish(new ArrayList<>(List.of("картофель", "мука", "лук")), 250.5, "драники"));
        menu.add(new Dish(new ArrayList<>(List.of("говядина", "оливковое масло", "соль")), 350.1, "стейк вагю"));
    }

    public List<Dish> getMenu() {
        return menu;
    }
}
