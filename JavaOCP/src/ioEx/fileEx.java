package ioEx;

import java.io.File;
import java.io.IOException;

public class fileEx {

	public static void main(String[] args) throws IOException {
		/*File f=new File("c:/ABC/b.txt");
		f.createNewFile();-->新增檔案*/
		
		/*File f=new File("c:/DEF");
		f.mkdir();-->新增資料夾*/
		
		File f=new File("c:/DEF/a/b/c");
		f.mkdirs();//-->新增多個資料夾
		

	}

}
