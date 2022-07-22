package LeetCode.Plan.Level1;

import java.util.HashMap;

/**
 * 205. 同构字符串
 *
 * @Author: wujiaji
 * @Date: 2022-07-22
 **/
public class LeetCode205 {
    // 输入：s = "egg", t = "add"
    // 输出：true
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (map.containsKey(cs[i])) {
                if (map.get(cs[i]) == ct[i]) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (map.containsValue(ct[i])) {
                    return false;
                }
                map.put(cs[i], ct[i]);
            }
        }
        return true;
    }
}

