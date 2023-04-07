package ch18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Check07 {
	public static void main(String[] args) throws Exception {
		String filePath = "text1.txt";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData==null)
				break;
			System.out.println((++rowNumber)+": "+rowData );
		}		
		br.close();
	}
}
