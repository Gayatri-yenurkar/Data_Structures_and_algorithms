class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int maxPairs = 0;
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            String reversedWord = reverse(word);
            if (uniqueWords.contains(reversedWord)) {
                maxPairs++;
                uniqueWords.remove(reversedWord); // Remove the reversed word from the set
            } else {
                uniqueWords.add(word); // Add the original word to the set
            }
        }

        return maxPairs;
    }

    private String reverse(String word) {
        // Helper function to reverse a string
        return new StringBuilder(word).reverse().toString();
    }

}