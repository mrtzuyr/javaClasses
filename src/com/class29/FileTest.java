package com.class29;

public class FileTest {
	public static void main(String[] args) {
	
		File word=new WordFile();
				word.open();
		
		File java=new JavaFile();
				java.open();
				
		File pdf=new PDFFile();
				pdf.open();
		
	}
}
