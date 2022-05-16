import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class practice {

    public static void main(String[] args) {



//        String str= "Java Developer"; //j
//
//        Map<Character,Integer> map=new HashMap<>();
//        int count=0;
//
//
//        for(Character ch : str.toCharArray()) {
//            if (map.containsKey(ch)) {
//                count=map.get(ch);
//                map.put(ch,count+1);
//            }else {
//                map.put(ch,1);
//            }
//
//        }

        Predicate<Integer> predicate= p -> p<18;

        System.out.println("predicate.test(23) = " + predicate.test(23));
    }
}
