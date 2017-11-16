
package Model;


public class Order {
    
        private String Food;
        private double FoodPrice;
        private int Quantity; 

        public Order(){
        }

    public Order(String Food, double FoodPrice, int Quantity) {
        this.Food = Food;
        this.FoodPrice = FoodPrice;
        this.Quantity = Quantity;
    }
        
    public String getFood() {
        return Food;
    }

    public void setFood(String Food) {
        this.Food = Food;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}
