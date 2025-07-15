
public class Demo
{
    public static void test() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.Execute(10, 5));
        
        context = new Context(new OperationMultiply());
        System.out.println("10 x 5 = " + context.Execute(10, 5));
        
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.Execute(10, 5));
    }
}
