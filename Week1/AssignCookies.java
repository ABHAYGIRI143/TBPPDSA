import java.util.*;
class Solution {
    static{
        for(int i=0;i<500;i++){
            findContentChildren(new int[]{}, new int[]{});
        }
    }
    public static int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(g[i] <= s[j]){
                count++;
                j--;
            }
            i--;
        }
        return count;
    }
}