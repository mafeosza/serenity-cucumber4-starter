package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By SEARCH_FIELD = By.id("search_query_top");
    public static By SEARCH_BUTTON = By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]");
    public static By RESULT_TITLES = By.xpath("//span[contains(text(),'\"dress\"')]");
}
