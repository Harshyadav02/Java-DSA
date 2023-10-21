
import java.util.ArrayList;
public class _13_Substring {

    static ArrayList<String> subString(String processed , String unProcessed , ArrayList<String> list){

        if( unProcessed.isEmpty()){
            list.add(processed);
            return list ;
        }
        char ch = unProcessed.charAt(0) ;

        subString(processed + ch , unProcessed.substring(1) , list) ;
        subString(processed , unProcessed.substring(1) , list);

        return list ;
    }

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        System.out.println(subString("" , "abc" , list)) ;
    }
}