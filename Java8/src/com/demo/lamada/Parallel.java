package com.demo.lamada;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.entity.PersonModel;

public class Parallel {
	//根据数字的大小，有不同的结果
    private static int size=10000000;
    public static void main(String[] args) {
        System.out.println("-----------List-----------");
        //testList();
        System.out.println("-----------Set-----------");
        //testSet();
        peekTest();
    }
    private static void peekTest() {
        List<PersonModel> data = Data.getData();

        //peek打印出遍历的每个per
        data.stream().map(per->per.getName()).peek(p->{
            System.out.println(p);
        }).collect(Collectors.toList());
    }
    /**
     * 测试list
     */
    public static void testList(){
        List<Integer> list = new ArrayList<>(size);
        for (Integer i = 0; i < size; i++) {
            list.add(new Integer(i));
        }

        List<Integer> temp1 = new ArrayList<>(size);
        //老的
        long start=System.currentTimeMillis();
        for (Integer i: list) {
            temp1.add(i);
        }
        System.out.println(+System.currentTimeMillis()-start);

        //同步
        long start1=System.currentTimeMillis();
        list.stream().collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start1);

        //并发
        long start2=System.currentTimeMillis();
        list.parallelStream().collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start2);
    }

    /**
     * 测试set
     */
    public static void testSet(){
        List<Integer> list = new ArrayList<>(size);
        for (Integer i = 0; i < size; i++) {
            list.add(new Integer(i));
        }

        Set<Integer> temp1 = new HashSet<>(size);
        //老的
        long start=System.currentTimeMillis();
        for (Integer i: list) {
            temp1.add(i);
        }
        System.out.println(+System.currentTimeMillis()-start);

        //同步
        long start1=System.currentTimeMillis();
        list.stream().collect(Collectors.toSet());
        System.out.println(System.currentTimeMillis()-start1);

        //并发
        long start2=System.currentTimeMillis();
        list.parallelStream().collect(Collectors.toSet());
        System.out.println(System.currentTimeMillis()-start2);
    }
}

