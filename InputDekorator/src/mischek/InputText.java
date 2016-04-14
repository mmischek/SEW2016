package mischek;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputText {
	
	public static void main(String[] args) throws IOException {
		int c;
		try{
			InputStream in =
					new UppserCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("test.txt")));
			
			while ((c= in.read()) >=0){
				System.out.println((char)c);
			}
			in.close();		
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
