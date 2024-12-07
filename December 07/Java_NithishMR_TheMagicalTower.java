import java.util.ArrayList;
import java.util.List;

public class Java_NithishMR_TheMagicalTower {
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> tower = new ArrayList<>();
        for(int i = 0; i < numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i ;j ++){
                if( j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int value = tower.get(i-1).get(j-1) + tower.get(i-1).get(j);
                    row.add(value);
                }
            }
            tower.add(row);
        }
        return tower;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> tower = generatePascalTriangle(numRows);
        for (List<Integer> floor : tower) {
            System.out.println(floor);
        }
    }
}
