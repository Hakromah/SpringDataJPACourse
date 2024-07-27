package com.telusko.util;

import java.util.UUID;

public class IDGenerated {
    public static String generateId() {
        return UUID.randomUUID().toString().replace("-","").substring(0,10);
    }

}
