public abstract class PizzaDecorator implements Pizza {
    
    @Override
    public String getOrder() {
        return "Toppings";
    }
}
