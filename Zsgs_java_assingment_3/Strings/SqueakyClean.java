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
                    sb.append(Character.toUpperCase(ch)); 
                    toUpperCase = false;
                } else {
                    sb.append(ch);
                }
            } 
            else {
                switch (ch) {
                    case '4': sb.append('a'); break;
                    case '3': sb.append('e'); break;
                    case '0': sb.append('o'); break;
                    case '1': sb.append('l'); break;
                    case '7': sb.append('t'); break;
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
