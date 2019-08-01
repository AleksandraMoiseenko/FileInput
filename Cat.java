package cat_exhibition;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Cat {
	
public static String read(String filename) throws IOException {
	BufferedReader in=new BufferedReader(new FileReader(filename));
	String s;
	StringBuilder sb=new StringBuilder();
	while((s=in.readLine())!=null)
		sb.append(s+"\n");
	in.close();
	return sb.toString();
}
	

}
