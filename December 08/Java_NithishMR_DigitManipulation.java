import java.util.Scanner;

class Java_NithishMR_DigitManipulation {
    public static int findSquareSum(int n){
        int solution = 0;
        for(int i = 1; i <= n; i++){
            int num = i;
            int sum = 0;
            while(num != 0){
                int rem = num % 10;
                sum = sum + (int)(Math.pow(rem,2));
                num = num / 10;
            }
            // System.out.println("Sum of "+ i + "is: "+sum);
            solution = solution + sum;
        }
        return solution;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scan.nextInt();
        System.out.println("Total sum of square number from 1 to "+ n + " is: "+findSquareSum(n));
        scan.close();
    }    
}
