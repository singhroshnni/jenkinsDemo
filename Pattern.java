
public class Pattern {
    public static void main(String[] args) {
        
        int numRows = 5;

        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            
            // Print the stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
