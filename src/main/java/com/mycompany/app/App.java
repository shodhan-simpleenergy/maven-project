// package com.mycompany.app;

// /**
//  * Hello world!
//  *
//  */
// public boolean isPalindrome(String inputString) {
//     if (inputString.length() == 0) {
//         return true;
//     } else {
//         char firstChar = inputString.charAt(0);
//         char lastChar = inputString.charAt(inputString.length() - 1);
//         String mid = inputString.substring(1, inputString.length() - 1);
//         return (firstChar == lastChar) && isPalindrome(mid);
//     }
// }

package com.mycompany.app;

public class App {

    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

    // Optional: main method to test
    public static void main(String[] args) {
        App app = new App();
        String test = "racecar";
        System.out.println(test + " is palindrome? " + app.isPalindrome(test));
    }
}
