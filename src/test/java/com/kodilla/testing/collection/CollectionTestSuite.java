package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

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
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator emptyNumbers= new OddNumbersExterminator();
        ArrayList<Integer> sizeCheck = new ArrayList<Integer>();
        emptyNumbers.exterminate(sizeCheck);
        if (sizeCheck.size()==0) {
            System.out.println("List is empty");
        } else {
            System.out.println("Error");
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbers= new OddNumbersExterminator();
        ArrayList<Integer> oddCheck = new ArrayList<>();
        oddCheck.add(1);
        oddCheck.add(2);
        oddCheck.add(3);
        oddCheck.add(4);
        oddCheck.add(5);
        oddCheck.add(6);
        oddCheck.add(7);
        ArrayList<Integer> check = oddNumbers.exterminate(oddCheck);
        if (check.size()==3) {
            System.out.println("List is ok");
        } else {
            System.out.println("blad");
        }
    }
}
