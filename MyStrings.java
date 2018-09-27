public class MyStrings
{
    public static String swapWords( String str )
    {
        return "";
    }

    public static String firstLast( String str )
    {
        return "";
    }

    public static boolean findLetter( String str, char letter )
    {
        return true;
    }

    public static boolean findString( String str, String toFind )
    {
        return true;
    }

    public static int numOfLetter( String str, char letter )
    {
        return 0;
    }

    /**
     * return how many times the string is in the string
     */
    public static int numOfString( String str, String toFind )
    {
        return 0;
    }

    public static void main( String[] args )
    {
        System.out.println( "Testing swapWords()" );
        System.out.println( "one two --> " + swapWords( "one two" ) );
        System.out.println( "Computer Science --> " + swapWords( "Computer Science" ) );
        System.out.println();
        System.out.println( "Testing firstLast()" );
        System.out.println( "word --> " + firstLast( "word" ) );
        System.out.println( "Computer Science --> " + firstLast( "Comptuer Science" ) );
        System.out.println();
        System.out.println( "Testing findLetter()" );
        System.out.println( "findLetter( \"word\", \'o\' ) --> " + findLetter( "word", 'o' ) );
        System.out.println( "findLetter( \"Computer\", \'z\' ) --> " + findLetter( "Computer", 'z' ) );
        System.out.println();
        System.out.println( "Testing findString()" );
        System.out.println( "findString( \"word\", \"rd\" ) --> " + findString( "word", "rd" ) );
        System.out.println( "findString( \"Computer\", \"Sci\" ) --> " + findString( "Computer", "Sci" ) );
        System.out.println();
        System.out.println( "Testing numOfLetter()" );
        System.out.println( "numOfLetter( \"Syssyphus\", \'s\' ) --> " + numOfLetter( "Syssyphus", 's' ) );
        System.out.println( "numOfLetter( \"Computer\", \'z\' ) --> " + numOfLetter( "Computer", 'z' ) );
        System.out.println();
        System.out.println( "Testing numOfString()" );
        System.out.println( "numOfString( \"What is this?\", \"is\" ) --> " + numOfString( "What is this?", "is" ) );
        System.out.println( "numOfString( \"This is Sparta\", \"is\" ) --> " + numOfString( "This is Sparta", "is" ) );
    }
}
