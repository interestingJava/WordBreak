package com.service;

import com.pojo.Dictionary;
import com.service.impl.WordBreakServiceImpl;
import org.junit.Test;

import javax.annotation.Resource;

public class WorkBreakTest {

    WordBreakServiceImpl wordBreakService=new WordBreakServiceImpl();

    /*
    * 测试1
    * 被分隔字符串： "ilikesamsungmobile";
    * 用户字典：null
    * */
    @Test
    public void test1(){
        String word = "ilikesamsungmobile";
        wordBreakService.wordBreak(word,null);
    }

    /*
     * 测试2
     * 被分隔字符串： "ilikeicecreamandmango";
     * 用户字典：null
     * */
    @Test
    public void test2(){
        String word = "ilikeicecreamandmango";
        wordBreakService.wordBreak(word,null);
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
        wordBreakService.wordBreak(word,userDictionary);
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
        wordBreakService.wordBreak(word,userDictionary);
    }

    /*
     * 测试5
     * 被分隔字符串： "";
     * 用户字典：{ "i","like","sam","sung","mobile","icecream","man go","mango" }
     * */
    @Test
    public void test5(){
        String [] dictionary= { "i","like","sam","sung","mobile","icecream","man go","mango" };
        Dictionary userDictionary=new Dictionary();
        userDictionary.setDictionary(dictionary);
        wordBreakService.wordBreak("",userDictionary);
    }

    /*
     * 测试6
     * 被分隔字符串： null;
     * 用户字典：{ "i","like","sam","sung","mobile","icecream","man go","mango" }
     * */
    @Test
    public void test6(){
        String [] dictionary= { "i","like","sam","sung","mobile","icecream","man go","mango" };
        Dictionary userDictionary=new Dictionary();
        userDictionary.setDictionary(dictionary);
        wordBreakService.wordBreak(null,userDictionary);
    }

    /*
     * 测试7
     * 被分隔字符串： "";
     * 用户字典：{ }
     * */
    @Test
    public void test7(){
        String word = "";
        String [] dictionary= {};
        Dictionary userDictionary=new Dictionary();
        userDictionary.setDictionary(dictionary);
        wordBreakService.wordBreak(word,userDictionary);
    }

    /*
     * 测试8
     * 被分隔字符串： null;
     * 用户字典：null
     * */
    @Test
    public void test8 (){
        wordBreakService.wordBreak(null,null);
    }



}
