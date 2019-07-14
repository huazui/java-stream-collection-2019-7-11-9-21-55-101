package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left<right)
       return  Stream.iterate(left, n -> n + 1).limit(right-left+1). collect(Collectors.toList());
    else {
        return  Stream.iterate(left, n -> n -1).limit(left-right+1). collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        return getListByInterval(left,right).stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(item->item%2==0).boxed().collect(Collectors.toList());

    }

    public int popLastElment(int[] array) {
        return array[array.length-1];

    }


}
