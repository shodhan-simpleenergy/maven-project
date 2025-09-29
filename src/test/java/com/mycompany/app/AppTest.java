// package com.mycompany.app;

// import static org.junit.Assert.assertTrue;

// import org.junit.Test;

// /**
//  * Unit test for simple App.
//  */
//  @Test
// public void whenPalindrom_thenAccept() {
//     Palindrome palindromeTester = new Palindrome();
//     assertTrue(palindromeTester.isPalindrome("noon"));
// }
    
// @Test
// public void whenNearPalindrom_thenReject(){
//     Palindrome palindromeTester = new Palindrome();
//     assertFalse(palindromeTester.isPalindrome("neon"));
// }

package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest {

    @Test
    public void whenPalindrome_thenAccept() {
        App palindromeTester = new App();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
    
    @Test
    public void whenNearPalindrome_thenReject() {
        App palindromeTester = new App();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }
}
