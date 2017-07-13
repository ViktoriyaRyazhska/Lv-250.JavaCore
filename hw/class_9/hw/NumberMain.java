package task07_07.lesson.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 09.07.2017.
 */
public class NumberMain {
    int number;
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NumberMain nm = new NumberMain();

        int a = 0;
        int b = 0;
        System.out.println("Input start: ");
        try {
            a = Integer.parseInt(reader.readLine());
            System.out.println("Input end: ");
            b = Integer.parseInt(reader.readLine());
            System.out.println("and now input your number");
            nm.number = Integer.parseInt(reader.readLine());
        }catch (NumberFormatException e){
            System.err.println(e);
        }

        nm.readNumber(a, b);


    }
    public int readNumber(int start, int end) throws IOException {

            if (this.number >= start && this.number <= end)
                return this.number;
            return 0;
    }

}
