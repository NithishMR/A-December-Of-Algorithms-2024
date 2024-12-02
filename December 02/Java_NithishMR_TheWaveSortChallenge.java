import java.util.Arrays;

class Java_NithishMR_TheWaveSortChallenge {
    public static int findlargestIndex(int[] arr,int start, int end){
        int largest = Integer.MIN_VALUE;
        int largestIndex = start;
        for (int i = start; i < end; i++) {
            if( arr[i] > largest){
                largest = arr[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }
    public static int findSmallestIndex(int[] arr,int start, int end){
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = start;
        for (int i = start; i < end; i++) {
            if( arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int end = arr.length;
        boolean findlargest = true;

        for(int i = 0; i < arr.length; i++){
            if(findlargest == true){
                int largestIndex = findlargestIndex(arr,i, end);
                swap(arr, i, largestIndex);
                findlargest = false;
            }
            else{
                int smallestIndex = findSmallestIndex(arr,i, end);
                swap(arr, i, smallestIndex);
                findlargest = true;
            }    
        }
        System.out.println(Arrays.toString(arr));
        // A simple solution. First sort the array and then swap the first two numbers each time until you reach the end of the array
        int[] nums = {1, 2, 3, 4, 5, 6};
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1; i=i+2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
