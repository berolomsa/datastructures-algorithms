package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
//        List<String> a = Arrays.asList("kfomka","hecagbngambii","anobmnikj","c","nnkmfelneemfgcl","ah","bgomgohl","lcbjbg","ebjfoiddndih","hjknoamjbfhckb","eioldlijmmla","nbekmcnakif","fgahmihodolmhbi","gnjfe","hk","b","jbfgm","ecojceoaejkkoed","cemodhmbcmgl","j","gdcnjj","kolaijoicbc","liibjjcini","lmbenj","eklingemgdjncaa","m","hkh","fblb","fk","nnfkfanaga","eldjml","iejn","gbmjfdooeeko","jafogijka","ngnfggojmhclkjd","bfagnfclg","imkeobcdidiifbm","ogeo","gicjog","cjnibenelm","ogoloc","edciifkaff","kbeeg","nebn","jdd","aeojhclmdn","dilbhl","dkk","bgmck","ohgkefkadonafg","labem","fheoglj","gkcanacfjfhogjc","eglkcddd","lelelihakeh","hhjijfiodfi","enehbibnhfjd","gkm","ggj","ag","hhhjogk","lllicdhihn","goakjjnk","lhbn","fhheedadamlnedh","bin","cl","ggjljjjf","fdcdaobhlhgj","nijlf","i","gaemagobjfc","dg","g","jhlelodgeekj","hcimohlni","fdoiohikhacgb","k","doiaigclm","bdfaoncbhfkdbjd","f","jaikbciac","cjgadmfoodmba","molokllh","gfkngeebnggo","lahd","n","ehfngoc","lejfcee","kofhmoh","cgda","de","kljnicikjeh","edomdbibhif","jehdk");
        wordBreak("leetcode", Arrays.asList("leet","code"));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() ==1) return wordDict.contains(s);
        HashSet<String> set = new HashSet<>(wordDict);
        return checkWord(s, set, new HashSet<Integer>(), 0);
    }

    public static boolean checkWord(String s, HashSet<String> set, HashSet<Integer> memo, Integer index) {
        if (index == s.length()) return true;
        if (memo.contains(index)) return false;

        for (int i=index+1; i<=s.length(); i++) {
            String sub = s.substring(index,i);
            if (set.contains(sub)) {
                if (checkWord(s, set, memo, i)) return true;
                else memo.add(i);
            }
        }

        return false;
    }

}
