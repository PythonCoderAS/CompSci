public class withoutStringTest {
    public static void main(String[] args) {
        "1".substring(0, 1);
        System.out.println(withoutString("This is a FISH", "IS"));
    }

    public static String withoutString(String base, String remove) {
        String finalString = "";
        String substring;
        int skipBy = 1;
        for (int i=0; i < base.length(); i+=skipBy){
            if (i >= (base.length() - remove.length())){
                substring = base.substring(i);
            } else {
                substring = base.substring(i, i + remove.length());
            }
            System.out.println(substring);
            System.out.println(substring.equalsIgnoreCase(remove));
            if (!(substring.equalsIgnoreCase(remove))){
                if (substring.length() == 1){
                    finalString += substring;
                } else {
                    finalString += substring.substring(0, 1);
                }
                skipBy = 1;
            } else {
                skipBy=remove.length();
            }
        }
        return finalString;
    }
}
