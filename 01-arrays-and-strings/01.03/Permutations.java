public class Permutations {
    public static void main(String[] args) {

        String case1s1 = "bob";
        String case1s2 = "bbo";
        if(permutation(case1s1, case1s2)) {
            System.out.println("Case 1 passed");
        } else {
            System.out.println("Case 1 failed.");
        }

        String case2s1 = "racecar";
        String case2s2 = "acecarr";
        if(permutation(case2s1, case2s2)) {
            System.out.println("Case 2 passed");
        } else {
            System.out.println("Case 2 failed.");
        }

        String case3s1 = "helloworld";
        String case3s2 = "worldhello";
        if(permutation(case3s1, case3s2)) {
            System.out.println("Case 3 passed");
        } else {
            System.out.println("Case 3 failed.");
        }

        String case4s1 = "johnsnow";
        String case4s2 = "meryntrent";
        if(!permutation(case4s1, case4s2)) {
            System.out.println("Case 4 passed");
        } else {
            System.out.println("Case 4 failed.");
        }

        String case5s1 = "hello!";
        String case5s2 = "!olleh";
        if(permutation(case5s1, case5s2)) {
            System.out.println("Case 5 passed");
        } else {
            System.out.println("Case 4 failed.");
        }
    }

    public static boolean permutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int[] chars = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            int ascii = (int)s1.charAt(i);
            chars[ascii]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            int ascii = (int)s2.charAt(i);
            chars[ascii]--;

            if(chars[ascii] < 0) {
                return false;
            }
        }
        return true;
    }
}