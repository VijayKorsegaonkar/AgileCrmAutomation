/*
 * package windowhandling;
 * 
 * import java.util.Iterator; import java.util.Set;
 * 
 * import org.openqa.selenium.By;
 * 
 * import com.agilecrmautomation.BaseClass;
 * 
 * public class WindowHandling1 extends BaseClass {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * launchBrowser("chrome");
 * 
 * driver.navigate().to("https://demo.automationtesting.in/Windows.html");
 * Thread.sleep(1000);
 * 
 * driver.manage().window().maximize(); //parent window id String
 * parentId=driver.getWindowHandle(); System.out.println(parentId);
 * System.out.println(driver.getTitle()); driver.findElement( By.xpath(
 * "//div[@class='tab-content']/descendant::button[normalize-space(text()='click')][1]"
 * )).click(); Thread.sleep(1000); Set<String> allIds=driver.getWindowHandles();
 * System.out.println(allIds); Iterator<String> multipleId=allIds.iterator();
 * 
 * String window1=multipleId.next(); System.out.println(window1); String
 * window2=multipleId.next(); System.out.println(window2);
 * driver.switchTo().window(window2); System.out.println(driver.getTitle());
 * 
 * while(multipleId.hasNext()) { String window=multipleId.next();
 * if(!(window==parentId)) { driver.switchTo().window(window);
 * System.out.println(driver.getTitle()); } else { } } }}
 */