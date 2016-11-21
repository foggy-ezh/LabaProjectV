package test.com.training.lab;

import com.training.lab.builder.FlowersStAXBuilder;
import org.testng.annotations.Test;

public class FlowersStAXBuilderTest {
    @Test
    public void parsingStAXTest(){
        FlowersStAXBuilder builder = new FlowersStAXBuilder();
        builder.buildListFlowers("data/flowers.xml");
        System.out.println(builder.getFlowers().toString());
    }
}
