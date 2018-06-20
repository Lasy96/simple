package com.yhl.utilConstant;

import com.yhl.framwork.utils.MathUtil;
import com.yhl.service.impl.UserService;

/**
 * @author Lasy
 * @date 2018/6/1 18:00
 */
public class MailConstant {
    public static String code = MathUtil.getRandomString(6, 2);
    public final static String USER = "lasyer@foxmail.com";
    public final static String PASSWORD = "usbqyoxwrbsvbdca";
    public final static String HOST = "smtp.qq.com";
    public final static String PORT = "587";


    public final static String CONTENT =
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n" +
                    "<html>\n" +
                    "\t<head>\n" +
                    "\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                    "\t<html>\n" +
                    "\t<head>\n" +
                    "\t\t<meta content=\"text/html;charset=UTF-8\" http-equiv=\"Content-Type\">\n" +
                    "\t\t<style media=\"all\" type=\"text/css\">\n" +
                    "\t\ttd, p, h1, h3, a {font-family: Helvetica, Arial, sans-serif;}\n" +
                    "\t\t</style>\n" +
                    "\t</head>\n" +
                    "\t\n" +
                    "<body LINK=\"#c6d4df\" ALINK=\"#c6d4df\" VLINK=\"#c6d4df\" TEXT=\"#c6d4df\" style=\"font-family: Helvetica, Arial, sans-serif; font-size: 14px; color: #c6d4df;\" >\n" +
                    "<table style=\"width: 538px; background-color: #393836;\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                    "<table style=\"width: 538px; background-color: #393836;\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                    "\t<tr>\n" +
                    "\t\t<td style=\" height: 65px; background-color: #000000; border-bottom: 1px solid #4d4b48;\">\n" +
                    "              <img src=\"https://imgsa.baidu.com/forum/w%3D580/sign=bbb6708800d79123e0e0947c9d355917/0f7116ce36d3d539c7362f433687e950342ab046.jpg\" width=\"538\" height=\"65\" alt=\"Steam\">\n" +
                    "        </td>\n" +
                    "\t</tr>\n" +
                    "\t<tr>\n" +
                    "\t\t<td bgcolor=\"#17212e\">\n" +
                    "\t\t\t<table width=\"470\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding-left: 5px; padding-right: 5px; padding-bottom: 10px;\">\n" +
                    "\n" +
                    "\t\t\t\t<tr bgcolor=\"#17212e\">\n" +
                    "\t\t\t\t\t<td style=\"padding-top: 32px;\">\n" +
                    "\t\t\t\t\t<span style=\"padding-top: 16px; padding-bottom: 16px; font-size: 24px; color: #66c0f4; font-family: Arial, Helvetica, sans-serif; font-weight: bold;\">\n" +
                    "\t\t\t\t\t\tDear " + UserService.userName + ",\n" +
                    "\t\t\t\t\t</span><br>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\t\t\t\t</tr>\n" +
                    "\t\t\t\t\n" +
                    "\t\t\t\t<tr>\n" +
                    "\t\t\t\t\t<td style=\"padding-top: 12px;\">\n" +
                    "\t\t\t\t\t<span style=\"font-size: 17px; color: #c6d4df; font-family: Arial, Helvetica, sans-serif; font-weight: bold;\">\n" +
                    "\t\t\t\t\t\t<p>Here is the lzxy team Guard code you need to login to account " + UserService.userName + "</p>\n" +
                    "\t\t\t\t\t</span>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\t\t\t\t</tr>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t<tr>\n" +
                    "\t\t\t\t\t<td>\n" +
                    "\t\t\t\t\t\t<div>\n" +
                    "\t\t\t\t\t\t\t<span style=\"font-size: 24px; color: #66c0f4; font-family: Arial, Helvetica, sans-serif; font-weight: bold;\">" + code + "</span>\n" +
                    "\t\t\t\t\t\t</div>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\t\t\t\t</tr>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t<tr bgcolor=\"#121a25\">\n" +
                    "\t\t\t\t\t<td style=\"padding: 20px; font-size: 12px; line-height: 17px; color: #c6d4df; font-family: Arial, Helvetica, sans-serif;\">\n" +
                    "\t\t\t\t\t\t\t<p style=\"padding-bottom: 10px; color: #c6d4df;\">This email was generated because of a login attempt from a web or mobile device <a style=\"color: #c6d4df;\" href=\"#\">located at 127.0.0.1</a>  The login attempt included your correct account name and password.</p>\n" +
                    "\t\t\t\t\t\t\t<p style=\"padding-bottom: 10px; color: #c6d4df;\">The lzxy team Guard code is required to complete the login.  <span style=\"color: #ffffff; font-weight: bold;\">No one can access your account without also accessing this email.</span></p>\n" +
                    "\t\t\t\t\t\t\t<p style=\"padding-bottom: 10px; color: #c6d4df;\"><span style=\"color: #ffffff; font-weight: bold;\">If you are not attempting to login</span> then please change your lzxy team password, and consider changing your email password as well to ensure your account security.</p>\n" +
                    "\t\t\t\t\t\t\t<p style=\"padding-top: 10px; color: #61696d;\">If you are unable to access your account then use this account specific recovery link</a> for assistance recovering or self-locking your account.</p>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\n" +
                    "\t\t\t\t</tr>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t<tr>\n" +
                    "\t\t\t\t\t<td style=\"font-size: 12px; color: #6d7880; padding-top: 16px; padding-bottom: 60px;\">\n" +
                    "                    \t\t\tThe lzxy Team<br>\n" +
                    "                    \t\t\t<a style=\"color: #8f98a0;\" href=\"#\">暂无链接</a><br>\n" +
                    "                    </td>\n" +
                    "\t\t\t\t</tr>\n" +
                    "\n" +
                    "\t\t\t</table>\n" +
                    "\t\t</td>\n" +
                    "\t</tr>\n" +
                    "\n" +
                    " <td bgcolor=\"#000000\">\n" +
                    "     \t<table width=\"460\" height=\"55\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                    "       \t <tr valign=\"top\">\n" +
                    "          <td width=\"110\">\n" +
                    "            <a href=\"#\" target=\"_blank\" style=\"color: #8B8B8B; font-size: 10px; font-family: Trebuchet MS, Verdana, Arial, Helvetica, sans-serif; text-transform: uppercase;><span style=\"font-size: 10px; color: #8B8B8B; font-family: Trebuchet MS,Verdana,Arial,Helvetica,sans-serif; text-transform: uppercase\">\n" +
                    "\t\t\t<img src=\"https://imgsa.baidu.com/forum/w%3D580/sign=0dd1aa853ffa828bd1239debcd1d41cd/98448eb1cb134954b8ccc6e45a4e9258d3094aff.jpg\" alt=\"VALVE\" width=\"92\" height=\"26\" hspace=\"0\" vspace=\"0\" border=\"0\" align=\"top\"></span></a></td>\n" +
                    "\t\t  <td width=\"350\" valign=\"top\">\n" +
                    "\t\t   <span style=\"color: #999999; font-size: 9px; font-family: Verdana, Arial, Helvetica, sans-serif;\">© lzxy team All rights reserved. All trademarks are property of their respective owners in the US and other countries.</span>\n" +
                    "\t\t  </td>\n" +
                    "       \t </tr>\n" +
                    "        </table>\n" +
                    "\t</td>\n" +
                    "  </tr>\n" +
                    "</table>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n";
}
