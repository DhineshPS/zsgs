class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean toUpperCase = false;

        for (char ch : identifier.toCharArray()) {
            if (ch == ' ') {
                sb.append('_'); 
                toUpperCase = false; 
            } 
            else if (ch == '-') {
                toUpperCase = true;
            } 
            else if (Character.isLetter(ch)) {
                if (toUpperCase) {
                    sb.append(ch - 32); 
                    toUpperCase = false;
                } else {
                    sb.append(ch);
                }
            } 
            else {
                switch (ch) {
                    case '4' -> sb.append('a');
                    case '3' -> sb.append('e');
                    case '0' -> sb.append('o');
                    case '1' -> sb.append('l');
                    case '7' -> sb.append('t');
                }
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] testIdentifiers = {"D-h-i-n-e-s-h", "hello world", "Hello43017"};

        for (String identifier : testIdentifiers) {
            System.out.println("Original: " + identifier + " -> Cleaned: " + clean(identifier));
        }
    }
}
