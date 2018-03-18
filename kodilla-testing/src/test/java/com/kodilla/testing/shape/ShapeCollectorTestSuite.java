package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
        private static int testCounter = 0;

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }
    //sprawdza czy dodano figure
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();


        //When
        shapeCollector.addFigure(new Triangle());

        //Then
        Assert.assertEquals(1,shapeCollector.showFigures());


    //sprawdza czy usunieto figure

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(new Triangle());

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, shapeCollector.showFigures());
        }
    // sprawdza czy pobrano figure z n miejsca
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.getFigure(2);

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(2, shapeCollector.size());

    // sprawdza czy usunieto figure z n miejsca
}
