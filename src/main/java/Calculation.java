import packages.CalculatorApplication;

public class Calculation
{
public static void main(String args[])
{
CalculatorApplication calc = new CalculatorApplication();
System.out.println("Addition result: "+calc.add(6,3));
System.out.println("Subraction result: "+calc.subtract(7,3));
System.out.println("Multiplication result: "+calc.multiply(4,2));
System.out.println("Division result: "+calc.divide(10,5));
}
}
