import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddArray {

	public static void main(String[] args) {
		int[] arr = {3,3};
		int num = 9;
		Solution sol = new Solution();
		int[] add = sol.twoSum(arr, num);
		System.out.println(Arrays.toString(add));
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> complement = new HashMap<>(); //create a hashMap
        for(int i = 0; i < nums.length; i++){
        	Integer complementIndex = complement.get(nums[i]); //assign the key value
        	if(complementIndex != null) { 
        		return new int[] {i, complementIndex};
        	}
            complement.put(target - nums[i], i); //add the diff(target - array value) to the hashMap
        }   
        return nums;   
    }
}