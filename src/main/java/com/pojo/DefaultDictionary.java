package com.pojo;

/*
 * 默认字典
 * */
public class DefaultDictionary extends Dictionary{

    private static String[] defaultDictionary = { "mobile", "samsung", "sam", "sung", "man", "go", "i",  "and","like", "ice", "cream" };

    public DefaultDictionary(){
       this.setDictionary(defaultDictionary);
    }
}
