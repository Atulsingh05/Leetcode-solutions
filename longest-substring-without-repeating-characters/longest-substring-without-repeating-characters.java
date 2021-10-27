class Solution
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character,Integer> mpp=new HashMap<Character,Integer>();
        int left=0,right=0;
        int n=s.length();
        int len=0;
        while(right<n)//traverse the right pointer till it doesnt cross the traversal boundary.
        {
            if(mpp.containsKey(s.charAt(right)))//does our hashmap contains the character at index right.
            {  left=Math.max(mpp.get(s.charAt(right)) +1,left);}
              //if it contain update left if its in the range (l-r)
            mpp.put(s.charAt(right),right);//put the current char in hashmap means update the last seen.
            len=Math.max(len,right-left+1);
            right++;
            
        }
        return len;
    }
}