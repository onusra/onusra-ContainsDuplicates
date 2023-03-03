
import java.util.*;
public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public static void main(String [] args){

    }
    public boolean containsDuplicate(int[] nums){
        Set<Integer> num = new HashSet<>();
        for(int i : nums){
            if(!num.add(i)){
                return true;
            }
        }
        return false;
    }
}
