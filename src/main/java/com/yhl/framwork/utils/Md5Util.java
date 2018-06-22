package com.yhl.framwork.utils;

import java.security.MessageDigest;

/**
 * @author Lasy
 * @date 2018/5/28 16:56
 */
public class Md5Util {
    /**
     * 获得MD5加密密码的方法
     */
    public static String getMD5ofStr(String origString) {
        String origMD5;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] result = md5.digest(origString.getBytes());
            origMD5 = byteArray2HexStr(result);
            return origMD5.toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 处理字节数组得到MD5密码的方法
     */
    private static String byteArray2HexStr(byte[] bs) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bs) {
            sb.append(byte2HexStr(b));
        }
        return sb.toString();
    }

    /**
     * 字节标准移位转十六进制方法
     */
    private static String byte2HexStr(byte b) {
        String hexStr;
        int n = b;
        if (n < 0) {
            // 若需要自定义加密,请修改这个移位算法即可
            n = b & 0x7F + 128;
        }
        hexStr = Integer.toHexString(n / 16) + Integer.toHexString(n % 16);
        return hexStr.toUpperCase();
    }

    /**
     * 提供一个MD5多次加密方法
     */
    public static String getMD5ofStr(String origString, int times) {
        String md5 = getMD5ofStr(origString);
        for (int i = 0; i < times - 1; i++) {
            md5 = getMD5ofStr(md5);
        }
        return md5;
    }

    /**
     * 密码验证方法
     */
    public static boolean verifyPassword(String inputStr, String md5Code) {
        return getMD5ofStr(inputStr).equals(md5Code);
    }

    /**
     * 重载一个多次加密时的密码验证方法
     */
    public static boolean verifyPassword(String inputStr, String md5Code, int times) {
        return getMD5ofStr(inputStr, times).equals(md5Code);
    }
}
