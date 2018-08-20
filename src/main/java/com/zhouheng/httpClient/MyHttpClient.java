package com.zhouheng.httpClient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author zhouheng
 * @Description: 演示HttpClient
 * @date 2018/8/20
 */
public class MyHttpClient {

    @Test
    public void test() throws IOException {
        // 用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        HttpClient client = new DefaultHttpClient();
        // 这个事用来执行get方法的,可以查看源码
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.print(result);

    }

}
