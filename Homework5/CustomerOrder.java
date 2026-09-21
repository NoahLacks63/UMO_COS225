public class CustomerOrder {
    String name;
    String date;
    int quantity;

    CustomerOrder() {
        name = "Null";
        date = "Null";
        quantity = 0;
    }

    CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public boolean shipProduct() {
        if (quantity > 0) {
            quantity--;
        }

        return quantity <= 0;
    }

    public int getQuantity() {
        return quantity;
    }

}