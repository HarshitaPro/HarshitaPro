package practice;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	
	 public ArrayList<Integer> threeSum(int[] nums) {
		 ArrayList <Integer> array = new ArrayList<Integer>();
		
		 int size = nums.length;
		 
		 for(int i=0;i<size;i++) {
			 for(int j=i+1;j<size;j++) {
				 for(int k=size-1;k>j&&k!=i;k--) {
					 if(nums[i]+nums[j]+nums[k]==0) {
					 array.add(nums[i]);
					 array.add(nums[j]);
					 array.add(nums[k]);
					
					 }
				 }
			 }
			 
		 }
		 return array;
		
	}
	 public static void main(String[] args) {
		ThreeSum s = new ThreeSum();
		int[] arr = {1,0,-1,2,-1,-2};
		System.out.println(s.threeSum(arr));

}
}