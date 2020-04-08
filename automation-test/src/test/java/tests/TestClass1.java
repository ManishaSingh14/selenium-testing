package tests;

import org.testng.annotations.*;

public class TestClass1 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
    @BeforeTest
    private void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @Test(dataProvider = "numbers")
    public void testCase1(int a,int b){
        System.out.println(sum(a,b));
    }
    @Test(dataProvider = "numbers1")
    public void testCase2(int a,int b){
        System.out.println(product(a,b));
    }
    @DataProvider(name = "numbers")
    public static Object[][] numberData(){
        return new Object[][] {{2,5},{3,4},{4,2},{1,5}};
    }
    public int sum(int a,int b){
        return a+b;
    }
    @DataProvider(name = "numbers1")
    public static Object[][] numbersData(){
        return new Object[][] {{2,4},{3,5},{5,2},{6,5}};
    }
    public int product(int a,int b){
        return a*b;
    }
    @Test
    public void testCase3(){
        System.out.println("all test cases run fine");
    }
}

