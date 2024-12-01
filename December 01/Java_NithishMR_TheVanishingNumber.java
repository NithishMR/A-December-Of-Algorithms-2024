import java.util.Scanner;
class Java_NithishMR_TheVanishingNumber{
    public static int findMissingNumber(int[] num){
        for (int i = 0; i < num.length; i++) {
            int correct = i + 1;
            if( num[i] != correct){
                return correct;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int N = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        int result = findMissingNumber(array);
        if( result == -1){
            System.out.println("No missing number");
        }
        else{
            System.out.println("The missing number is "+ result);
        }
        
    }
}