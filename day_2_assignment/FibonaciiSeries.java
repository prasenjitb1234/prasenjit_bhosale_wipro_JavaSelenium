package day_2_assignment;

public class FibonaciiSeries {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(num1 + " ");
            
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
