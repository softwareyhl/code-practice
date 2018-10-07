package org.yu.designpattern.builder.factory;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class SimpleFactoryTest {
    @org.junit.Test
    public void produceSender() throws Exception {
        new SimpleFactory().produceSender("xml").send();
    }
}