package FinalWork;


import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {

    private Map<String, PizzaInformation> forChoose;
    public PizzaMenu() {
        forChoose = new HashMap<>();
        forChoose.put("Оригинальная", new PizzaInformation());
        forChoose.put("4 сезона", new PizzaInformation());
        forChoose.put("Баварская", new PizzaInformation());
        forChoose.put("Пепперони", new PizzaInformation());
    }

    public Map<String, PizzaInformation> getForChoose() {
        return forChoose;
    }
}
