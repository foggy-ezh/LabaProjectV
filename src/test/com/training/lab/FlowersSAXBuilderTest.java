package test.com.training.lab;

import com.training.lab.builder.FlowersSAXBuilder;
import org.testng.annotations.Test;


public class FlowersSAXBuilderTest {
    @Test
    public void parsingSAXTest(){
        FlowersSAXBuilder builder = new FlowersSAXBuilder();
        builder.buildListFlowers("data/flowers.xml");
        System.out.println(builder.getFlowers().toString());
    }
}