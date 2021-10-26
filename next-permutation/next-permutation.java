  //eg: 1 3 5 4 2 --> 1 4 2 3 5
        //Algorithm such that-//traversal from backward
        //1)a[i]<a[i+1]//index1=1
        //2)a[ind2]>a[ind1] // ind2=3
        //3)swap(a[ind1],a[ind2])//1 4 5 3 2
        // reverse(ind1+1-->last)// 1 4 2 3 5
        
       class Solution {
    public void nextPermutation(int[] nums) {
        if(nums== null || nums.length <= 1) return;
        int i = nums.length - 2;//iterate from second last index to know the break points
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
        //if there is break point then simply swap .  
        if(i >= 0) 
        {                          
            int j = nums.length - 1;              
            while(nums[j] <= nums[i]) j--;      
            swap(nums, i, j);                     
        }
        //if there is no break points then simply reverse .
        reverse(nums, i + 1, nums.length - 1);      
}

public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}

public void reverse(int[] nums, int i, int j) {
    while(i < j) swap(nums, i++, j--);
}
} 