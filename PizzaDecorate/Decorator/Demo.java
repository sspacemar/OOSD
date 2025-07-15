public class Demo
{
    public static void test() {
        Pizza pizza = new VegetablePizza();
        System.out.println("Decorate: " + pizza.getOrder());
        System.out.println("Price: " + pizza.getPrice() + "\n" + "--------");
        
        pizza = new GreenOak(pizza);
        System.out.println("Decorate: " + pizza.getOrder());
        System.out.println("Price: " + pizza.getPrice() + "\n" + "--------");
        
        pizza = new NonVegetablePizza();
        System.out.println("Decorate: " + pizza.getOrder());
        System.out.println("Price: " + pizza.getPrice() + "\n" + "--------");
        
        pizza = new Ham(pizza);
        System.out.println("Decorate: " + pizza.getOrder());
        System.out.println("Price: " + pizza.getPrice() + "\n" + "--------");
    }
}
