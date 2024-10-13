// Base class: Calculator
class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }
}

// Derived class: AdvancedCalculator
class AdvancedCalculator extends Calculator {
    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public double divide(int a, int b) {
       
        return a / b;
    }
}

// Main class to test the calculator
public class Main {
    public static void main(String[] args) {
       
    // Creating an object of the derived class
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Addition: " + advCalc.add(10, 5));           
        System.out.println("Subtraction: " + advCalc.subtract(10, 5));    
        System.out.println("Multiplication: " + advCalc.multiply(10, 5)); 
        System.out.println("Division: " + advCalc.divide(10, 5));        
    }
}
