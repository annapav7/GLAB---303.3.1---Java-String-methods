//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Instructor:
Assignment Name: GLAB - 303.3.1 - Java String methods
Author: Pavlenko Anna
Data: March_18_2024
 */

// importing Arrays to convert array to string
// used for printing arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Objective:
In this lab, you will explore and demonstrate the built-in methods in the String class.
These methods help you manipulate the String data type.

By the end of this lab learners will be able to:
- Describe the Strings methods.
- Use Java Strings Methods.
         */

// Instructions:
        // 1.  length() method:
        System.out.println("// 1.  length() method:");
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("The Length: " + "Java".length());  // 4
        System.out.println("The Length: " + "Java\n".length()); // 5 " " - includes as char nd count
        System.out.println("The Length: " + "Learn Java".length()); // 10

        // Examples:
        String str = "Use Java Strings Methods!";
        System.out.println(str);
        System.out.println("The Length of String Object is: " + str.length());

        System.out.println();
        // 2. IsEmpty() method:
        System.out.println("// 2. IsEmpty() method:");
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false

        // Example:
        String s3 = " "; // Space in String - count toward char - Not Empty String
        System.out.println(s3);
        System.out.println(s3.isEmpty());

        String s4 = "Hello World!";
        System.out.println(s4);
        System.out.println(s4.isEmpty());
        System.out.println();

        // 3. Trim() method:
        System.out.println("// 3. Trim() method:");
        String s11="  Hello   ";
        System.out.println(s11+"how are you?");        // without trim()
        System.out.println(s11.trim() + " " + "how are you?"); // with trim()
        System.out.println();

        // 4.  toLowerCase() method:
        System.out.println("// 4.  toLowerCase() method:");
        String s111 = "HELLO HOW Are You?";
        System.out.println(s111);
        String s1lower = s111.toLowerCase();
        System.out.println(s1lower);
        System.out.println();

        // Example:
        System.out.println("MY cat'a nAME is SUNshine".toLowerCase());

        // 5. Java String toUpper() method:
        System.out.println("// 5. Java String toUpper() method:");
        String s21="hello how are you?";
        String s21upper=s21.toUpperCase();
        System.out.println(s21upper);

        // Example:
        System.out.println("MY cat'a nAME is SUNshine".toUpperCase());
        System.out.println();

        // 6. concat() method
        System.out.println();
        //------By using concat method----
        String st1 = "Learn ";
        String st2 = "Java";
        // concatenate str1 and str2
        System.out.println(st1.concat(st2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(st2.concat(st1)); // "JavaLearn "
        //--- By using + operator---
        String s31 =  "hello";
        String s41 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s31 + s41;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        System.out.println(s);

        // String Supplement is concatenated with character B
        String s1111 = "Supplement" + 'B'; // s1 becomes SupplementB
        System.out.println(s1111);

        System.out.println();

        // 7. split() method:
        System.out.println("// 7. split() method:");
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        System.out.println();

        // 8. charAt() method: Getting Characters From a String:
        // return char by Index [i]:
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));

        System.out.println();

        // 9. compareTo() method:
        System.out.println("/ 9. compareTo() method:");

        String s311="hello";
        String s32="hello";
        String s33="hemlo";
        String s34="flag";
        System.out.println(s311.compareTo(s32)); // 0 because both are equal
        System.out.println(s311.compareTo(s33)); //-1 because "l" is only one time lower than "m"
        System.out.println(s311.compareTo(s34)); // 2 because "h" is 2 times greater than "f"

        System.out.println();

        // 10. Substrings() method:
        // stringObj.substring(int startIndex, int endIndex)
        System.out.println("// 10. Substrings() method:");
        String str14 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str14.substring(0, 4));
        System.out.println();

        // 11. indexOf() method:
        System.out.println("// 11. indexOf() method:");
        // method returns the index of the first occurrence of the specified character/substring within the string
        String str15 = "Java is fun";
        int result1;

        // getting index of  1st character 's'
        result1 = str15.indexOf('s');

        System.out.println(result1); // 6

        // getting index of character 'J'
        result1 = str15.lastIndexOf('J');
        System.out.println(result1); // 0

        // the last occurrence of 'a' is returned
        result1 = str15.lastIndexOf('a');
        System.out.println(result1); // 3

        // character not in the string
        result1 = str15.lastIndexOf('j');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str15.lastIndexOf("ava");
        System.out.println(result1); // 1

        // substring not in the string
        result1 = str15.lastIndexOf("java");
        System.out.println(result1); // -1
        System.out.println();

        // 12. contains() method:
        System.out.println("/ 12. contains() method:");
        // The contains() method checks whether the specified string (sequence of characters) is present in the string or not.
        // return true | false
        String string = "Learn Java";
        Boolean result2;

        // check if str1 contains "Java"
        result2 = string.contains("Java");
        System.out.println(result2);  // true

        // check if str1 contains "Python"
        result2 = string.contains("Python");
        System.out.println(result2);  // false

        // check if str1 contains ""
        result2 = string.contains("");

        System.out.println(result2);  // true
        System.out.println();

        // 13. replace() method:
        System.out.println("// 13. replace() method:");
        // The replace() method replaces each matching
        // occurrence of the old character/text in the string with the new character/text.
        /* The syntax of the replace() method is either:
           stringobj.replace(char oldChar, char newChar)
           or
           stringobj.replace(CharSequence oldText, CharSequence newText)
        */
        String string1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(string1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(string1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
        System.out.println();

        // 14. Java String replaceAll():
        System.out.println("// 14. Java String replaceAll():");
        /*
        The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
        The syntax of the replaceAll() method is:

        string.replaceAll(String regex, String replacement)
            - regex - a regex (can be a typical string) that is to be replaced
            - replacement - matching substrings are replaced with this string
         */
        String string2 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(string2.replaceAll(regex, " "));
        System.out.println();

        // 15. Java String compares
        System.out.println("// 15. Java String compares");
        /*
        There are three ways to compare String in Java:
            - By Using equals() Method.
            - By Using == Operator.
            - By compareTo() Method.
         */

        // 15.1 By Using equals() Method:
        System.out.println("// 15.1 By Using equals() Method:");
        // return true | false
        String s15="PerScholas";
        String s25="PerScholas";
        String s35=new String("PerScholas");
        String s45="Teksystem";
        System.out.println(s15.equals(s25));//true
        System.out.println(s15.equals(s35));//true
        System.out.println(s15.equals(s45));//false

        // 15.2 By Using == operator:
        System.out.println("// 15.2 By Using == operator:");
        // The == operator compares references, not values.
        // return true | false
        String s16="Perscholas";
        String s26="Perscholas";
        String s36=new String("Perscholas");
        System.out.println(s16==s26);//true (because both refer to same instance)
        System.out.println(s16==s36);//false(because s3 refers to instance created in nonpool)

        // 15.3 By Using compareTo() method:
        System.out.println("// 15.3 By Using compareTo() method:");
        // return 0 if this string is the same as another;
        // <0 (1) if lexicographically less than another; or >0 (-1)
        String s17="Perscholas";
        String s27="Perscholas";
        String s37="Perschola";
        String s47="PerscholasX";
        System.out.println(s17.compareTo(s27)); //0
        System.out.println(s17.compareTo(s37)); // 1(because s1>s3)
        System.out.println(s17.compareTo(s47)); // -1(because s1<s4 )



    }
}