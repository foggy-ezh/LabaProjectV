package test.com.training.lab;


import com.training.lab.builder.FlowersDOMBuilder;
import org.testng.annotations.Test;

public class FlowersDOMBuilderTest {
    @Test
    public void parsingDOMTest(){
        FlowersDOMBuilder builder = new FlowersDOMBuilder();
        builder.buildListFlowers("data/flowers.xml");
        System.out.println(builder.getFlowers().toString());
    }
}
