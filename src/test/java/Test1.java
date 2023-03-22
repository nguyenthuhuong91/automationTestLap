//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class Test1 {
//    String URL_LOGIN = "https://github.com/";
//    WebDriver driver;
//    //tranthithao1696@gmail.com/123456789tT@t
//    @BeforeTest
//     public void before(){
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromed" +
//                "" +
//                "" +
//                "river.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
////       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//       driver.manage().window().maximize();
//        driver.get(URL_LOGIN);
//    }
//    @Test
//    public void Login(){
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//    }
//
////    @AfterTest
////    public void down(){
////        driver.quit();
////    }
//
//}
