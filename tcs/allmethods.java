class cla{
    int add(int a,int b){
        return a + b;
    }
    int add(int a, int b ,int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
    int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
class adcla extends cla {
    @Override
    int add(int a , int b){
        System.out.println("Using AdvancedCalculator's add method");
        return a+b;
    }
}
public class allmethods{
    public static void main(String args[]){
        cla c=new cla();
        cla ad=new adcla();

        System.out.println("Addition of two integers: " + c.add(2, 3));  // Output: 5
        System.out.println("Addition of three integers: " + c.add(2, 3, 4));  // Output: 9
        System.out.println("Addition of two doubles: " + c.add(2.5, 3.5));  // Output: 6.0
        // Method Overriding
        System.out.println("Addition using AdvancedCalculator: " + ad.add(2, 3));  // Output: 5 with a message


        try{
            System.out.println("Division result: " + c.divide(10, 0));  
        }catch (ArithmeticException e){
System.out.println("Error: " + e.getMessage());
        }

    }
}