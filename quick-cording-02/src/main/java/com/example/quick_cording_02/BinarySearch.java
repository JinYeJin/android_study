package com.example.quick_cording_02;


/**
 * Created by Jin on 12/12/2016.
 */

class BinarySearch {
    private int[] list;
    private int first;
    private int last;
    private int answer ;
    private int count;



    public void init(){
        first = 0;
        last = 99;
        count = 0;
        answer = (first + last) / 2;

        for(int i =0; i <100; i++) {
            list[i] = i;
        }
    }

    public void up(){
        first = answer + 1;
    }

    public void down(){
        last = answer - 1;
    }

    public int getAnswer(){
        return answer;
    }

    public int getCount(){
        return count;
    }
}