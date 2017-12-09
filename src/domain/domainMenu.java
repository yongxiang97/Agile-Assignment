package domain;


import domain.MenuInterface;

public class domainMenu implements MenuInterface{
    private String foodname;
    private double foodprice;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(double foodprice) {
        this.foodprice = foodprice;
    }
}