import Operations.*;

public class Resolver {
    public Operation resolve(char op) {
        switch (op) {
            case '+':
                return new Add();
            case '-':
                return new Subtract();
            case '*':
                return new Multiply();
            case '/':
                return new Divide();
        }
        return null;
    }
}
