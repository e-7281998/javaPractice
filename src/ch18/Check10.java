package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Check10 {
	public static void main(String[] args) throws IOException {	
				
 		File ofile = new File("text1.txt");
 		File cfile = new File("copyFile");
		String cPath = "copyFile/text2.txt";
 
		System.out.println("원본 파일 경로 : " +ofile);
 		System.out.println("복사 파일 경로 : " +cPath);
 		
		if(!ofile.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}
		if(!cfile.exists())
			cfile.mkdir();
		
		FileInputStream is = new FileInputStream(ofile);
		FileOutputStream os = new FileOutputStream(cPath);
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);

		while(true) {
			int str = bis.read();
			if(str == -1)
				break; 
			bos.write((char)str);
		}
		System.out.println(ofile + "파일을 "+cPath+"파일에 복사하였습니다.");
		
		bis.close();
		is.close();
		bos.flush();
		bos.close();
		os.close(); 
	}
}
