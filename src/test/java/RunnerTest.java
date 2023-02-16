import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@TEST",
        features = "src/test/resources/features",
        glue = {"StepDefinition"}
)
public class RunnerTest {
}
