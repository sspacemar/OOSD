public class GreenOak extends PizzaDecorator
{
    private final Pizza pizza;
    
    public GreenOak(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getOrder() {
        return pizza.getOrder() + "GreenOak(20.00)";
    }
    
    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.00;
    }
}
