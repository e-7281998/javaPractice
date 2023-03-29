package ch18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx_793 {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("text1.txt");
			
			//1문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[] arr = { 'C', 'D', 'E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("Hello");
			
			//버퍼에 잔류하고 있는 문자들 출력, 버퍼 비우기
			writer.flush();
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
