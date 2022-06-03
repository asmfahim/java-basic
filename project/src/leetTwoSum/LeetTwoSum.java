package leetTwoSum;
import java.util.*;
class Solution {
    /*
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
    public void twoSum(int nums[], int target) {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++){

                if( nums[j] == target- nums[i]){
                    System.out.println(i+","+j);
                }
            }

        }

    }
}

public class LeetTwoSum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] n = {2, 7, 11, 15};
        try {
            obj.twoSum(n, 9);
        }catch (Exception IllegalArgumentException){
            System.out.println("no match found");
        }

    }
}
