package org.yu.designpattern.builder.factory;

import org.junit.Test;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class StaticFactoryTest {
    @Test
    public void produce() throws Exception {
        StaticFactory.produceJson().send();
        StaticFactory.produceXml().send();
    }
}