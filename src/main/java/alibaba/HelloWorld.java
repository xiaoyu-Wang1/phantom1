package alibaba;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String helloWorld = "hello world!";
        System.out.println(helloWorld);
        int [] x = {1, 2};
        System.out.println(Arrays.toString(x));

        System.out.println("true".equals(Boolean.TRUE.toString()));
    }

    static void changeArr(int[] x) {
        x[1] = 3;
    }
}
