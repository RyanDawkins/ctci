
public class UniqueStrings {

    public static void main(String[] args) {

        String case1 = "world";
        String case2 = "Lately";
        String case3 = "look";
        String case4 = "abc def ghi";

        if(!hasUniqueChar(case1)) {
            System.out.println("Case1 failed.");
        } else {
            System.out.println("Case1 passed.");
        }
        if(!hasUniqueChar(case2)) {
            System.out.println("Case2 failed.");
        } else {
            System.out.println("Case2 passed.");
        }
        if(hasUniqueChar(case3)) {
            System.out.println("Case3 failed.");
        } else {
            System.out.println("Case3 passed.");
        }
        if(hasUniqueChar(case4)) {
            System.out.println("Case4 failed.");
        } else {
            System.out.println("Case4 passed.");
        }
    }

    public static boolean hasUniqueChar(String str) {
        boolean[] chars = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            if(chars[ascii]) {
                return false;
            }
            chars[ascii] = true;
        }
        return true;
    }

}