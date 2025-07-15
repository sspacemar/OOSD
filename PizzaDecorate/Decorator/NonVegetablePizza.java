public class NonVegetablePizza implements Pizza
{
    @Override
    public String getOrder() {
        return "NonVegetablePizza(360)";
    }
    
    @Override
    public double getPrice() {
        return 360.00;
    }
}
