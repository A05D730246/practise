package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class cal {
	public static ObjectOutputStream addFile(String a) 
	{
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(a);
			oos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return oos;
	} 
	
	public static ObjectInputStream read(String a) 
	{
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(a);
			ois = new ObjectInputStream(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ois;
		
		
		
	}
	

}
