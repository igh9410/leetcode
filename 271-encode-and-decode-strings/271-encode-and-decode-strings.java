public class Codec {
    
    char delimiter = (char) 258;
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i));
            sb.append(Character.toString(delimiter));
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == delimiter) {
                result.add(currentWord.toString());
                currentWord.setLength(0);
            } else {
                currentWord.append(s.charAt(i));
            }
            i++;
        }
        
        return result;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));