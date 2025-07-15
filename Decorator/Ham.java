public class Ham extends PizzaDecorator {
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + "Ham(10.00)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 10.00;
    }
}
