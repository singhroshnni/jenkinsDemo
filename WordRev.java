public class WordRev {
    public static void main(String[] args) {
        String input = "Hello World Java Program";


        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Reverse the order of the words
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
            
        }
        System.out.println("Orginal string: "+input);
        String rev=reversedString.toString();
        System.out.println("String after reversal: "+rev);

    }


}
