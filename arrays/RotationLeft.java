import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class RotationLeft {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            a.add(i, i);
        }

        List<Integer> result = Result.rotLeft(a, 15);
        System.out.println("a: " + a);
        System.out.println("result: " + result);
    }
}

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) { // Write your code here
        List<Integer> rotatedList = new ArrayList<>();
        int i = 0;
        int rotationIndex = d;
        // System.out.println(a.size());
        while (rotationIndex < a.size()) {

            rotatedList.add(i, a.get(rotationIndex));

            i++;
            rotationIndex++;
        }

        // i=0;
        rotationIndex =0;

        // while (i <= d) {
            while (rotationIndex <= d) {
            rotatedList.add(i, a.get(rotationIndex));
            i++;
            rotationIndex++;
        }

        return rotatedList;

    }

    }

    

    
