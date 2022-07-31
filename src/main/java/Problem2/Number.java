package Problem2;

public class Number {
    private double number;
    Number() {
        number = 0;
    }
    Number(double number) {
        this.number = number;
    }

    public boolean isZero() {
        if(number == 0)
            return true;
        return false;
    }

    public boolean isPositive() {
        if(number >= 0)
            return true;
        return false;
    }

    public boolean isNegative() {
        if(number < 0)
            return true;
        return false;
    }

    public boolean isEven() {
        if(number%2 == 0)
            return true;
        return false;
    }

    public boolean isOdd() {
        if(number%2 != 0)
            return true;
        return false;
    }

    public boolean isPrime() {
        if(number >= 0 && number < 3)
            return true;
        for(int i = 3; i < number/2; i = i+2) {
            if(number%i == 0)
                return false;
        }
        return true;
    }

    public boolean isAmstrong() {
        int armstrong = 0;
        int temp = (int)number;
        int digits = 0;
        while(temp != 0) {
            temp = temp/10;
            digits++;
        }
        temp = (int)number;
        while(temp != 0){
            int num = temp%10;
            armstrong = armstrong + (int)Math.pow(num,digits);
            temp = temp/10;
        }
        if(armstrong == (int)number)
            return true;
        return false;
    }

    public double getFactorial() {
        double fact = 1;
        for(int i = 1; i <= number; i++){
            System.out.println(fact);
            fact = fact * i;
        }
        return fact;
    }

    public double getSqrt() {
        return Math.sqrt(number);
    }

    public double getSqr() {
        return Math.pow(number,2);
    }

    public  double sumDigits() {
        double sum = 0;
        double temp = number;
        while(temp > 0 && temp < 1) {
            sum = sum + (temp%10);
            temp = temp/10;
        }
        return sum;
    }

    public double getReverse() {
        double rev = 0;
        int temp = (int)number;
        while(temp != 0 ) {
            rev = (rev*10) + (temp%10);
            temp = temp/10;
//            System.out.println(rev);
        }
        return rev;
    }

    public void factor() {
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void dispBinary() {
        System.out.println(Integer.toBinaryString((int)number));
    }


}
