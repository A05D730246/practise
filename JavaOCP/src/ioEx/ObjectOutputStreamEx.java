package ioEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamEx {
	/*
	 * 1.Order ---->implements Serializable
	 * 2.FileOutputStream---->讀取檔案
	 * 3.ObjectOutputStrea---->串接轉換
	 */

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("c:/ABC/order.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Order("a",5,1));
		oos.writeObject(new Order("b",1,2));
		oos.writeObject(new Order("c",3,1));
		oos.writeObject(new Order("d",1,2));
		oos.writeObject(new Order("e",3,1));

	}

}
