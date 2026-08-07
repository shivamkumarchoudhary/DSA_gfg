class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int n =arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
