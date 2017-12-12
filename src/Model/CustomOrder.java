
package Model;

public class CustomOrder {
    private String customOrderNo;
    private String OrderDate;
    private String OrderItem;
    private String StartDate;
    private int totalDays;
    private double totalAmount;
    private String payStatus;

    public CustomOrder() {
    }
    
    public CustomOrder(String customOrderNo, String OrderDate, String OrderItem, String StartDate, int totalDays, double totalAmount, String payStatus) {
        this.customOrderNo = customOrderNo;
        this.OrderDate = OrderDate;
        this.OrderItem = OrderItem;
        this.StartDate = StartDate;
        this.totalDays = totalDays;
        this.totalAmount = totalAmount;
        this.payStatus = payStatus;
    }

    public String getCustomOrderNo() {
        return customOrderNo;
    }

    public void setCustomOrderNo(String customOrderNo) {
        this.customOrderNo = customOrderNo;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(String OrderItem) {
        this.OrderItem = OrderItem;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
   
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
}
