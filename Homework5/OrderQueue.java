import java.util.concurrent.LinkedTransferQueue;

public class OrderQueue {
    // Contains a LinkedQueue of CustomerOrders
    LinkedTransferQueue<CustomerOrder> orderQueue;

    // Contains instance variables for stock (a number), size of queue
    int stock = 0;
    int queueSize = 0;

    // Contains a default constructor to set up an empty queue with no stock
    OrderQueue() {
        orderQueue = new LinkedTransferQueue<>();
    }

    /* Contains a parameterized constructor to set up an order queue, 
     * with a stock that is passed as a parameter 
     */
    OrderQueue(int stock) {
        orderQueue = new LinkedTransferQueue<>();
        this.stock = stock;
    }

    /* Implement a method to add a new order to the queue. 
     * This method should construct a CustomerOrder (taking 
     * all the necessary data), and enqueue it to the order queue.
     */
    public void addOrder(String name, String date, int quantity) {
        CustomerOrder order = new CustomerOrder(name, date, quantity);
        orderQueue.offer(order);
        queueSize++;
    }

    /* Implement a method to add additional stock. This simple 
     * method should take a single integer, and merely add it 
     * to the instance variable stock 
     */
    public void addStock(int amount) {
        stock += amount;
    }

    /* Implement a method that will take the customer at the 
     * front of the queue, and fulfill one of their orders by 
     * decrementing their quantity by one, and the stock in the 
     * OrderQueue by one. If the customers quantity becomes 0, 
     * they should be dequeued.
     */
    public void fulfillOrder() {
        if (stock > 0 && !orderQueue.isEmpty()) {
            CustomerOrder currentOrder = orderQueue.peek();

            if (currentOrder.shipProduct()) {
                orderQueue.poll();
                queueSize--;
            }
            stock--;
        }
    }

    /* Implement a method that will sell the remaining stock to each 
     * customer at the front of the queue until the stock is 0. 
     * You should use a while loop to accomplish this. 
     */
    public void sellRemainingStock() {
        while (stock > 0 && !orderQueue.isEmpty()) {
            fulfillOrder();
        }
    }

    /* Implement a toString method that simply prints the quantity 
     * of the CustomerOrder at the front of the queue.
     */
    @Override
    public String toString() {
        if (!orderQueue.isEmpty()) {
            return "Quantity at front of queue: " + orderQueue.peek().getQuantity();
        }
        return "Queue is empty.";
    }
}
