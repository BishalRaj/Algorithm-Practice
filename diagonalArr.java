import java.util.Arrays;
import java.util.List;

public class diagonalArr {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 1, 1),
                Arrays.asList(55, 3, 1),
                Arrays.asList(8, 9, 2));

        int firstArr = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if (i == j) {
                    firstArr = firstArr + arr.get(i).get(j);
                }
            }
        }

        int counter = 0;
        int secondArr = 0;
        for (List<Integer> list : arr) {
            secondArr = secondArr + list.get(list.size() - counter - 1);
            counter++;
        }

        int diagonalDiff = Math.abs(firstArr - secondArr);
        System.out.println("firstArray: " + firstArr);
        System.out.println("secondArray: " + secondArr);
        System.out.println("difference " + diagonalDiff);
    }
}
