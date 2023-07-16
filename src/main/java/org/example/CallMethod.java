package org.example;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class CallMethod {
    public void callMethodGet() throws IOException {
        String method = "http://localhost:8080/03sayhello.jsp?mayname=peyman";
        RequestConfig requestConfig= RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(method);
        CloseableHttpResponse closeableHttpResponse = httpClient.execute(get);

    }
}
