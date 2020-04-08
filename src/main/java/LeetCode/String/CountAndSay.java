package LeetCode.String;

/**
 * @Author: wujiaji
 * @Date: 2020-04-08 21:00
 * @Description: 38. 外观数列
 * @URL: //https://leetcode-cn.com/problems/count-and-say/
 **/
public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay obj = new CountAndSay();
        System.out.println(obj.countAndSay(5));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuilder s = new StringBuilder();
        int p1 = 0;
        int cur = 1;
        String str = countAndSay(n - 1);
        for (cur = 1; cur < str.length(); cur++) {
            if (str.charAt(p1) != str.charAt(cur)) {
                int count = cur - p1;
                s.append(count).append(str.charAt(p1));
                p1 = cur;
            }
        }
        if (p1 != cur) {
            int count = cur - p1;
            s.append(count).append(str.charAt(p1));
        }
        return s.toString();
    }
}
