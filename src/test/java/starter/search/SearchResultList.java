package starter.search;

import org.openqa.selenium.By;

class SearchResultList {
    //static By RESULT_TITLES = By.cssSelector("#product-name"); ////span[contains(text(),'"dress"')]
    static By RESULT_TITLES = By.xpath("//span[contains(text(),'\"dress\"')]");
}
