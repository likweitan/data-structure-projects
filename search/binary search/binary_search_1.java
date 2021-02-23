/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
/**
 *
 * @author Lik Wei
 */
public class BinarySearch1 {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 15, 22, 35};
        Arrays.sort(arr);
        
        int key = 22;
        int res = Arrays.binarySearch(arr, key);
        if(res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println(key + " Not Found");
        
        key = 40;
        res = Arrays.binarySearch(arr, key);
        if(res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println("Not Found");
    }
}
