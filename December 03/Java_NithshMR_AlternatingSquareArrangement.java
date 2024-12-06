class Java_NithshMR_AlternatingSquareArrangement{
    public static void buildAlternateString(int R, int B){
        StringBuilder builder = new StringBuilder();
        int i = R;
        int j = B;
        while( i > 0 || j > 0){
            if( i > 0 ){
                builder.append("R");
            }
            if( j > 0 ){
                builder.append("B");
            }
            i--;
            j--;
        }
        System.out.println(builder.toString()) ;
    }
    public static void main(String[] args) {
        int R = 6;
        int B = 6;
        if( Math.abs(R-B) > 1){
            System.out.println("Not possible");
        }
        else if( R < 1 || B < 1){
            System.out.println("Not possible");
        }
        else{
            buildAlternateString(R,B);
            
        }
    }
}