class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> path = new ArrayList<>();

       solve(1,ans,path,n,k);
        return ans;
       }
    static void solve(int start, List<List<Integer>> ans, List<Integer> path, int n, int k){

        if(path.size() == k && n==0){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i<=9;i++){
            path.add(i);
        

        solve(i+1,ans,path,n-i,k);
        path.remove(path.size()-1);
        }
    }
}