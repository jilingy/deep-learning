package com.jilingy.deep.learning.base.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    private Map<Character, String> map = new HashMap<Character, String>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "abc");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    private ArrayList<String> res;

    public List<String> letterCombinations(String digits) {
        return res;
    }

    private void findCombination(String digits, int index, String s) {
    }


    public class Test {
        public void main(String[] args) {
            for (String letterCombination : letterCombinations("27")) {
                System.out.println(letterCombination);
            }
        }
    }

}
