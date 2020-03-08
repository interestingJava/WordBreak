package com.service;

import com.pojo.Dictionary;
import com.pojo.UserDictionary;

public interface WordBreakService {
    /*
     * 分隔字符串前参数设置
     * params
     * word:需要分隔的字符串
     * userDictionary:用户自定义字典
     * */
    public void wordBreak(String word, UserDictionary userDictionary);
}
