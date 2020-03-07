package com.service;

import com.pojo.Dictionary;
import com.service.WordBreak;
import org.junit.Test;

public class WorkBreakTest {

    /*
    * 测试1
    * 被分隔字符串： "ilikesamsungmobile";
    * 用户字典：null
    * */
    @Test
    public void test1(){
        String word = "ilikesamsungmobile";
        WordBreak wb=new WordBreak();
        wb.wordBreak(word,null);
    }

    /*
     * 测试2
     * 被分隔字符串： "ilikeicecreamandmango";
     * 用户字典：null
     * */
    @Test
    public void test2(){
        String word = "ilikeicecreamandmango";
        WordBreak wb=new WordBreak();
        wb.wordBreak(word,null);
    }

    /*
     * 测试3
     * 被分隔字符串： "ilikesamsungmobile";
     * 用户字典：{ "i","like","sam","sung","mobile","icecream","man go","mango" }
     * */
    @Test
    public void test3(){
        String word = "ilikesamsungmobile";
        String [] dictionary= { "i","like","sam","sung","mobile","icecream","man go","mango" };
        Dictionary userDictionary=new Dictionary();
        userDictionary.setDictionary(dictionary);
        WordBreak wb=new WordBreak();
        wb.wordBreak(word,userDictionary);
    }

    /*
     * 测试4
     * 被分隔字符串： "ilikeicecreamandmango";
     * 用户字典：{ "i","like","sam","sung","mobile","icecream","man go","mango" }
     * */
    @Test
    public void test4(){
        String word = "ilikeicecreamandmango";
        String [] dictionary= { "i","like","sam","sung","mobile","icecream","man go","mango" };
        Dictionary userDictionary=new Dictionary();
        userDictionary.setDictionary(dictionary);
        WordBreak wb=new WordBreak();
        wb.wordBreak(word,userDictionary);
    }



}
