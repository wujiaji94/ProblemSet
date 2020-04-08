package LeetCode.String;

/**
 * @Author: wujiaji
 * @Date: 2020-04-08 21:02
 * @Description: 58. 最后一个单词的长度
 * @URL: //https://leetcode-cn.com/problems/length-of-last-word/
 **/
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord("Hello World"));
    }

    public int lengthOfLastWord(String s) {
        String str = s.trim();
        return str.length() - 1 - str.lastIndexOf(" ");
    }
}
