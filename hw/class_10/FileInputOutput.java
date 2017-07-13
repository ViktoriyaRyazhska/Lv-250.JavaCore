package class_10;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 11.07.2017.
 */
public class FileInputOutput {
    public static void main(String[] args) {

        List<String> fileLines = new ArrayList<String>();
        String file = "E:/mytext.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);
                System.out.println(fileLines.get(i));
                i++;
            }
        } catch (IOException x) {
            System.err.println(x);
        } finally {
            try {
                reader.close();
            }catch (IOException io){
                System.err.println(io);
            }

        }

        int maxLine = 0;
        int minLine = fileLines.get(0).length();
        for (String s: fileLines){
            int length = s.length();
            System.out.println(length);
            if(maxLine < length)
                maxLine = length;
            if(minLine > length)
                minLine = length;
        }
        System.out.println("Max line = " + maxLine + ", Min line = " + minLine);

        Pattern p = Pattern.compile("var");
        Matcher m = p.matcher("");

        for (String s: fileLines){
           m.reset(s);
            if(m.find())
                System.out.println(s);
        }

    }
}
