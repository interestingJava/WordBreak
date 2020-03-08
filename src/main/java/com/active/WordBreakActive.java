package com.active;

import com.service.impl.WordBreakServiceImpl;

public class WordBreakActive {

    public static void main(String[] args) {
        String word = "ilikesamsungmobile";
        WordBreakServiceImpl wb=new WordBreakServiceImpl();
        wb.wordBreak(word,null);
    }

}
