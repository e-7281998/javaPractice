package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//FileOutputStream에 ObjectOutputStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체 생성
		Member m1 = new Member("TM", "태민");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = {1,2,3};
	
		//객체를 역직렬화해서 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close();
		fos.close();
		
		//FileInputStream에 ObjectInputStream 보조 스트림 연결
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//파일을 읽고 역직렬화해서 객체로 복원
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close();
		fis.close();
		
		//복원된 내용 확인
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}

class Product implements Serializable{
	private static final long serialVersionUID = -62181286470078544L;
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+":"+price;
	} 
}

class Member implements Serializable{
	private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	 Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id+":"+name;
	} 
}