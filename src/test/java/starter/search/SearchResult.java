package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.Collection;

public class SearchResult {
    public static Question<String> titles() {
        return actor -> TextContent.of(SearchForm.RESULT_TITLES).viewedBy(actor).asString().trim();
    }
}
