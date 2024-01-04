package ioEx;

import java.io.FileReader;
import java.io.IOException;

public class fileReadEx {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("c:/ABC/ex1.txt");
		//System.out.println((char)fr.read());<--一次只會顯示一個字,char-->轉碼
		
				int i=0;
				
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}

	}

}
