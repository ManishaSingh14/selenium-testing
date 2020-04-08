package tests;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class TestClass2 {
    @Test
    public void testCase4(){
        System.out.println("testcase4");
        throw new RuntimeException();
    }
    @Test
    public void testCase5(){
        System.out.println("testcase5");
    }

}
