import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParseString {

    public static void main(String[] args) {
        String input = "123 -98 -4 12 64 17 999 1024 -444";
        List<Integer[]> list = parse(input);
        System.out.println("Массив четных чисел по возрастанию:");
        for(Integer in: list.get(0)) {
            System.out.println(in);
        }
        System.out.println("Массив нечетных чисел по убыванию:");
        for(Integer in: list.get(1)) {
            System.out.println(in);
        }

    }

    private static List<Integer[]> parse(String input){
        String[] array = input.split(" ");
        int[] inputIntArray = new int[array.length];
        int evenCount = 0;
        for (int i = 0; i < inputIntArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(array[i]);
            if (inputIntArray[i] % 2 == 0) evenCount++;
        }
        Integer[] even = new Integer[evenCount];
        Integer[] odd = new Integer[array.length - evenCount];
        int eCount = 0;
        int oCount = 0;
        for (String s: array) {
            int next = Integer.parseInt(s);
            if(next % 2 == 0) {
                even[eCount] = next;
                eCount++;
            }
            else {
                odd[oCount] = next;
                oCount++;
            }
        }
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());
        output.add(even);
        output.add(odd);
        return output;
    }
}
