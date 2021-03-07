package com.knoldus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DistinctStringInListTest {
    private DistinctStringInList distinctStringInList;

    @BeforeEach
    void setUp() {
        distinctStringInList=new DistinctStringInList();
    }

    @Test
    void main() {

        //An alternative for writing multiple assertions

        assertAll("Possible Inputs",
                ()->assertEquals(Arrays.asList("Good Morning","Hello","Hi"),DistinctStringInList.distinctList(Arrays.asList("Hi","Hello","Good Morning","Good Morning","Hello","Hi"))),
                ()->assertEquals(Arrays.asList(),DistinctStringInList.distinctList(Arrays.asList())),
                ()->assertEquals(Arrays.asList("clojure","java","scala"),DistinctStringInList.distinctList(Arrays.asList("java","scala","java","clojure","clojure"))),
                ()->assertEquals(Arrays.asList("a","an","the","three"),DistinctStringInList.distinctList(Arrays.asList("the","three","the","three","the","three","an","an","a")))
        );


    }
}