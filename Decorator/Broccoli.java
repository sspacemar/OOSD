public class Broccoli extends PizzaDecorator {
    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + "Broccoli(5.00)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.00;
    }
}
