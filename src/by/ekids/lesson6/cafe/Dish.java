package by.ekids.lesson6.cafe;

import java.util.List;

public class Dish {
    private List<String> ingredients;
    private Double weight;
    private String name;

    public Dish(List<String> ingredients, Double weight, String name) {
        this.ingredients = ingredients;
        this.weight = weight;
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
