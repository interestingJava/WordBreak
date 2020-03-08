package com.service.impl;


import com.pojo.DefaultDictionary;
import com.pojo.Dictionary;
import com.pojo.UserDictionary;
import com.service.WordBreakService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class WordBreakServiceImpl implements WordBreakService {
    /*
    * 默认字典
    * */
    private static DefaultDictionary defaultDictionary=new DefaultDictionary();

    /*
    * 分隔字符串前参数设置
    * params
    * word:需要分隔的字符串
    * userDictionary:用户自定义字典
    * */
    @Override
    public void wordBreak(String word, UserDictionary userDictionary) {
        if(word!=null){
            if(userDictionary!=null
                && userDictionary.getDictionary()!=null){
                    Map<String, Object> map = new HashMap<String, Object>();
                    Arrays.asList(defaultDictionary.getDictionary())
                            .forEach(word1 ->map.put(word1, word1));
                    Arrays.asList(userDictionary.getDictionary())
                            .forEach(word2 ->map.put(word2, word2));
                defaultDictionary.setDictionary(map.keySet().toArray(new String[1]));
            }
            wordBreakUtil(word, word.length(), "");
        }
    }

    /*
     * 分隔字符串递归方法
     * params
     * word:需要分隔的字符串
     * length:字符串长度
     * result：分隔结果
     * */
    private void wordBreakUtil(String word, int length, String result) {
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
    private boolean dictionaryContains(String prefix) {
        int n = defaultDictionary.getDictionary().length;
        for (int i = 0; i < n; i++)
            if (defaultDictionary.getDictionary()[i].compareTo(prefix) == 0)
                return true;
        return false;
    }

}
