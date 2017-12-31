import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		String strInput = "";
		int start = 0, end =0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string to substring");
			strInput = in.readLine();
			System.out.println("Enter the start index");
			start = sc.nextInt();
			System.out.println("Enter the end index");
			end = sc.nextInt();
			System.out.println("THe substring is " + substring(strInput, start, end));
		} catch (IOException e) {
			// TODO Auto-geneßrated catch block
			e.printStackTrace();
		}
	}

	private static String substring(String strInput, int start, int end) {
		// TODO Auto-generated method stub
		char[] chrs = strInput.toCharArray();
		if (start > chrs.length-1 || end > chrs.length -1 || start > end ) {
			return null;
		}
		int index = start;
		StringBuffer strBuf = new StringBuffer();
		while (index <= end) {
			strBuf.append(chrs[index]);
			index++;
	
		}
		return strBuf.toString();
	}
	
}
