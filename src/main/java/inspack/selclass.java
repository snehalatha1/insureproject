package inspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selclass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha ganesh\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions c1=new ChromeOptions();
		c1.addArguments("--headless");
		c1.addArguments("--no-sandbox");
		c1.addArguments("--disable-dev-shm-usage");
		//c1.addArguments("--remote-allow-origins=*");
		WebDriver driver1= new ChromeDriver(c1);
		driver1.get("http://13.234.17.131:8080/contact.html");
		driver1.findElement(By.id("inputName")).sendKeys("sneha");
		driver1.findElement(By.id("inputNumber")).sendKeys("9999999999");
		driver1.findElement(By.id("inputMail")).sendKeys("sneha@gmail.com");
		driver1.findElement(By.id("inputMessage")).sendKeys("HI ALL");
		driver1.findElement(By.id("my-button")).click();
		String url= driver1.getCurrentUrl();
		if (url.equals("http://13.234.17.131:8080//contact.html")){
			System.out.println("TEST SUCCESS");
		}
	}
}
