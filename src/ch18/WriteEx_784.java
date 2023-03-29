package ch18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//바이트 배열 출력하기
public class WriteEx_784 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test1.db");
			
			byte[] arr = { 10, 20, 30, 40, 50};
			
			os.write(arr);
			//배열 일부분만 출력
			//os.write(arr, 1, 3);
			
			os.flush();
			os.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
