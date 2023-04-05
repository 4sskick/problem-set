import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Reversal {

    public static void main(String[] args){
        String input = "Codecademy is the best";
        String output = "Best the is Codecademy".toLowerCase();

        // split to be an array string by whitespace
        // loop through array string to be a string using string builder
        // reversing string using function reverse() of string builder
        String expect = reverse(input);

        if(output.toLowerCase().equals(expect))
            System.out.println(String.format("equals: out %s expect %s", output, expect));
        else{
            System.out.println(String.format("doesn't equals: out %s expect %s", output, expect));
        }
    }

    static String reverse(String in){
//        String[] inArr = in.toLowerCase().split(" ");
        List<String> inArr = Arrays.asList(in.toLowerCase().split(" "));
        Collections.reverse(inArr);

        StringBuilder sb = new StringBuilder();


//        for (int i = inArr.length-1; i >= 0; i--) {
        for (int i = 0; i < inArr.size(); i++) {
//            sb.append(inArr[i]).append(" ");
            sb.append(inArr.get(i)).append(" ");

        }

//        return sb/*.reverse()*/.toString().toLowerCase().trim();
        return inArr.stream().collect(Collectors.joining(" "));
    }
}
