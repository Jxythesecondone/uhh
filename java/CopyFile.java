import java.io.*;
class CopyFile {

	public static void main(String[] args) {
		byte byteRead;
		FileInputStream inFile = null;
		FileOutputStream outFile = null;

		try {
			inFile = new FileInputStream("in.txt");
			outFile = new FileOutputStream("out.txt");
			do {
				byteRead = (byte)inFile.read();
				outFile.write(byteRead);
			}

			while(byteRead!=1);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				inFile.close();
				outFile.close();
			}
			catch(IOException e) { }
		}
	}
}