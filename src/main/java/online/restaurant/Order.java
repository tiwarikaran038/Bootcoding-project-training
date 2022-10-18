package online.restaurant;

public class Order {

    private String name;
    private String fooditemother;
    private int quantity;
    private String deliveryaddress;
    private long orderId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFooditemother() {
        return fooditemother;
    }

    public void setFooditemother(String fooditemother) {
        this.fooditemother = fooditemother;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
