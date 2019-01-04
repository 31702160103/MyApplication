package com.example.administrator.myapplication;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络访问的封装类，
 */

public class UtilsOk {
    private static final String URL = "http://123.207.85.214/chat/member.php";
    public static void GetData(Callback callback){
        OkHttpClient client = new OkHttpClient();   //第一步：创建okhttp对象
        Request build = new Request.Builder()      // 第二部： 请求request方式，添加网址，build建立
                .url(URL)
                .build();
        client.newCall(build).enqueue(callback);    //enqueue,加入访问队列
    }
}
