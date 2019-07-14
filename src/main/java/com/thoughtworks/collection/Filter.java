package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {

        return array.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }
//这个我暂时想不到filter怎么用，因为返回索引位置总是报错，不知道为什么。
    public List<Integer> getDifferentElements() {
        return array.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        }

}