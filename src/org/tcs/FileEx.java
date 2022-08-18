package org.tcs;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\akash\\a\\k\\a\\anand.jpg");
		f.mkdir();
		f.mkdirs();
	    boolean createNewFile = f.createNewFile();
	    System.out.println(createNewFile);

	}

}
