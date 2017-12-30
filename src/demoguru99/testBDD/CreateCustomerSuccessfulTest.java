package demoguru99.testBDD;

import org.jbehave.core.junit.JUnitStories;
import java.util.Arrays;
import java.util.List;

public class CreateCustomerSuccessfulTest extends JUnitStories {

    public CreateCustomerSuccessfulTest(){
        super();
        this.configuredEmbedder().candidateSteps().add(new CreateCustomerSuccessful());
    }

    @Override
    protected List<String> storyPaths(){
        return Arrays.asList("demoguru99/testBDD/create_customer_successful.story");
    }
}
