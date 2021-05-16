package starter.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MyAccount {

    public static Question<String> value(){
        return actor -> TextContent.of(MyAccountOverview.MY_ACCOUNT).viewedBy(actor).asString().trim();
    }
}
