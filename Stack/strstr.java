class strstr {
    public static void main(String[] args) {
        System.out.println(checking("anurag", "anu"));
    }

    static int checking(String haystack, String needle) {
        if (needle == "" || haystack == "") {
            return 0;
        }
        boolean flag = false;
        for (int i = 0; i < haystack.length() - 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                flag = true;
                System.out.println(haystack.charAt(i) + " " + needle.charAt(0));
                int k = i + 1;
                for (int j = 1; j < needle.length();) {
                    if (haystack.charAt(k) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                    k++;
                    j++;
                }
            }
            if (flag == true)
                return i;
        }
        return -1;
    }
}