package org.yu.designpattern.builder.factory;

import org.junit.Test;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class MultiMethodsFactoryTest {
    @Test
    public void produce() throws Exception {
        new MultiMethodsFactory().produceJson().send();
        new MultiMethodsFactory().produceXml().send();
    }
}