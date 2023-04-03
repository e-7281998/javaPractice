package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx_805 {
	public static void main(String[] args) throws Exception {
		//DataOutputStrem 생성
		FileOutputStream fos = new FileOutputStream("primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("냥길동");
		dos.writeDouble(90.5);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		//DataInputStrem 생성
		FileInputStream fis = new FileInputStream("primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//기본 타입 입력
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" + order);
		}
	}
}
