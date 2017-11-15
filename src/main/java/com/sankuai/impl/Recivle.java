package com.sankuai.impl;

import com.sankuai.provide.HelloProvide;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.*;

public class Recivle {
    private static TTransport socket = new TSocket("127.0.0.1",8980,2000);
    private static TTransport transport = new TFramedTransport(socket);
    private static TProtocol protocol = new TBinaryProtocol(transport);
    private static HelloProvide.Client client = new HelloProvide.Client(protocol);

    public static void main(String... args){
        try {
            socket.open();
            client.helloBool(true);
            client.helloInteger(1,2);
            client.helloString("lmdestiny");
            client.sysHello();
            socket.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
