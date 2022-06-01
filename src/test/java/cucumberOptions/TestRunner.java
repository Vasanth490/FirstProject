//Run as Junit test

package cucumberOptions;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/Features", //for all tests which are there in feature
	    glue="stepDefinations")
public class TestRunner {

			

}


