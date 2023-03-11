package com.ip;

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {

            int gap = right - left;
            int area = gap * (height[left] < height[right] ? height[left] : height[right]);
            max = Math.max(max, area);
            int x = (height[left] < height[right]) ? left++ : right--;
        }

        return max;
    }
}
