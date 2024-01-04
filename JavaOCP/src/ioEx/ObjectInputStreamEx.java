package ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 1.FileInputStream-->讀取檔案
		 * 2.ObjectInputStream-->還原內容
		 */
		
		FileInputStream fis=new FileInputStream("c:/ABC/order.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		//System.out.println(ois.readObject());
		while(true)
		{
			try 
			{
			    ((Order)ois.readObject()).show();
			}
			catch(java.io.EOFException e)
			{
				System.out.println("end....");
				break;//<----沒有會一直卡在迴圈
			}
			
		}

	}

}
