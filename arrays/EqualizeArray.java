import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class EqualizeArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 3, 2, 1, 3, 5));
        int count = new EqualizeArray().getUniqueCount(list), totalCount = list.size();
        int toEqualizeArr = totalCount - count;
        System.out.println(toEqualizeArr);

    }

    public int getUniqueCount(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        return set.size();
    }

}
