package ch18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineEx_803 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
								new FileReader("src/ch18/BufferEx_801.java"));
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo+"\t"+str);
			lineNo++;
		}
		
		br.close();
	}
}
