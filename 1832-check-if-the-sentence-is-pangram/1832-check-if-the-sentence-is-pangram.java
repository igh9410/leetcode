class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> scanMap = new HashMap<>();
        
        for (int i = 0; i < sentence.length(); i++) {
            scanMap.put(sentence.charAt(i), scanMap.getOrDefault(sentence.charAt(i), 0) + 1);
            if (scanMap.size() == 26) {
                return true;
            }
        }
        return (scanMap.size() == 26);
    }
}