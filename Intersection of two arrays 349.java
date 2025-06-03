class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set1.contains(nums1[i])) {
                set1.add(nums1[i]);
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j]) && !resultList.contains(nums2[j])) {
                resultList.add(nums2[j]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}