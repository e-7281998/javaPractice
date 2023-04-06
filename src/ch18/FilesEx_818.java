package ch18;

import java.io.IOError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx_818 {
	public static void main(String[] args) { 
		try {
			String data = "" + "id:ltm \n" +"email: ltm@shinee.com \n"+"tel:010-1993-0718";

			
			//Path객체 생성
			Path path = Paths.get("user.txt");
			
			//파일 생성 및 데이터 저장
			Files.writeString(Paths.get("user.txt"), data, Charset.forName("utf-8"));
			
			//파일 정보 얻기
			//probeContentType : 확장명에 따른 파일 유형을 return
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 :" + Files.size(path));
			
			//파일 읽기
			String content = Files.readString(path, Charset.forName("utf-8"));
			System.out.println(content);
					
		} catch (IOException e) {
 			e.printStackTrace();
		}

		
	}
}
