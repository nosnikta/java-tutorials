package com.nklkarthi.cxf.introduction;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String args[]) throws InterruptedException {
        nklkarthiImpl implementor = new nklkarthiImpl();
        String address = "http://localhost:8080/nklkarthi";
        Endpoint.publish(address, implementor);
        System.out.println("Server ready...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}