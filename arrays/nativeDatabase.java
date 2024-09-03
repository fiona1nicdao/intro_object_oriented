
class Main {

  /** Number of records to track */
  public static final int RECORDS = 5;
  /** How many fields to track for each record */
  public static final int FIELDS = 3;
  /** Field labels */
  public static final int CODE = 0;
  public static final int NAME = 1;
  public static final int STATE = 2;

  /** 2D array to track our contacts */
  static String[][] fav = new String[RECORDS][FIELDS];

  /** A bunch of 1D arrays to do the same */
  static String[] code = new String[RECORDS];
  static String[] name = new String[RECORDS];
  static String[] state = new String[RECORDS];


  /** 
   * Populate 2D array [contacts] with data. Warning: this is definitely the wrong 
   * way to add data to an array. Used here only for illustration.
   */
  public static void populate2D() {
    // Multi-statement lines are to be avoided; used here for illustration
    fav[0][CODE] = "K06C";  fav[0][NAME] = "Schaumburg";  fav[0][STATE] = "IL"; // First airport
    fav[1][CODE] = "KMDW";  fav[1][NAME] = "Midway";      fav[1][STATE] = "IL"; // Second airport
    fav[2][CODE] = "KPWK";  fav[2][NAME] = "Executive";   fav[2][STATE] = "IL"; // Third airport
    fav[3][CODE] = "K2P2";  fav[3][NAME] = "Washington";  fav[3][STATE] = "MI"; // Fourth airport
    fav[4][CODE] = "KMKE";  fav[4][NAME] = "Milwaukee";   fav[4][STATE] = "MI"; // Fifth airport
  } // method populate2D
  

  /**
   * Show the contents of the 2D "database"
   */
  public static void display2D() {
    System.out.printf("\n\nThere are %d airports in your database.", fav.length);
    System.out.printf("\nFor each airport we have %d fields of information.\n\n", fav[0].length);
    // Go over the rows of the array
    for (int row = 0; row < fav.length; row++) {
      // Go over the columns of this row
      for (int col = 0; col < fav[row].length; col++) {
        // Print the contents
        System.out.printf("%-13s", fav[row][col]);
      }
      System.out.println(); // Move to next line
    }
  } // method display2d

  

  /**
   * Populate the 1D arrays. Again, this is definitely the wrong 
   * way to add data to an array. Used here only for illustration.
   */
  public static void populate1D() {
    code[0] = "KJVL";  name[0] = "Janesville";   state[0] = "WI";
    code[1] = "KORD";  name[1] = "O'Hare";       state[1] = "IL";
    code[2] = "KUGN";  name[2] = "Waukegan";     state[2] = "WI";
    code[3] = "KHPN";  name[3] = "Westchester";  state[3] = "NY";
    code[4] = "KRPJ";  name[4] = "Rochelle";     state[4] = "IL";
  } // populate1D


  /** 
   * Show contents of the 1D database
   */
  public static void display1D() {
    System.out.printf("\n\nThere are %d airports in your database.\n", code.length);
    // Go every record
    for (int record = 0; record < code.length; record++) {
      System.out.printf("\n%-13s", code[record]);
      System.out.printf("%-13s", name[record]);
      System.out.printf("%-13s", state[record]);
    }
  }


  /** Put everything together */
  public static void main(String[] args) {
    populate2D();
    display2D();
    populate1D();
    display1D();
  }
}