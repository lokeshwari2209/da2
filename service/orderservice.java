import java.util.*;

public class OrderService {
    private Map<Integer, String> orders = new HashMap<>();

    public String placeOrder(int id, String item) {
        if(orders.containsKey(id)) {
            return "Duplicate Order";
        }
        orders.put(id, item);
        return "Order Placed";
    }

    public String trackOrder(int id) {
        return orders.getOrDefault(id, "Not Found");
    }
}