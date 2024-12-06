import java.util.ArrayList;

class Java_NithishMR_TargetPairFinder {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<>();
        int[] arr = {10, 15, 3, 7, 8, 12, 5};
        int target = 20;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++ ){
                if(arr[i] + arr[j] == target ){
                    String ans = "(" + arr[i] + "," + arr[j]+")";
                    answer.add(ans);
                }
            }
        }
        if(answer.isEmpty()){
            System.out.println("No answer foudn");
        }
        else{
            System.out.println(answer);
        }
        
    }
}
