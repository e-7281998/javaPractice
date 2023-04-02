package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx_801 {
	public static void main(String[] args) throws Exception {
		//입출력 스트림 생성
		//System.out.println(BufferEx_801.class);	//결과 : class ch18.BufferEx_801
		
		String originFilePath1 = BufferEx_801.class.getResource("kkoong.jpg").getPath();
		String targetFilePath1 = "kkoong2.jpg";

		FileInputStream fis = new FileInputStream(originFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//입출력 스트림 + 버퍼 스트림 생성
		String originFilepath2 = BufferEx_801.class.getResource("kkomde.jpg").getPath();
		String targetFilePath2 = "kkomde2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originFilepath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용 : " + nonBufferTime);
		
		//버퍼 사용하고 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용 : " + bufferTime);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		//시작 시간 저장
		long start = System.nanoTime();
		//1byte 읽고, 1byte 출력
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		//끝 시간 저장
		long end = System.nanoTime();
		//복사시간 리턴
		return (end-start);

	}
}