import java.io.PipedInputStream;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new NonVegetablePizza();
        System.out.println("Decorate : " + pizza.getOrder());
        System.out.println("Price : " + pizza.getPrice() + "\n" + "------------");

        pizza = new Ham(pizza);
        System.out.println("Decorate : " + pizza.getOrder());
        System.out.println("Price : " + pizza.getPrice() + "\n" + "------------");

        pizza = new VegetablePizza();
        System.out.println("Decorate : " + pizza.getOrder());
        System.out.println("Price : " + pizza.getPrice() + "\n" + "------------");

        pizza = new Broccoli(pizza);
        System.out.println("Decorate : " + pizza.getOrder());
        System.out.println("Price : " + pizza.getPrice() + "\n" + "------------");
    }
}
