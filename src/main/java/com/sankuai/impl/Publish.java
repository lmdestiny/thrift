package com.sankuai.impl;

import com.sankuai.provide.HelloProvide;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.*;
import sun.applet.Main;

import java.io.IOException;

public class Publish {
    private static int M_THRIFT_PORT = 8980;
    private static HelloProvide.Iface helloProvide = new HelloProvideImpl();
    private static TServer m_server = null;
    private static void createNonblockingServer() throws  TTransportException{
        //创建引擎
        TProcessor processor = new HelloProvide.Processor<HelloProvide.Iface>(helloProvide);
        TNonblockingServerSocket serverSocket = new TNonblockingServerSocket(M_THRIFT_PORT);
        TNonblockingServer.Args args = new TNonblockingServer.Args(serverSocket);
        args.processor(processor);
        args.transportFactory(new TFramedTransport.Factory());//传输层对象
        args.protocolFactory(new TBinaryProtocol.Factory());//通信协议
        m_server = new TNonblockingServer(args);//工作模式
    }
    public static boolean start(){
        try {
            createNonblockingServer();
        } catch (TTransportException e) {
            System.out.println("server start fail....");
            e.printStackTrace();
            return false;
        }
        System.out.println("server start success....");
        m_server.serve();
        return true;
    }
    public static void main(String[] args){
        if(!start()){
            System.exit(0);
        }
    }
}
