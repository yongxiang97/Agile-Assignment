
package Model;


public class Menu {
    private String FoodName;
    private double FoodPrice;
    private String RestName;

    public Menu(String FoodName, double FoodPrice, String RestName) {
        this.FoodName = FoodName;
        this.FoodPrice = FoodPrice;
        this.RestName = RestName;
    }
    public Menu(){}

    
    public String getRestName() {
        return RestName;
    }

    public void setRestName(String RestName) {
        this.RestName = RestName;
    }
    

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }
}
