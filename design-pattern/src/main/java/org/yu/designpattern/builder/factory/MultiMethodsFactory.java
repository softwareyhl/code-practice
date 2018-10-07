package org.yu.designpattern.builder.factory;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class MultiMethodsFactory {
    public Sender produceJson() {
        return new JsonSender();
    }

    public Sender produceXml() {
        return new XmlSender();
    }
}
