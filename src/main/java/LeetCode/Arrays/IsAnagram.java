package LeetCode.Arrays;

import java.util.Arrays;

/**
 * @Author: wujiaji
 * @Date: 2020-04-10 19:42
 * @Description: 242. 有效的字母异位词
 * @URL: //https://leetcode-cn.com/problems/valid-anagram/
 **/
public class IsAnagram {
    public static void main(String[] args) {
        IsAnagram obj = new IsAnagram();
        System.out.print( obj.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);
    }
}
