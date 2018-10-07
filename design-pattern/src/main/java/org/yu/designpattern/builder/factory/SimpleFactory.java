package org.yu.designpattern.builder.factory;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class SimpleFactory {
    public Sender produceSender(String type) {
        if (type.equalsIgnoreCase("XML")) {
            return new XmlSender();
        } else if (type.equalsIgnoreCase("JSON")) {
            return new JsonSender();
        } else {
            throw new RuntimeException("Type not support");
        }
    }
}

interface Sender {
    void send();
}


class JsonSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is a json sender");
    }
}


class XmlSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is a xml sender");
    }
}