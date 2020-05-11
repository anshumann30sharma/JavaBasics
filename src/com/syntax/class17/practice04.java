package com.syntax.class17;

public class practice04 {
	public static void main(String[] args) {
	int[] arr = {5,12,-3,7,3,22};
	System.out.println(maxValue(arr));
	}
public static int maxValue(int[]arr) {
	int temp=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(temp<arr[i])
			temp=arr[i];
				}
			return temp;
		}
		}

	