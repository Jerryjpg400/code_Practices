//Given an array of ints, 
//return true if 6 appears as either the first or last element in the array.
//The array will be length 1 or mo
public boolean firstLast6(int[] nums) {
	// return true if first number in nums array is 6
	// or last number in nums array is 6;
	// otherwise, false
	return (nums[0]==6 || nums[nums.length-1]==6);
}


