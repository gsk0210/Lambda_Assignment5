package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStringInList {

    static List<String> distinctList(List<String> stringList){
         return stringList.stream().distinct().sorted().collect(Collectors.toList());

    }

    public static void main(String[] args) {

            List<String> listString= Arrays.asList("Iris","Rose","Jasmine","Rose","Jasmine","Rose","Rose","Rose");
        //DistinctStringInList distinctStringInList=new DistinctStringInList();


            System.out.println(DistinctStringInList.distinctList(listString));


        }

    }



