package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT_DAY = "//div[contains(@class, \"_5k_5\")]//select[1]";
    public static final String XPATH_INPUT_MONTH = "//div[contains(@class, \"_5k_5\")]//select[2]";
    public static final String XPATH_INPUT_YEAR = "//div[contains(@class, \"_5k_5\")]//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_INPUT_DAY));
        Select selectDayOption = new Select(selectDay);
        selectDayOption.selectByIndex(21);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_INPUT_MONTH));
        Select selectMonthOption = new Select(selectMonth);
        selectMonthOption.selectByIndex(12);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_INPUT_YEAR));
        Select selectYearOption = new Select(selectYear);
        selectYearOption.selectByIndex(9);
    }
}
