//Given a string, find the length of the longest substring T that contains at most k distinct characters.
//
//Example 1:
//
//Input: s = "eceba", k = 2
//Output: 3
//Explanation: T is "ece" which its length is 3.
//Example 2:
//
//Input: s = "aa", k = 1
//Output: 2
//Explanation: T is "aa" which its length is 2.


import java.util.HashMap;
import java.util.Map;

//Same implementation as leetcode 904: Fruits into baskets
public class Leetcode_340 {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
           int low = 0;
           int high = 0;
           int ans = 0;

           int n = s.length();

           Map<Character, Integer> map = new HashMap<>();

           while(high<n){
               map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);

               while (map.size() > k){
                   map.put(s.charAt(low), map.get(s.charAt(low))-1);
                   int frequency = map.get(s.charAt(low));

                   if (frequency == 0){
                       map.remove(s.charAt(low));
                   }
                   low ++;
               }
               ans = Math.max(ans, high-low+1);
               high ++;
           }

           return ans;
    }
}
