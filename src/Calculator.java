import Operations.Operation;

public class Calculator {
    int first;
    int second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        char op =  '-';
        int first = 1;
        int second = 2;

        Resolver resolver = new Resolver();
        Operation operation = resolver.resolve(op);
        System.out.println(operation.operate(first,second));
    }
}
