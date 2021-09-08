package apple;

/* Your previous Plain Text content is preserved below:

input string: aaabbcccdd
output string: a3b2c3d2

input string: aabbccddac
output string: a3b2c3d2
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class repeatedChars{

    public String solution(String input) {
        if(input.length()==0)
            return "0";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0; i < input.length(); i++){
            if(!map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),1);
             } else {
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            }
    }
        StringBuilder response = new StringBuilder();

        for(Character cha : map.keySet()){
            System.out.println("Chars " + cha);
        }

        for(Integer inti : map.values()) {
            System.out.println("Intis " + inti);
        }
        for(Map.Entry me : map.entrySet()){
            response.append(me.getKey()).append(me.getValue());
        }

        return response.toString();
    }

    public static void main(String[] args) {
        repeatedChars rep = new repeatedChars();
        System.out.println(rep.solution("aaabb"));
        System.out.println(rep.solution("ababakkka"));
        System.out.println(rep.solution("b"));
        System.out.println(rep.solution(""));
        System.out.println(rep.solution("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
        System.out.println(rep.solution("111222333"));
    }
}