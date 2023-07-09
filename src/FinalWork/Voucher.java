package FinalWork;

import FinalWork.api.IPizzeria;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Voucher implements IPizzeria {
public double TimeOfOrder;
public double NumberOfOrder;

    public Voucher(double timeOfOrder, double numberOfOrder) {
        this.TimeOfOrder = timeOfOrder;
        this.NumberOfOrder = numberOfOrder;
    }

    public double getTimeOfOrder() {
        return TimeOfOrder;
    }

    @Override
    public String toString() {
        return "Заказ № " + TimeOfOrder + NumberOfOrder;
    }

    public double getNumberOfOrder() {
        return NumberOfOrder;
    }

    @Override
    public Menu getMenu() {
        return new Menu();
    }

    @Override
    public Voucher select(Order order) {
        return null;
    }

    @Override
    public Map<Voucher, List<String>> getOrderInfo() {
        return null;
    }

    @Override
    public Order getOrder(Voucher voucher) {
        return null;
    }
}
