public class OrderTester {
    public static void main(String[] args) {
        // Instantiate an OrderQueue with a stock of 18
        OrderQueue orderQueue = new OrderQueue(18);

        // Enqueue three customer orders with a positive balance, and quantities of 7, 7, and 8
        orderQueue.addOrder("Abby", "02/23/07", 7);
        orderQueue.addOrder("Aidan", "08/04/26", 7);
        orderQueue.addOrder("Andrew", "12/03/22", 8);

        // Print the OrderQueue
        System.out.println(orderQueue);

        // Clear the stock by filling as many orders as possible
        orderQueue.sellRemainingStock();

        // Print the OrderQueue
        System.out.println(orderQueue);

        // Add an additional 10 units to stock
        orderQueue.addStock(10);

        // Add three additional customer orders, with quantities of 3, 3, 5

        orderQueue.addOrder("Noah", "11/13/97", 3);
        orderQueue.addOrder("Laura", "05/05/24", 3);
        orderQueue.addOrder("Chris", "06/06/06", 5);

        // Clear the stock by filling as many orders as possible
        orderQueue.sellRemainingStock();

        // Print the OrderQueue
        System.out.println(orderQueue);
    }
}
