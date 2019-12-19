package com.class29;

public abstract class File {
	
	abstract void open();
	
	void edit() {
		System.out.println("Edit file");
	}
	
	void close() {
		System.out.println("Close file");
	}

}

class WordFile extends File{

	@Override
	void open() {
		System.out.println("Open file with Microsoft word");
	}
	
}

class JavaFile extends File{

	@Override
	void open() {
		System.out.println("Open file with Eclipse");
		
	}
	
}

class PDFFile extends File{

	@Override
	void open() {
		System.out.println("Open file with Adobe Reader");
		
	}
	
	
}
