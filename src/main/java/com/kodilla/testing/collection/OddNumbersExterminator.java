package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator
{
    public void exterminate(ArrayList<Integer> numbers){
        Integer temporaryValue = 0;
        for(int n=0; n>numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if(temporaryValue % 2 == 0){
                numbers.add(temporaryValue);
            }
        }
    }
}