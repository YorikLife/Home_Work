package FinalWork;

import FinalWork.api.IPizzeria;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Pizzeria implements IPizzeria {

    @Override
    public Menu getMenu() {
        return getMenu();
    }

    @Override
    public Voucher select(Order order) {
        return select(new Order());
    }

    @Override
    public Map<Voucher, List<String>> getOrderInfo() {
        return getOrderInfo();
    }


    @Override
    public Order getOrder(Voucher voucher) {
        return getOrder(voucher);
    }

    public Pizzeria() {
        Pizzeria pizza = new Pizzeria();
    }
}
