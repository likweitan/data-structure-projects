/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Lik Wei
 */
public class BinarySearch2 {
    public static void main(String[] args)
    {
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(10);
        a1.add(20);
        
        // 10 is present at index 3
        int key = 10;
        int res = Collections.binarySearch(a1, key);
        if(res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println(key + " not found");
        
        key = 15;
        res = Collections.binarySearch(a1, key);
        if(res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println(key + " not found");
    }
}
