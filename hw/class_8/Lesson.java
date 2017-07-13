package task8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 08.07.2017.
 */
public class Lesson {
    public static void main(String[] args) {
        //1
        String s = "IT";
        String st = "IT Academy";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(st);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }

        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your surname, name and patronymic");
        String pip = scanner.nextLine();

        Pattern pattern = Pattern.compile("([A-z]+)\\s+([A-z]+)\\s+([A-z]+)");
        Matcher m2 = pattern.matcher(pip);
        m2.find();
        System.out.println(m2.group(1) + " " + m2.group(2).charAt(0) + " " + m2.group(3).charAt(0));
        System.out.println(m2.group(2));
        System.out.println(m2.group(2) + " " + m2.group(3) + " " + m2.group(1));

        //3
        String[] users = new String[5];
        for (int i = 0; i < 5; i++) {
            users[i] = scanner.nextLine();
        }

        Pattern pattern2 = Pattern.compile("[A-z0-9_]{3,15}");
        Matcher m3 = pattern2.matcher("");

        for (String temp: users){
            m3.reset(s);
            if(m3.matches())
                System.out.println("User name " + temp + " is valid");
            else
                System.out.println("User name " + temp + " is invalid");
        }

    }
}
