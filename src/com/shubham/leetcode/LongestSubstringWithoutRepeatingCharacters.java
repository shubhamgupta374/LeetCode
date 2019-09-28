package com.shubham.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	 public int lengthOfLongestSubstring(String s) {
	        
	        int max=0;
	        int temp=0;
	        if(s.length()==0||s.length()==1)
	        {
	            return s.length();
	        }
	        Set<Character> st=new HashSet<>();
	        int i=0;
	        int prev=0;
	        
	        
	       
	        while(i<s.length())
	        {
	           
	            if(st.contains(s.charAt(i)))
	            {
	                
	                
	                
	               
	                   
	                 
	                 
	                  while(s.charAt(prev)!=s.charAt(i))
	                  {
	                      st.remove(s.charAt(prev));
	                      prev++;
	                     
	                  }
	              st.remove(s.charAt(prev++));
	                
	            }
	            //prev=i;
	                st.add(s.charAt(i));
	            if(max<st.size())
	                    max=st.size();
	               
	            
	            
	            i++;
	           
	                
	            }
	            
	            
	        
	        return max;}

}
