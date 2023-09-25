class Solution {
    public char findTheDifference(String s, String t) {
        int diff=0;
        for( char c : t.toCharArray()){
            diff +=c;
        }
        for( char c : s.toCharArray()){
            diff -= c;
        }
        return (char) diff;
    }
}