package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

public class Check10 {
	public static void main(String[] args) throws IOException {
		String originPath = "text1.txt";
		String copyPath = "copyFile/text2.txt";
		
		InputStream fis = new FileInputStream(originPath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		OutputStream fos = new FileOutputStream(copyPath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
 		File file = new File("copyFile");
		if(!file.exists())
			file.mkdirs();
		
		while(true) {
			
			int str = bis.read();
			if(str == -1)	break;
			System.out.println(str);
		}
		
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
}
