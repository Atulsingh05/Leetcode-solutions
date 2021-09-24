class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))//travrse the array if elemnt is in the hash table then return the num else add the to hash table.
                return num;
            seen.add(num);
        }
        return -1;
    }
}