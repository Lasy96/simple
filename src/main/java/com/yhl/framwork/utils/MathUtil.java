package com.yhl.framwork.utils;

import java.util.Random;

/**
 * @author Lasy
 * @date 2018/5/28 17:24
 */
public class MathUtil {
    /**
     * 随机生成字符串
     *
     * @param length
     *            想要生成的长度
     * @return
     */
    public static String getRandomString(int length) {
        return getRandomString(length, "abcdefghijklmnopqrstuvwxyz");
    }

    /**
     * 随机生成字符串
     *
     * @param length
     *            想要生成的长度
     * @param base
     *            字符集
     * @return
     */
    public static String getRandomString(int length, String base) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
