package class_10.hw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 11.07.2017.
 */
public class MainThreads {
    public static void main(String[] args) {
       // 1
        Thread1 thread1 = new Thread1("Thread1");
        Thread2 thread2 = new Thread2("Tread2");

        thread2.start();
        thread1.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException in){
            System.err.println(in);
        }

        //3

        ThreadThree threadThree = new ThreadThree("Three");
        ThreadTwo threadTwo = new ThreadTwo("Two", threadThree);
        ThreadOne threadOne = new ThreadOne("One", threadTwo);

        threadOne.start();

        //4.1

        List<String> list = new ArrayList<String>();
        String file = "E:/file1.txt";
        String file2 = "E:/file2.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                list.add(line);
                System.out.println(list.get(i));
                i++;
            }
            System.out.println(i);
            writer.write(i);
           // writer.flush();
        } catch (IOException x) {
            x.printStackTrace();
        }

        //4.2

        int maxLength = 0;
        String maxLine = "";
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).length() > maxLength){
                maxLength = list.get(i).length();
                maxLine = list.get(i);
            }
        }
        try {
            writer.write(maxLine);
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if(reader != null )
                try {
                    reader.close();
                }catch (IOException io){
                    io.printStackTrace();
                }
            if (writer != null)
                try {
                    writer.close();
                }catch (IOException io){
                    io.printStackTrace();
                }

        }

        //4.3

        Pattern p = Pattern.compile("Nataliia\\s+[A-z]+");
        Pattern p2 = Pattern.compile("[A-z]*\\s*+24\\s*");
        Matcher m = p.matcher("");
        Matcher m2 = p2.matcher("");

        for (String s: list){
            m.reset(s);
            m2.reset(s);
            if(m.find())
                System.out.println(s);
            if(m2.find())
                System.out.println(s);
        }

        System.out.println("Main over");
    }
}
