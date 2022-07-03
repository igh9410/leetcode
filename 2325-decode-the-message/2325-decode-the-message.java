
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap <Character, Character> decodeTable = new HashMap<>();
        char c = 'a';
        key = key.replaceAll(" ", "");        
        for (int i = 0; i < key.length(); i++) {      
            if (!decodeTable.containsKey(key.charAt(i))) {
                decodeTable.put(key.charAt(i), c);
                c++;                
            }
            if (c > 'z') {
                break;
            } 
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            if (decodeTable.containsKey(message.charAt(i))) {
                sb.append(decodeTable.get(message.charAt(i)));
            }
            else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
        
    }
}