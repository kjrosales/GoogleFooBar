import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bobfr on 2/7/2017.
 */
public class PassTheCodedMessages {

    public static int answer(int[] l) {
        List<Integer> vals = new ArrayList<Integer>();
        int subLen = 0;
        int sum = 0;
        int inc = 1;
        // Checks if sum is divisible by 3
        // using divisibility rule
        if (l.length == 1 && l[0] % 3 != 0)
            return 0;
        else if(l.length == 1 && l[0] % 3 == 0)
            return l[0];

        sum = sumArray(l);
        // If the sum is divisible by 3, then it is a multiple of 3;
        if(sum % 3 == 0)
            return getValue(l, 0);

        // Gets all possible values that can be removed.
        for (int i = 1; i < sum; i++) {
            if ((sum - i) % 3 == 0) {
                vals.add(i);
            }
        }
        // Sorts ascending
        Arrays.sort(l);
        // Checks if first level has any of the given values.
        int[] incs = new int[l.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < l.length; i++) {

            int tmpVal = l[i];
            ArrayList<Integer> path = new ArrayList<Integer>();
            if(vals.contains(tmpVal)){
                path.add(l[i]);
                map.put(i,path);
                continue;
            }
            for(int j = 0; j < l.length; j++){
                if(l[j] == 0)
                    continue;
                if(j != i)
                    tmpVal += l[j];
                path.add(l[j]);
                if(vals.contains(tmpVal)){
                    if(j < i)
                        path.add(l[i]);
                    map.put(i,path);
                    break;
                }
            }
        }
        // No possible solutions found.
        if(map.size() == 0)
            return 0;

        int keyOfSmallest = -1;
        for(Integer key : map.keySet()){
            // Sets first key.
            if(keyOfSmallest == -1) {
                keyOfSmallest = key;
                continue;
            }
            // Compares the smallest key to current. If the current key is smaller, swap.
            if(map.get(key).size() < map.get(keyOfSmallest).size()){
                keyOfSmallest = key;
            } else if(map.get(key).size() == map.get(keyOfSmallest).size()) {
                // If the size's of the arrays are equal. Compare the sums.
                // The smallest sum is the key.
                if(sumArray(map.get(key)) < sumArray(map.get(keyOfSmallest))  ){
                    keyOfSmallest = key;
                } else if(sumArray(map.get(key)) == sumArray(map.get(keyOfSmallest))){
                    // If the sums were equal, check for the smallest leading values.
                    for(int i = 0; i < map.get(key).size(); i++){
                        if(map.get(key).get(i) < map.get(keyOfSmallest).get(i))
                        {
                            keyOfSmallest = key;
                            break;
                        }
                    }
                }
            }
        }

        // Removes necessary digits from array.
        for(int j = 0; j < l.length; j++) {
            if (map.get(keyOfSmallest).contains(l[j])) {
                l[j] = 0;
                map.get(keyOfSmallest).remove(l[j]);
                subLen++;
            }
        }

        return getValue(l,subLen);
    }

    // Gets the sum of the digits of an array.
    public static int sumArray(int[] l){
        int sum = 0;
        for(int i = 0; i < l.length; i++)
            sum += l[i];
        return sum;
    }
    // Gets the sum of the digits of an ArrayList.
    public static int sumArray(ArrayList<Integer> l){
        int sum = 0;
        for(Integer i : l)
            sum += i;
        return sum;
    }


    public static int[] sort(int[] nums){
        int j;
        int key;

        for(int i = 1; i < nums.length; i++){
            key = nums[i];
            for(j=i-1;(j>=0)&&(nums[j]<key);j--)
                nums[j+1] = nums[j];
            nums[j+1] = key;
        }

        return nums;
    }

    public static int getValue(int[] l, int lengthSubtraction){
        int result = 0;
        l = sort(l);
        for(int i = 0; i < l.length; i++)
            result += l[i] * (Math.pow(10,l.length - i -1 - lengthSubtraction));
        return result;
    }
}
