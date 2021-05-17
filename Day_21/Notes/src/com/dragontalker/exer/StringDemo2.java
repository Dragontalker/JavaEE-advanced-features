package com.dragontalker.exer;

import org.junit.Test;

public class StringDemo2 {
    //获取两个字符串中最大相同的字串
    //前提: 两个字符串中只有一个最大相同字串
    public String getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return null;
    }

    @Test
    public void test1() {
        String str1 = "abcwerthello12345yuiodef";
        String str2 = "cvhello12345bnm";
        String result = getMaxSameString(str1, str2);
        System.out.println(result);
    }
}
