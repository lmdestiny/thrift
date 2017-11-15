package com.sankuai.impl;

import com.sankuai.provide.HelloProvide;
import com.sankuai.provide.Person;
import org.apache.thrift.TException;
import org.springframework.util.StringUtils;

public class HelloProvideImpl implements HelloProvide.Iface {
    @Override
    public String helloString(String param) throws TException {
        System.out.println("helloString init");
        Person  p = new Person();
        p.setName(param);
        System.out.println(p.toString());
        if("lmdestiny".equals(param)) return "lmdestiny,nihao";
        else return "nihao";
    }

    @Override
    public int helloInteger(int param1, long param2) throws TException {
        System.out.println("helloInteger init");
        return param1;
    }

    @Override
    public boolean helloBool(boolean param) throws TException {
        System.out.println("helloBool init");
        return param;
    }

    @Override
    public void sysHello() throws TException {
        System.out.println("sysHello init");

    }
}
