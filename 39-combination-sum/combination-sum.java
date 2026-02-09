class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remain, int start, 
                           List<Integer> combo, List<List<Integer>> result) {

        if (remain == 0) {
            result.add(new ArrayList<>(combo)); 
            return;
        }

        if (remain < 0) return; 

        for (int i = start; i < candidates.length; i++) {
            combo.add(candidates[i]);              
            backtrack(candidates, remain - candidates[i], i, combo, result);
            combo.remove(combo.size() - 1);         
        }
    }
}
