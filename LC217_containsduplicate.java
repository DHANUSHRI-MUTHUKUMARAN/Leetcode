import java.util.HashSet;
import java.util.Set;

public class LC217_containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)) return true;
        }
        return false;
    }   
    
}
/**
 * seen.add(num) -> if the num is not present in the set
 *              -> adds the num and returns true
 *              -> else it wont add the num and return false
 *
 * !seen.add(num) -> if the num is already present in the set, it wont add it and return false
 *               -> !false = true, so it will return true if the num is already present in the set
 *               -> else it will return false if the num is not present in the set
 */