public class math {
    public static void main(String[] args) {
        Object var1 = 2 + 2 + 3 + 4;
        System.out.println("Type: " + var1.getClass().getName() + "; Value: " + var1);
        Object var2 = "2 + 2 " + 3 + 4;
        System.out.println("Type: " + var2.getClass().getName() + "; Value: " + var2);
        Object var3 = 2 + " 2 + 3 " + 4;
        System.out.println("Type: " + var3.getClass().getName() + "; Value: " + var3);
        Object var4 = 3 + 4 + " 2 + 2";
        System.out.println("Type: " + var4.getClass().getName() + "; Value: " + var4);
        Object var5 = "2 + 2 " + (3 + 4);
        System.out.println("Type: " + var5.getClass().getName() + "; Value: " + var5);
        Object var6 = "(2 + 2) " + (3 + 4);
        System.out.println("Type: " + var6.getClass().getName() + "; Value: " + var6);
        Object var7 = "hello 34 " + 2 * 4;
        System.out.println("Type: " + var7.getClass().getName() + "; Value: " + var7);
        Object var8 = 2 + "(int) 2.0" + 2 * 2 + 2;
        System.out.println("Type: " + var8.getClass().getName() + "; Value: " + var8);
        Object var9 = 4 + 1 + 9 + "." + (-3 + 10) + 11 / 3;
        System.out.println("Type: " + var9.getClass().getName() + "; Value: " + var9);
        Object var10 = 8 + 6 * -2 + 4 + "0" + (2 + 5);
        System.out.println("Type: " + var10.getClass().getName() + "; Value: " + var10);
        Object var11 = 1 + 1 + "8 - 2" + (8 - 2) + 1 + 1;
        System.out.println("Type: " + var11.getClass().getName() + "; Value: " + var11);
        Object var12 = 5 + 2 + "(1 + 1)" + 4 + 2 * 3;
        System.out.println("Type: " + var12.getClass().getName() + "; Value: " + var12);
        Object var13 = "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9);
        System.out.println("Type: " + var13.getClass().getName() + "; Value: " + var13);


    }
}
