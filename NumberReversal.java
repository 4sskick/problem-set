import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberReversal {

    public static void main(String[] args) {
        double input = 193.56;
        double output = 653.91;

        //reversing the input number exact with dot
        //begin to convert into string
        //replace all dot (.) to ""
        //begin reverse using string builder reverse()
        //convert into array string
        //convert into list by aslist()
        //using add set function of list of given values to add dot(.)

        double expect = reverse(input);
        if(output == expect){
            System.out.println(String.format("equals output: %s\nexpect %s", output, expect));
        }else {
            System.out.println(String.format("doesn't equals output: %s\nexpect %s", output, expect));
        }
    }

    static double reverse(double in) {
        StringBuilder sb = new StringBuilder(String.valueOf(in));

        //65391
        String tmp = sb.reverse().toString().replaceAll("\\.", "");
        List<String> inArr = new ArrayList<>(Arrays.asList(tmp.split("")));
        inArr.add(inArr.size() - 2, ".");

//        System.out.println(inArr);

        return Double.parseDouble(inArr.stream().collect(Collectors.joining()));
    }
}
