package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task {


		public static List<Exception>exception(){
			List<Exception>list=new ArrayList<>();
			String str="Hello";
			try {
				char character=str.charAt(10);
				System.out.println(character);
		
			}catch(StringIndexOutOfBoundsException se) {
				list.add(se);
				System.out.println(se);
				System.out.println(se.getMessage());
			}
			int a=10;
			int b=0;
			try {
				System.out.println(a/b);
				
			}catch(ArithmeticException ae) {
				list.add(ae);
				System.out.println(ae);
				System.out.println(ae.getMessage());
			}
			int[] nums= {1,3,4,5};
			try {
				System.out.println(nums[10]);
			}catch(Exception ou) {
				list.add(ou);
				System.out.println(ou);
				System.out.println(ou.getMessage());
				
			}
			String fpath="";
			try {
				FileInputStream fis=new FileInputStream(fpath);
				
			}catch(FileNotFoundException fne) {
			System.out.println(fne);
		}
		return list;
		}	// TODO Auto-generated method stub
				public static void main(String[] args) {
			exception();
			
	}

}
