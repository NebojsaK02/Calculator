package calculator.service;

public class DivService {
    public int divide(int a, int b) {
        if(b == 0) throw new IllegalArgumentException("Division by zero!");
        return a / b;
    }
}
