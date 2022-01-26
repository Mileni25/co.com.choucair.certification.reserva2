package co.com.choucair.certification.reserva.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reserva.feature",
                 tags = "@Stories",
                 glue = "co.com.choucair.certification.reserva.stepdefinitions",
                 snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}