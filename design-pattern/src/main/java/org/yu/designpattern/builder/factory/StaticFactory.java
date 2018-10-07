package org.yu.designpattern.builder.factory;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class StaticFactory {
    public static Sender produceJson() {
        return new JsonSender();
    }

    public static Sender produceXml() {
        return new XmlSender();
    }
}
