package oops;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SamirsDocumnet {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your file name : ");
//		String file = sc.next();
//
//		try (FileReader fr = new FileReader(file)) {
//			int read;
//			while ((read = fr.read()) != -1) {
//				System.out.print((char)read);
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.printf("file not found %s", e.getMessage());
//		} catch (IOException e) {
//			System.out.printf("exception occured %s", e.getMessage());
//		}
//		finally
//		{
//			sc.close();
//		}
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your file name : ");
		String file = sc.next();

		FileWriter fw = null;
		try {
			fw = new FileWriter(file , true);
			fw.write(" smart also");
			System.out.println("written succesfully");
		}

		catch (IOException e) {
			System.out.printf("exception occured %s", e.getMessage());
		} finally {
			sc.close();
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
