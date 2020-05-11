package com.syntax.class24;

public class FileTest2 {

	public static void main(String[] args) {
		File  javaFile=new JavaFile();
		javaFile.edit();
		javaFile.close();
		javaFile.open();
	
		File  wordFile=new WordFile();
		wordFile.edit();
		wordFile.close();
		wordFile.open();
		
		File  pdfFile=new PDFFile();
		pdfFile.edit();
		pdfFile.close();
		pdfFile.open();

	}

}
