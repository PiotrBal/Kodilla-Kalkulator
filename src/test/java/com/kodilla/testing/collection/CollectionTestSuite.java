package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Collection Test Suite: Start");
    }
    @After
    public void after() {
        System.out.print("Collection Test Suite: End");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Object> emptyList = Collections.emptyList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.print(result);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        for(int n=0; n>50; n++) {
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            //When
            ArrayList<Integer> result = oddNumbersExterminator.exterminate(normalList);
            System.out.print(result);
            //Then
            Assert.assertEquals(51, result.size());
        }
    }
}
