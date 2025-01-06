package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/20 22:35
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        List<Boolean> l = new ArrayList<>();

        boolean[] l1 = new boolean[length+1];
        l1[0] =true;

        for (int i = 0; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                if (l1[i] == true && wordDict.contains(s.substring(i, j))){
                    l1[j]=true;
                }
            }
        }
        return l1[length];
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordBreak("leetcode", wordDict);
    }
}
