package com;

import java.util.HashMap;
import java.util.Map;

public class WordBreak {
    /*
    * 默认字典
    * */
    private static String[] dictionary = { "mobile", "samsung", "sam", "sung", "man", "go", "i",  "and","like", "ice", "cream" };

    public static void main(String[] args) {
        String word = "ilikeicecreamandmango";
        String userDictionary[] = { "i","like","sam","sung","mobile","icecream","man go","mango" };
        wordBreak(word,userDictionary);

    }

    /*
    * 分隔字符串前参数设置
    * params
    * word:需要分隔的字符串
    * userDictionary:用户自定义字典
    * */
    private static void wordBreak(String word,String[] userDictionary) {
        if(userDictionary!=null){
            Map<String, Object> map = new HashMap<String, Object>();
            for (String word1 : dictionary) {
                map.put(word1, word1);
            }
            for (String word2 : userDictionary) {
                map.put(word2, word2);
            }
            dictionary = map.keySet().toArray(new String[1]);
        }
        wordBreakUtil(word, word.length(), "");
    }

    /*
     * 分隔字符串递归方法
     * params
     * word:需要分隔的字符串
     * length:字符串长度
     * result：分隔结果
     * */
    private static void wordBreakUtil(String word, int length, String result) {
        for(int i=1; i<=length; i++)
        {
            String prefix = word.substring(0, i);
            if (dictionaryContains(prefix)) {
                if (i == length) {
                    result += prefix;
                    System.out.println(result);
                    return;
                }
                wordBreakUtil(word.substring(i, length), length-i, result + prefix + " ");
            }
        }
    }

    /*
    *查找字典
    * params
    *prefix：待比较的值
    * */
    private static boolean dictionaryContains(String prefix) {
        int n = dictionary.length;
        for (int i = 0; i < n; i++)
            if (dictionary[i].compareTo(prefix) == 0)
                return true;
        return false;
    }
}
