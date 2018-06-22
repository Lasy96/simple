package com.yhl.framwork.utils;

import com.alibaba.dubbo.rpc.exception.DubboException;
import com.yhl.model.enums.MathUtilCase;

import java.util.Random;

/**
 * @author Lasy
 * @date 2018/5/28 17:24
 */
public class MathUtil {
    /**
     * 随机生成字符串
     *
     * @param length 想要生成的长度
     * @param type   随机字符类型 0.小写 1.大写
     * @return 结果
     */
    public static String getRandomString(int length, int type) {
        if (type < 1) {
            throw new DubboException("类型传入错误");
        }
        if (type == MathUtilCase.小写.getCode()) {
            return getRandomString(length, "abcdefghijklmnopqrstuvwxyz");
        } else if (type == MathUtilCase.大写.getCode()) {
            return getRandomString(length, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        return null;
    }

    /**
     * 随机生成字符串
     *
     * @param length 想要生成的长度
     * @param base   字符集
     * @return 结果
     */
    private static String getRandomString(int length, String base) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
