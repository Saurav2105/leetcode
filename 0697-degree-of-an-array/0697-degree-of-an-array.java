class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int degree = 0;
        for (int i : map.values()) {
       degree = Math.max(degree, i);
        }
        int ans = nums.length;
        for (int i : map.keySet()) {
            if (map.get(i) == degree) {
            int first = -1;
            int last = -1;
            for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) {
            if (first == -1)
            first = j;
            last = j;
       }
     }
    ans= Math.min(ans, last - first + 1);
     }
  }
    return ans;
       }
}