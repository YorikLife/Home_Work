package FinalWork.api;

import FinalWork.Order;
import FinalWork.Voucher;

import java.awt.*;
import java.util.List;
import java.util.Map;

public interface IPizzeria {
    Menu getMenu();
    Voucher select (Order order);
    Map<Voucher, List<String>> getOrderInfo();
    Order getOrder(Voucher voucher);
}
