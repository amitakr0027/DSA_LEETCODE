class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Put all numbers into a list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort numbers according to frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}