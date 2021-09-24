class Solution {
    public int findDuplicate(int[] nums) {
        
        // Find the intersection point of the two runners.
        int slow = nums[0];//sow nd fast pointer initialised at first number.
        int fast = nums[0];
        
        do {
            slow = nums[slow];//move the slow pointer by 1
            fast = nums[nums[fast]];//move the fast poiinter by 2.
        } while (slow != fast);//unless they meet a given point.

        // Find the "entrance" to the cycle.
        fast = nums[0];//after they meet we keep the slow pointer where it was and move the pointer at 1 position.
        
        while (slow != fast) {//and then we start moving sow and fast pointer by 1 untill they meet.
            slow = nums[slow];
            fast= nums[fast];
        }

        return slow;//when they meet either slow or fast pointer is my answer so return it.
    }
}
