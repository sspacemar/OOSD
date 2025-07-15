public class VegetablePizza implements Pizza
{
    @Override
    public String getOrder() {
        return "VegetablePizza(230)";
    }
    
    @Override
    public double getPrice() {
        return 230.00;
    }
}
