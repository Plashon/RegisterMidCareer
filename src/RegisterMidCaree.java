	import org.junit.jupiter.api.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


	class RegisterMidCaree  {

	    @Test
	    void testChrome() throws  InterruptedException {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.coding-midcareer.com/");
	        Thread.sleep(1000);

	        driver.findElement(By.className("theme-btn")).click();
	        Select dropdown = new Select(driver.findElement(By.id("pre_name_th")));
	        WebElement search_name = driver.findElement(By.name("name_th"));
	        WebElement search_lastname = driver.findElement(By.name("lastname_th"));
	        dropdown.selectByValue("นาย");
	        search_name.sendKeys("ภูเบศวร์");
	        search_lastname.sendKeys("นิ่มนวล");

	        WebElement search_nameEN = driver.findElement(By.name("name_en"));
	        WebElement search_lastnameEN = driver.findElement(By.name("lastname_en"));
	        search_nameEN.sendKeys("Phubate");
	        search_lastnameEN.sendKeys("Nimnuan");

	        WebElement search_card = driver.findElement(By.name("id_card"));
	        WebElement search_birthday = driver.findElement(By.name("birthday"));
	        WebElement search_phone = driver.findElement(By.name("phone"));
	        WebElement search_email = driver.findElement(By.name("email"));
	        search_card.sendKeys("1710400070504");
	        search_birthday.sendKeys("25/11/2546");
	        search_phone.sendKeys("0981326417");
	        search_email.sendKeys("654259011@webmail.npru.ac.th");

	        WebElement ageInput = driver.findElement(By.id("age"));
	        String ageValue = ageInput.getAttribute("value");
	        
	        System.out.println("อายุ : "+ageValue);
	        
	        if (ageValue.equals(ageValue)) {
	            System.out.println("Age verification successful!");
	        } else {
	            System.out.println("Age verification failed!");
	        }
	       
	        Thread.sleep(5000);

	        driver.quit();
	    }

	   
	}

