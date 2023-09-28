class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] charSet = new boolean[26]; 

        for (char ch : allowed.toCharArray()) {
            charSet[ch - 'a'] = true;
        }

        int consistentCount = 0;

        for (String word : words) {
            boolean isConsistent = true;
            for (char ch : word.toCharArray()) {
                if (!charSet[ch - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }
    
}