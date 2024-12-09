class Java_NithishMR_CustomerReturnFrequency {
    public static int findFrequency(int[] nums){
        int result = 0;
        for( int num : nums){
            if( num == 1 ){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 0, 3, 1, 4, 1};
        // int arr[] = {4, 3, 7, 2, 1, 0, 2, 1, 3} 2
        System.out.println("Result: "+ findFrequency(arr));
    }    
}
