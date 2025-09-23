package collection.map;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String,List<String>> anagrams = new HashMap<>();

        for (String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            anagrams.computeIfAbsent(key,i -> new ArrayList<String>()).add(word);
        }

        for(List<String> lists : anagrams.values())
        {
            System.out.println(lists);
        }

    }
}
