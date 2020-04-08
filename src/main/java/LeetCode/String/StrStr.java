package LeetCode.String;

/**
 * @Author: wujiaji
 * @Date: 2020-04-08 20:55
 * @Description: 28. 实现 strStr()
 * @URL: //https://leetcode-cn.com/problems/implement-strstr/
 **/
public class StrStr {
    public static void main(String[] args) {
        StrStr obj = new StrStr();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int L = needle.length();
        if (L == 0) {
            return 0;
        }
        if (L > haystack.length()) {
            return -1;
        }
        for (int start = 0; start < haystack.length(); start++) {
            if (start + L <= haystack.length() && haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
