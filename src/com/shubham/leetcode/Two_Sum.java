package com.shubham.leetcode;
/*
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


 */

import java.util.HashMap;

public class Two_Sum {
	
	
		  
	    public int[] twoSum(int[] nums, int target) {
	        
	        
	     HashMap<Integer,Integer> has=new  HashMap<Integer,Integer>();
	        int []out=new int[2];
	    for(int i=0;i<nums.length;i++)
	    {
	        if(!has.containsKey(nums[i]))
	        {
	            has.put(target-nums[i],i);
	        }
	        else{
	            out[0]=has.get(nums[i]);
	            out[1]=i;
	            break;
	        }
	    }
	        return out;
	    
	}

}
