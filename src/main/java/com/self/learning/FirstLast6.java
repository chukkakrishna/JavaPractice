package com.self.learning;
/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6 {
    public boolean fIRSTlASTPGM(int[] a){
        /*
        for (int i=0;i<a.length;i++){
            System.out.println("values are "+a[i]);
        }  */
    if (a[0]==6 || a[a.length-1]==6) {
        return true;
    }
    else{
        return false;
    }
    }
    public static void main(String[] args) {
        FirstLast6 obj1= new FirstLast6();
        System.out.println(obj1.fIRSTlASTPGM(new int[]{6,13, 6, 1, 2, 3}));
    }
}
