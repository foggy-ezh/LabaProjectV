package com.training.lab.builder;

import com.training.lab.entity.Flower;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class FlowersSAXBuilder {
    private static final Logger LOGGER = LogManager.getLogger();
    private List<Flower> flowers;
    private FlowersHandler flowerHandler;
    private XMLReader reader;

    public FlowersSAXBuilder(){
        flowerHandler = new FlowersHandler();
        try{
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(flowerHandler);
        } catch (SAXException e){
            LOGGER.log(Level.FATAL, e);
            throw new RuntimeException();
        }
    }

    public List<Flower> getFlowers(){
        return flowers;
    }

    public void buildListFlowers(String fileName){
        try{
            reader.parse(fileName);
        } catch (SAXException | IOException e){
            LOGGER.log(Level.FATAL, e);
        }
        flowers = flowerHandler.getFlowers();
    }
}
