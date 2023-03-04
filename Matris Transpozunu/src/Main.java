import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] list = {{1, 2, 3}, {4, 5, 6}};
        int[][] newList = new int[list[0].length][list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                newList[j][i] = list[i][j];
            }
        }
        System.out.println(Arrays.deepToString(list));
        System.out.println(Arrays.deepToString(newList));
    }
}