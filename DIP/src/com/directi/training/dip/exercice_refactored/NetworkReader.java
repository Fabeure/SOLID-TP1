package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements IReader {
    private String url;

    public NetworkReader(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        try (InputStream in = new URL(url).openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        }
        return content.toString();
    }
}