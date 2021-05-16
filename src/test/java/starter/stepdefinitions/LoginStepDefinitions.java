package starter.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.runner.RunWith;
import starter.dashboard.MyAccount;
import starter.dashboard.MyAccountOverview;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has an active account")
    public void prueba_has_an_active_account(String name) throws Throwable {
        this.name=name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() throws Throwable {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                DoLogin.withCredentials("prueba@prueba.com","prueba")
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() throws Throwable {
        //System.out.println("*+++++++ACAAAAAAAAAAAAAAAAAAAAAAAAAAAa****+++"+MyAccount.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("Login success:", MyAccount.value(),equalTo("My account"))
        );
    }
}
