class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = Integer.MIN_VALUE;
        int freq[] = new int[100];
        int result=0;
        for(int num : nums)
        {
            int f = ++freq[num-1];
            if(f>maxFreq)
            {
                result = f;
                maxFreq = f;
            }
            else if(f==maxFreq)
            {
                result = result+f;
            }
        }
        return result;


    }
}