package Pizzeria;

import api.IOrder;
import config.Config;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }
}
