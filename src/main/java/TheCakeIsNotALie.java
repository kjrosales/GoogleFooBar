/**
 * Created by Bobfr on 2/4/2017.
 */
public class TheCakeIsNotALie {

    public static int answer(String s){
        int retVal = 0;
        String sub = "";
        boolean pass = true;

        for(int i = 0; i <= s.length() / 2; i++){
            // appends 1 letter at a time.
            sub += s.substring(i,i+1);
            retVal = 0;
            pass = true;

            for(int j = 0; j < s.length(); j += sub.length()){
                // Increments sub string sets based on the size of current value.
                if((sub.length() + j) > s.length())
                    break;
                else if(s.substring(j,sub.length() + j).equals(sub))
                    retVal++;
                else {
                    pass = false;
                    break;
                }
            }

            if(pass)
                break;
        }
        return retVal == 0? 1 : retVal;
    }
}
