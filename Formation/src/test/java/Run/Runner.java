package Run;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path de feature cucumber dans son dossier//
		features = { "src/test/features/Exemple/CreationCompteFacebook.feature" },
		// nom de package src test java de notre cas
		glue = { "exemplecucumber" }, plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" }
		// le nom de senarios
		, tags = "@sm"

		, publish = true, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE, monochrome = true)

public class Runner {

}
