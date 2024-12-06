import java.util.Scanner;
class Java_NithishMR_PlantGrowthTracker {
    public static int findMonths(int months){
        int first = 0;
        int second = 1;
        int third = 0;
        if( months < 2 ){
            return months;
        }

        for(int i = 1; i < months;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of months: ");
        int months = scan.nextInt();
        scan.close();
        System.out.println("No of plants:" + findMonths(months));
    }
}
