package testPackage;

public class MinimumWindowSubstring {
    static String findSubString(String[] strArr) {
        int len1 = strArr[0].length();
        int len2 = strArr[1].length();

        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];

        for (int i = 0; i < len2; i++)
            hash_pat[strArr[1].charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        int count = 0;
        for (int j = 0; j < len1 ; j++) {
            hash_str[strArr[0].charAt(j)]++;

            if (hash_pat[strArr[0].charAt(j)] != 0
                    && hash_str[strArr[0].charAt(j)] <= hash_pat[strArr[0].charAt(j)] )
                count++;

            if (count == len2) {
                while ( hash_str[strArr[0].charAt(start)] > hash_pat[strArr[0].charAt(start)]
                        || hash_pat[strArr[0].charAt(start)] == 0) {
                    if (hash_str[strArr[0].charAt(start)] > hash_pat[strArr[0].charAt(start)])
                        hash_str[strArr[0].charAt(start)]--;
                    start++;
                }

                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        return strArr[0].substring(start_index, start_index + min_len);
    }

    // Driver Method
    public static void main(String[] args)
    {
        String[] strings = new String[]{"ADOBECODEBANC","ABC"};
        System.out.print("Smallest window is :\n " + findSubString(strings));
    }
}
