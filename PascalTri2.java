package org.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTri2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long value = 1;
        res.add((int)value);
        for(int i=1; i<=rowIndex; i++){
            value = (long)value * (rowIndex-i+1)/i;
            res.add((int)value);
        }
        return res;
    }
}
