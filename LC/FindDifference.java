package LC;
import java.util.HashMap
public class FindDifference {
        public char findTheDifference(String s, String t) {
            HashMap<Character,Integer> counts = new HashMap<>();

            //counting each element's frequency; in string s
            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                counts.put(c, counts.getOrDefault(c,0)+1);
            }


            // now iterating through string t and decrementing count;
            for(int i = 0; i<t.length();i++){
                char  c = t.charAt(i);
                if(!counts.containsKey(c) || counts.get(c)==0) return c;

                counts.put(c, counts.get(c) - 1);
            }
            return ' ';

    }
}
