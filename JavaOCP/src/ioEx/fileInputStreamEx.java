package ioEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileInputStreamEx {

	public static void main(String[] args) throws IOException {
		File f=new File("c:/ABC/ex2.txt");
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		
		int i=0;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}

	}

}
