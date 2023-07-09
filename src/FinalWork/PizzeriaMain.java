package FinalWork;


public class PizzeriaMain {
    public static void main(String[] args) {

        Order order = new Order();
        order.toOrder(new PizzaMenu().getForChoose().put("Оригинальная",new PizzaInformation()));
        order.toOrder(new PizzaMenu().getForChoose().put("Баварская",new PizzaInformation()));
        order.toOrder(new PizzaMenu().getForChoose().put("Пепперони",new PizzaInformation()));
        order.toOrder(new PizzaMenu().getForChoose().put("4 сезона",new PizzaInformation()));

        order.getOrder().toString();
        System.out.println(order.getOrder().toString());

                System.out.println();
                System.out.println("Введите название пиццы  из списка для приготовления, с учетом регистра : ");

                    System.out.println("Повторите запрос, произошла ошибка");

    }
}
