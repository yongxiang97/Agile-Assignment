
package Model;


public class Menu {
    private String FoodName;
    private double FoodPrice;
    
    public Menu(){}

    public Menu(String FoodName, double FoodPrice) {
        this.FoodName = FoodName;
        this.FoodPrice = FoodPrice;
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
