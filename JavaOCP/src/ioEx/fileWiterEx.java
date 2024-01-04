package ioEx;

import java.io.FileWriter;
import java.io.IOException;

public class fileWiterEx {

	public static void main(String[] args)  {
          try(FileWriter fw = new FileWriter("c:/ABC/ex1.txt"))//<--結束都需要close可用
          {
			fw.write("巨匠電腦abcdefg");
			//fw.close();<--已自動close
		  } 
          catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
