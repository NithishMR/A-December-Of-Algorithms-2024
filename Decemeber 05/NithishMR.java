import java.util.ArrayList;
import java.util.Scanner;

class NithishMR {
    public static int survivingPosition(int n, int k){
        ArrayList<Integer> members = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++ ){
            members.add(i);
        }
        int i = 0; 
        while ( n > 1){
            int turns = k;
            while (turns > 1) {
                i = (i+1) % members.size();
                turns--;
            }
            members.remove(i);
            n--;
        }
        return members.get(0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter no of players: ");
        //System.out.println("Enter k value");
        //int n = scan.nextInt();
        ////int n = scan.nextInt();
        int n = 5;
        int k = 3;
        scan.close();
        System.out.println("The index in which you can survive is : "+
        survivingPosition(n, k));
    }
}
