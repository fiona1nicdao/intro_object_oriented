package indexOf;
/**
 * A class with five different ways to implement our own version of the
 * String indexOf() method, showing how easy it is to introduce logic bugs
 * and inefficient code in our programming.
*/

 class IndexOf {

    /**
     * Returns the position of the first occurrence of a character in a string. 
     * If the character is not present, the method returns -1
     *
     * Version 1: this version works correctly but it has multiple returns that 
     * can and should be avoided. Nevertheless, this is how the actual indexOf
     * method is implemented in the String class in Java. :-(
     */
    public static int indexOf_v1(char letter, String string) {
      for (int i = 0; i < string.length(); i++) { // Loop to parse string
        if (letter == string.charAt(i)) { // If letter found
          return i; // Stop the method and return the position
        }
      }
      return -1; // Letter not found (we get here because if never executed above)
    } // method indexOf_v1
  
  
    /**
     * Returns the position of the first occurrence of a character in a string. 
     * If the character is not present, the method returns -1
     *
     * Version 2: this version has only one return statement but does not always
     * work correctly. If a letter appears multiple times, the method returns the
     * position of the last occurrence, for example:
     *   indexOf_v2('p', "apple") returns 2 but it should return 1
     */
    public static int indexOf_v2(char letter, String string) {
      int position = -1; // Assume letter will not be found
      for (int i = 0; i < string.length(); i++) { // Loop to parse string
        if (letter == string.charAt(i)) { // If letter found
          position = i; // Update the return variable with the position of the letter
        }
      }
      return position; // If letter not present, position will be -1, otherwise > -1.
    } // method indexOf_v2
  
    
    /**
     * Returns the position of the first occurrence of a character in a string. 
     * If the character is not present, the method returns -1
     *
     * Version 3: this version has only one return statement and works properly 
     * but it is a bit too complex.
     */
    public static int indexOf_v3(char letter, String string) {
      int position = -1; // Assume letter will not be found
      boolean found = false; // Indicates if letter was found; assume not
      for (int i = 0; i < string.length(); i++) { // Loop to parse string
        if (!found && letter == string.charAt(i)) { // Test == only if letter not yet found
          position = i; // Update the return variable with the position of the letter
          found = true; // Indicate that letter was found
        }
      }
      return position; // If letter not present, position will be -1, otherwise > -1.
    } // method indexOf_v3
  
    
     /**
     * Returns the position of the first occurrence of a character in a string. 
     * If the character is not present, the method returns -1
     *
     * Version 4: Perfection, in the eyes of Leo.
     */
    public static int indexOf_v4(char letter, String string) {
      int position = -1; // Assume letter not found
      boolean found = false; // Boolean version of assumption above
      int i = 0; // Parsing index for string
      while (!found && i < string.length()) {
        if (string.charAt(i) == letter) {
          position = i;
          found = true; // letter has been found
        }
        i = i+1; // same as i++
      }
      return position;
    } // method indexOf_v4
  
    
     /**
     * Returns the position of the first occurrence of a character in a string. 
     * If the character is not present, the method returns -1
     *
     * Version 4: Perfection, in the eyes of Leo.
     */
    public static int indexOf_v5(char letter, String string) {
      int position = -1; // Assume letter not found
      int i = 0; // Parsing index for string
      while ((position == -1) && i < string.length()) {  
        if (string.charAt(i) == letter) {
          position = i;
        }
        i = i+1; // same as i++
      }
      return position;
    } // method indexOf_v5
  
    
  
    public static void main(String[] args) {
      
      char letter = 'r';
      String string = "airport";
      // Test version 1 
      System.out.printf("\n\nindexOf_v1('%s', \"%s\") = %d\n", 
                        letter, string, indexOf_v1(letter,string));
      // Test version 2
      System.out.printf("\nindexOf_v2('%s', \"%s\") = %d\n", 
                        letter, string, indexOf_v2(letter,string));
      // Test version 3
      System.out.printf("\nindexOf_v3('%s', \"%s\") = %d\n", 
                        letter, string, indexOf_v3(letter,string));
      // Test version 4
      System.out.printf("\nindexOf_v4('%s', \"%s\") = %d\n", 
                        letter, string, indexOf_v4(letter,string));
      // Test version 5
      System.out.printf("\nindexOf_v5('%s', \"%s\") = %d\n", 
                        letter, string, indexOf_v5(letter,string));
      System.out.println();
    }
}