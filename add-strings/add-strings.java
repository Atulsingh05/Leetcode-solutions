class Solution 
{
    public String addStrings(String num1, String num2)
    {
        int l1 = num1.length();
        int l2 = num2.length();
        int i = l1-1;
        int j = l2-1;
        int carry = 0;
        int ival,jval;
        String res="";
        int sum = 0;
        while(i>=0 || j>=0 || carry!=0)
        {
            ival = i>=0 ? num1.charAt(i)-'0' : 0;//converting ascii to int
            jval = j>=0 ? num2.charAt(j)-'0' : 0;//converting ascii to int
            i--;
            j--;
            sum = ival + jval + carry;
            carry = sum/10;
            res = sum%10 + res;
        }
        return res;
    }
}