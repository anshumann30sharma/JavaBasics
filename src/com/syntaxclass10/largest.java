package com.syntaxclass10;

public class largest {
public static void main(String[] args) {
	//find largest element from an array
	int[]nums= {200,30,-1,900,56,787,3000};
	nums[0]=200;
	nums[1]=30;
	
	nums[2]=-1;
	nums[3]=900;
	nums[4]=56;
	nums[5]=787;
	
	nums[6]=3000;
	int largest=nums[0];//200
	for(int i=1;i<nums.length;i++) {
		if(nums[i]>largest) {
			largest=nums[i];
		}
	}
	System.out.println("Largest num is  "+largest);
	

}
}
