public class AddSubstract {


    //given an array
    //if length odd then all numbers do sum operation,
    //then for middle/median index of array do subtract operation
    //otherwise if length even, then just return 0;
    public static void main(String[] args) {
        int[] input = {80, 30, 80};
        int output = 30;

        int expect = addSub(input);
        System.out.println(String.format("output: %s\nexpect %s", output, expect));
    }

    private static int addSub(int[] in) {
        int tmp = 0;

        if (in.length % 2 == 0)
            return 0;
        else {
            int mid_ind = in.length / 2;

            for (int i = 0; i < in.length; i++) {
                if (i == mid_ind) {
                    tmp -= in[mid_ind];
                } else {
                    tmp += in[mid_ind];
                }
            }
        }

        return tmp;
    }
}
