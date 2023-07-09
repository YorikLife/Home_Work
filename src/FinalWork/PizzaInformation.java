package FinalWork;

import java.util.ArrayList;
import java.util.List;

public class PizzaInformation {
private String name;
private List<String> StatusPreparing;
private List<String> ingredients;

    public PizzaInformation(String name, List<String> statusPreparing, List<String> ingredients) {
        this.name = name;
        this.StatusPreparing = statusPreparing;
        this.ingredients = ingredients;
    }

    public PizzaInformation() {

    }

    public String getName() {
        return name;
    }
    public int TimeForCooks() {
        return 30;
    }

    @Override
    public String toString() {
        return "Пицца : " + getName();
    }

    public PizzaInformation(List<String> ingredients) {
        ingredients = new ArrayList<String>();
        ingredients.add("Сыр");
        ingredients.add("Пепперони");
        ingredients.add("Бекон");
        ingredients.add("Оливки");
        ingredients.add("Помидоры");
        ingredients.add("Лимон");
        ingredients.add("Филе Куриное");
        ingredients.add("Шампиньоны");
        ingredients.add("Перец");
        ingredients.add("Креветки");
    }
}
