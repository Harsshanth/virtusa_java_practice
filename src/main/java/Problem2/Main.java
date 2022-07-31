package Problem2;

public class Main {
    public static void main(String[] args) {
        Number obj = new Number(2);
        System.out.println("isZero: " +obj.isZero());
        System.out.println("isPositive: " + obj.isPositive());
        System.out.println("isNegative: " + obj.isNegative());
        System.out.println("isEven: " + obj.isEven());
        System.out.println("isOdd: " +obj.isOdd());
        System.out.println("isArmstrong: " +obj.isAmstrong());
        System.out.println("isPrime: " +obj.isPrime());
        System.out.println("Factorial: " +obj.getFactorial());
        System.out.println("Reverse: " +obj.getReverse());
        System.out.println("sqr: " +obj.getSqr());
        System.out.println("sqrt: " +obj.getSqrt());
        System.out.println("Sum of digits: " +obj.sumDigits());
        System.out.println("Binary: ");
        obj.dispBinary();
        System.out.println("Factors");
        obj.factor();
    }
}
