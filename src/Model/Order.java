package Model;

public class Order {

    private String Food; 
    private String OrderID;
    private String Dlocation;
    private String CustomerID;
    private int Quantity; 
    private double FoodPrice;
    private double subPrice;
    private static double TotalPrice;

    public Order(){}

    public Order(String Food, double FoodPrice,int Quantity, double subPrice, String Dlocation, double TotalPrice) {
        this.Food = Food;
        this.Dlocation = Dlocation;
        this.Quantity = Quantity;
        this.FoodPrice = FoodPrice;
        this.subPrice = subPrice;
        this.TotalPrice = TotalPrice;
    }
    
    public Order(String Food, String OrderID, String Dlocation, String CustomerID, int Quantity, double FoodPrice, double subPrice, double TotalPrice) {
        this.Food = Food;
        this.OrderID = OrderID;
        this.Dlocation = Dlocation;
        this.CustomerID = CustomerID;
        this.Quantity = Quantity;
        this.FoodPrice = FoodPrice;
        this.subPrice = subPrice;
        this.TotalPrice = TotalPrice;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String Food) {
        this.Food = Food;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getDlocation() {
        return Dlocation;
    }

    public void setDlocation(String Dlocation) {
        this.Dlocation = Dlocation;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    public double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(double subPrice) {
        this.subPrice = subPrice;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    
}

    
