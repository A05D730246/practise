package ioEx;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class fileOutputStream {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream fos=new FileOutputStream("c:/ABC/ex2.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);//<--串接
        BufferedWriter bw=new BufferedWriter(osw);//<--再串接*/
		//↓簡化
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("c:/ABC/ex2.txt")));
		
		bw.write("巨匠 123456aaa");
		bw.close();
		//osw.write(65);
		//osw.close();

	}

}
