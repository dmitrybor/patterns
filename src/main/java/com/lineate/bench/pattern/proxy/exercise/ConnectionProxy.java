package com.lineate.bench.pattern.proxy.exercise;

import java.util.List;

public class ConnectionProxy implements Connection {
    private List<String> blackList;
    private Connection connection;

    public ConnectionProxy(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void connect(String address) throws Exception {
        if (blackList.contains(address)) {
            throw new Exception("Access Denied");
        }
        if (null == connection) {
            connection = new InternetConnection();
        }
        connection.connect(address);
    }
}
