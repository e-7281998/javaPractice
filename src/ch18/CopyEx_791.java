package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx_791 {
	public static void main(String[] args) {
		String originFile = "test1.db";
		String targetFile = "test2.db";
		
		try {
			InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(targetFile);
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				os.write(data, 0, num);
			}
			
			os.flush();
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
