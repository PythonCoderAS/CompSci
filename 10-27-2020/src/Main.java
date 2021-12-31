public class Main {

    public static void main(String[] args) {
        String str1 = "Bxscience";
        String str2 = str1;                             //Line 2
        String str3 = new String(str2);       //Line 3

        boolean b1 = (str1 == str2);            //Line 4
        boolean b2 = str1.equals(str2);     // Line 5
        boolean b3 = (str2 == str3);            // Line 6
        boolean b4 = str2.equals(str3);     //  Line 7

        System.out.println("b1: " + b1);      //Line 8
        System.out.println("b2: " + b2);      //Line 9
        System.out.println("b3: " + b3);       //Line 10
        System.out.println("b4: " + b4);      // Line 11

    }
}
