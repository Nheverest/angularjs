package com.hst.angularjs.interfaces.rest.server;

public class ServerRepresentation {
    private String ip;

    ServerRepresentation(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return this.ip;
    }
}
