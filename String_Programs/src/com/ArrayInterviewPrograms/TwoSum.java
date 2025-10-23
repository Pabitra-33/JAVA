package com.ArrayInterviewPrograms;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		//given array and target
		int[] arr = {5,3,8,1,4,9};
		int target = 8;
		
		int[] res = findTwoSum(arr, target);
		//System.out.println(Arrays.toString(res));
		System.out.println("Two sum index are: "+res[0]+","+res[1]);
	}
	
	//find the two sum
	public static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {};//when not two sum
	}
}