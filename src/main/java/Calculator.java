public class Calculator {
public int add (int a, int b) {
    return a + b;
}
public int subtract (int a, int b) {
    int result = a - b;
    if (result < 0) {
        throw new ArithmeticException("Cannot subtract from zero");
    }
    return result;
}
public int multiply (int a, int b) {
    long result = a * b;
    if (result < 0) {
        throw new ArithmeticException("Cannot multiply from zero");
    }
    return (int) result;
}
public int divide (int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
}

}
