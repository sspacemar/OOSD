public class VegetablePizza implements Pizza {
    
    @Override
    public String getOrder() {
        return "VegetablePizza(250)";
    }

    @Override
    public double getPrice() {
        return 250.00;
    }
}
