package TestNGPractice;

import org.testng.annotations.*;

public class TestNGClass {
    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before Suite method");
    }
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("Before Test method");
    }
    @AfterMethod
    public void afterMethodMethod(){
        System.out.println("After Method method");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After CLass method");
    }
    @AfterTest
    public void afterTestMethod(){
        System.out.println("After Test method");
    }
    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After Suite method");
    }
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class method");
    }
    @BeforeMethod
    public void beforeMethodMethod(){
        System.out.println("Before Method Method");
    }
    @Test(priority = 1, groups = "smoke")
    public void TestMethod1(){
        System.out.println("Test Method 1");
    }
    @Test(priority = 2, groups = {"smoke","regression"})
    public void TestMethod2(){
        System.out.println("Test Method 2");
    }
    @Test(priority = 3, groups = "regression")
    public void TestMethod3(){
        System.out.println("Test Method 3");
    }
    @Test(priority = 4, groups = "smoke")
    public void TestMethod4(){
        System.out.println("Test Method 4");
    }
    @Test(priority = 5, groups = {"smoke","regression"})
    public void TestMethod5(){
        System.out.println("Test Method 6");
    }
    @Test(priority = 6, groups = "regression")
    public void TestMethod6(){
        System.out.println("Test Method 6");
    }
    @Test(priority = 7, groups = "smoke")
    public void TestMethod7(){
        System.out.println("Test Method 7");
    }
    @Test(priority = 8, groups = {"smoke","regression"})
    public void TestMethod8(){
        System.out.println("Test Method 8");
    }
    @Test(priority = 9, groups = "regression", alwaysRun = true)
    public void TestMethod9(){
        System.out.println("Test Method 9");
    }
    @Test(priority = 10, groups = "smoke", enabled = true)
    public void TestMethod10(){
        System.out.println("Test Method 10");
    }
    @Test(priority = 10, groups = "smoke", enabled = true)
    public void TestMethod11(){
        System.out.println("Test Method 11");
    }
}
