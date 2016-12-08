package com.inuker.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dingjikerbo on 16/12/8.
 */

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
