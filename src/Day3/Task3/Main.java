package Day3.Task3;

public class Main {
    public static void main(String[] args) {


        OrderItem orderItem1 = new OrderItem("Chleb", 1, 3.5);
        OrderItem orderItem2 = new OrderItem("Mąka", 2, 4.00);
        OrderItem orderItem3 = new OrderItem("Cukier", 3, 12.00);
        OrderItem orderItem4 = new OrderItem("Jajka", 3, 12.00);
        OrderItem orderItem5 = new OrderItem("Jajka", 3, 12.00);
        OrderItem orderItem6 = new OrderItem("Jajka", 3, 12.00);

        Order order = new Order((6));
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);

        order.print();


    }
}