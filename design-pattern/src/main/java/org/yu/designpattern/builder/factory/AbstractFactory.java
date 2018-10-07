package org.yu.designpattern.builder.factory;

/**
 * Created by Rock Yu on 10/7/2018
 **/
public class AbstractFactory {
    public void main(String[] args) {
        SenderFactory factory = new JsonSenderFactory();
        factory.produce().send();
    }
}

interface SenderFactory {
    Sender produce();
}

class JsonSenderFactory implements SenderFactory {

    @Override
    public Sender produce() {
        return new JsonSender();
    }
}


class XMLSenderFactory implements SenderFactory {

    @Override
    public Sender produce() {
        return new XmlSender();
    }
}
