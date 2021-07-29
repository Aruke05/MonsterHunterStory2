package com.enuaruke.mhs2.controller;

import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aruke
 * @date 2021/7/27 14:04
 * @info
 */
@RestController
@RequestMapping("Xyj")
public class XyjController {

    @Autowired
    public RestTemplate restTemplate;

    public String url = "https://bbs.zdfx.net/forum-2-1.html";
    public String cookie = "ThW9_934f_saltkey=sJJ195gX; ThW9_934f_lastvisit=1627285354; " +
            "ThW9_934f_sid=y166Z1; SourcePage=; FirstBrowsePage=https://bbs.zdfx.net/; " +
            "_ga=GA1.2.899338946.1627288936; _gid=GA1.2.346579249.1627288936;" +
            " ThW9_934f_seccodecSy166Z1=21895.e1cbaeddf646f8992d;" +
            " ThW9_934f_ulastactivity=1e5dxvHWfxn/MvVLKeVgLAokN3oPsF+PaCjm6nLIxEAv6/HP0zmu;" +
            " ThW9_934f_auth=4b8dJ64PfHOp/+h7aop/+VnaxLXzILHhzI1SR0/Tu99Qp79qNPw72F6meI2J8/gE2JMneV3a5NHF457o0Xmy80qO6g;" +
            " ThW9_934f_lastcheckfeed=59344|1627289025; ThW9_934f_lip=50.7.253.92,1627288807; ThW9_934f_connect_is_bind=0;" +
            " ThW9_934f_nofavfid=1; ThW9_934f_lastact=1627289168	plugin.php	;" +
            " ThW9_934f_connect_is_bind=0; ThW9_934f_forum_lastvisit=D_2_1627377808;" +
            " ThW9_934f_lastact=1627377808%09forum.php%09forumdisplay;" +
            " ThW9_934f_lastvisit=1627365537; ThW9_934f_lip=50.7.253.92%2C1627377158;" +
            " ThW9_934f_saltkey=nMCHMfK7;" +
            " ThW9_934f_sid=jBQobD; ThW9_934f_st_t=59344%7C1627377808%7C35cf5f49aa7ef3c67f1bbc662dfa4381;" +
            " ThW9_934f_ulastactivity=74b5n%2F2PjG3t7z89vTnk4M2S8fkJsJrbK2%2FTIcojv2HENmdJisqy;" +
            " ThW9_934f_visitedfid=2";


    @RequestMapping("zhongdian")
    public String Zhongdian(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Cookie", cookie )
                .build();
        try {
            Response response = client.newCall(request).execute();
            ResponseBody body1 = response.body();
            return body1.string();
        } catch (IOException e) {
            e.printStackTrace();
            return "404 Not Found";
        }
    }

}
