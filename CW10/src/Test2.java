import java.io.*;

public class Test2 {
	public static void main(String[] args) {
		FileInputStream inFile1 = null;
		FileInputStream inFile2 = null;
		SequenceInputStream sequenceStream = null;
		FileOutputStream outFile = null;

		try {
			inFile1 = new FileInputStream("file1.txt");
			inFile2 = new FileInputStream("file2.txt");
			sequenceStream = new SequenceInputStream(inFile1, inFile2);
			outFile = new FileOutputStream("file4.txt");
			int readedByte = sequenceStream.read();
			while (readedByte != -1) {
				outFile.write(readedByte);
				readedByte = sequenceStream.read();
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e.toString());
		} finally {
			try {
				sequenceStream.close();
				outFile.close();
			} catch (IOException e) {
			}
		}
	}
}
