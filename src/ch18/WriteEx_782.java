package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx_782 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test1.txt");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			//내부 버퍼에 잔류하는 바이트 출력,버퍼 비우기
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
