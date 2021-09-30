package com.ninad.htmldownloader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Utility {
    public static String downloadDataFromUrl(String myurl) throws IOException {
        InputStream is=null;
        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.connect();
            is = conn.getInputStream();
            return readInputStream(is);
        }
        finally {
            if(is!=null)
            {
                is.close();
            }
        }
    }

    public static String readInputStream(InputStream stream) throws IOException {
        int n;
        char[] buffer = new char[1024*4];
        InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
        StringWriter writer = new StringWriter();
        while(-1!=(n=reader.read(buffer)))
            writer.write(buffer,0,n);
        return writer.toString();
    }
}
