package DSA;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String a[] = {"manish", "man1245", "makash", "masha"};

        // Sorting the array
        Arrays.sort(a);
        
        // Displaying the sorted array (optional)
        System.out.println(Arrays.toString(a));

        // Finding the longest common prefix between the first and last elements
        String x = a[0];
        String y = a[a.length - 1];
        String ans = "";
        
        for (int i = 0; i < Math.min(x.length(), y.length()); i++) {
            if (x.charAt(i) == y.charAt(i)) {
                ans = ans + x.charAt(i);
            } else {
                break;
            }
        }
        
        System.out.println("Longest common prefix: " + ans);
    }
}
