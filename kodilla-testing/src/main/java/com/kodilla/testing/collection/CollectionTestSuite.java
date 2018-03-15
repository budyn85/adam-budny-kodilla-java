package com.kodilla.testing.collection;
import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> theList = new ArrayList<Integer>();
        Random generator = new Random();
        for (int n=0; n<100; n++){
            theList.add(generator.nextInt(50));
        };
        int result = theList.size();
        Assert.assertEquals(result==0) /*if(){
            System.out.println("Error");
        }else{
            System.out.println("List contain:"+theList);
        }*/
    public void testOddNumbersExterminatorNormalList(){
            ArrayList<Integer> theList = new ArrayList<Integer>();
            Random generator = new Random();
            for (int n=0; n<100; n++){
                theList.add(generator.nextInt(50));
            };
            int result = theList.size();
            ArrayList<theList> evenList = new ArrayList<theList>();
            evenList.exterminate(theList);
            Assert.assertEquals
        }


    }
}
