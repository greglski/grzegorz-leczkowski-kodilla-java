package com.kodilla.testing.collection;

//import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    ArrayList<Integer> expectedEmptyList;
    ArrayList<Integer> actualEmptyList;
    ArrayList<Integer> expectedNormalList;
    ArrayList<Integer> actualNormalList;

    public CollectionTestSuite(){

        expectedEmptyList = new ArrayList<>();
        actualEmptyList = new ArrayList<>();

        expectedNormalList = new ArrayList<>();
        expectedNormalList.add(0);
        expectedNormalList.add(2);
        expectedNormalList.add(4);
        expectedNormalList.add(6);

        actualNormalList = new ArrayList<>();
        for(int i=0; i<7; i++){
            actualNormalList.add(i);
        }
    }

    @Before
    public void before(){
        System.out.println("Test case: begin");

    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(actualEmptyList);
        //Then
        Assert.assertEquals(expectedEmptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(actualNormalList);
        //Then
        Assert.assertEquals(expectedNormalList, result);
    }
}
