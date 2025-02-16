package com.directi.training.dip.exercise;

import java.util.Base64;

public class B64Encoder implements Encoder {
    @Override
    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}