package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max=(leftBorder>rightBorder?leftBorder:rightBorder);
        int min=(leftBorder<rightBorder?leftBorder:rightBorder);
        int sum=0;
        for(int i=min;i<=max;i++){
            sum+=(i%2==0?i:0);
        }
return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().collect(Collectors.summingInt(item->(item*3+2)));


    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map(item -> {
            if (item % 2 == 1) {
                item = item * 3 + 2;
            }
            return item;
        }).collect(Collectors.toList());
    }



   public double getAverageOfEven(List<Integer>array){
        return array.stream().filter(item->item%2==0).collect(Collectors.summarizingDouble(item->item)).getAverage();
   }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item%2==0).collect(Collectors.toSet()).stream().collect(Collectors.toList());
        }



}
