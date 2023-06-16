class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int sol[] = new int[n+1];
        sol[0] = first;
        for (int i=1; i<=n; i++) {
            sol[i] = encoded[i-1] ^ sol[i-1];
        }
        return sol;
    }
}