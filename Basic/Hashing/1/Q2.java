// Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.

import java.util.*;


class Q2{
    
    public static int mostFrequentElement(int[] nums) {
        
        //Creating new map for storing frequency
        Map<Integer, Integer> mpp = new HashMap<>();

        //Iterating over given array to store frequency
        for(int x: nums){
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        }

        //Variables for storing result
        int max_frequency = 0;
        int ans = Integer.MAX_VALUE;

        //Comapring frequencies and returning them
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > max_frequency || (freq == max_frequency && num < ans)){
                max_frequency = freq;
                ans = num;
            }
        }
        System.out.println(ans);
        return ans;    
    }
    
    
    public static void main(String[] args) {

        int nums[] = {4, 4, 5, 5, 6};
        mostFrequentElement(nums);

    }
}