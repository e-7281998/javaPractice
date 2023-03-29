package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx_787 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("test1.db");
			
			while(true) {
				int data = is.read();
				if(data == -1)	break;
				System.out.println(data);
			}
			
		} catch ( FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
