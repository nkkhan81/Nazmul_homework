package homework_string;

/**
 * Created by nkkhan on 11/20/17.
 */
public class StringDemo {
    public static void main(String[] args) {

        String space = " ";

        //checking the length of a string
        String myStatement = "I am a good Programmer";
        int stringLength = myStatement.length();
        System.out.println("The length of the string is:"+space+stringLength);
        System.out.println();

        //converting a string to lower case
        String lowerCaseString = myStatement.toLowerCase();
        System.out.println("My String in Lower case:"+space+lowerCaseString);
        System.out.println();

        //checking if a string contains another string
        boolean isContain = myStatement.contains("mohammad");
        System.out.println("String contains the word \"mohammad\" ="+space+isContain);
        System.out.println();

        //checking if the string is empty
        boolean isEmpty = myStatement.isEmpty();
        System.out.println("String empty ="+space+isEmpty);
        System.out.println();

        //Checking if a string is equals to another string
        String myMentor = "Technosoft";
        boolean comparedString = myStatement.equals(myMentor);
        System.out.println("String equality ="+space+comparedString);
        System.out.println("");

        //replacing a character in the string
        String replacedString = myStatement.replace('g','G');
        System.out.println("String after replacement of the character \'g\':"+space+replacedString);
        System.out.println();

        //Checking if a string end with a specific string
        boolean isEndWith = myStatement.toLowerCase().endsWith("programmer");
        System.out.println("Is the string end with the word \"programmer\"? ="+space+isEndWith);
        System.out.println("");

        //Checking the last position of a specific character
        int charLastPosition = myStatement.lastIndexOf('m');
        System.out.println("The last index position of the character \'m\' is:"+space+charLastPosition);
        System.out.println();
    }
}
