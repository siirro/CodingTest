class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int space = 0;
        
        for(int[] qu : queries) {
            space = arr[qu[0]] ;
            arr[qu[0]] = arr[qu[1]];
            arr[qu[1]] = space; 
        }
        
        return arr;
    }
}