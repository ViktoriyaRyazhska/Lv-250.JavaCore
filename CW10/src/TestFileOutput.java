import java.io.*;
public class TestFileOutput {
public static void main(String[] args) {
byte[] r = new byte[10];
String fileName = "test.txt";
FileInputStream inFile;
try {
inFile = new FileInputStream(fileName);
System.out.println("Input file was opened.");
int bytesAv = inFile.available();     // Bytes count
System.out.println("Bytes count: " + bytesAv + " Bytes");
int count = inFile.read(r, 0, bytesAv);
System.out.println("Was readed: " + count + " bytes.");
System.out.println(r[0] + " " + r[1] + " " + r[2]);
inFile.close();
System.out.println("Input stream was closed.");
} catch (IOException e) {
System.out.println("File Read/Write Error: " + fileName);
} } }
