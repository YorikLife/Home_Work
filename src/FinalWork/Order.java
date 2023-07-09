package FinalWork;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<PizzaInformation> order;
    public Order() {
        order = new ArrayList<>();
    }
public void toOrder(PizzaInformation pizzas) {
        order.add(pizzas);
}
    public List<PizzaInformation> getOrder() {
        return order;
    }
}

