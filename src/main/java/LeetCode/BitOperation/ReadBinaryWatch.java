package LeetCode.BitOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wujiaji
 * @Date: 2020-04-08 21:07
 * @Description: 401. 二进制手表
 * @URL: //https://leetcode-cn.com/problems/binary-watch/
 **/
public class ReadBinaryWatch {
    public static void main(String[] args) {
        ReadBinaryWatch obj = new ReadBinaryWatch();
        System.out.println(obj.readBinaryWatch(1));
    }

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if(Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }
}
