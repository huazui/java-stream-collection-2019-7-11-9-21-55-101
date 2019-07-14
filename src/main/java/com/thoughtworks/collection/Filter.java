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
       return firstList.stream().filter(item->secondList.contains(item)).collect(Collectors.toList());
    }
//这个我暂时想不到filter怎么用，因为返回索引位置总是报错，不知道为什么。只能用map再转为list。
    //学习到了distinct新方法
    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());

    }

}