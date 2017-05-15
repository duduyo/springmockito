package com.yo;

import org.springframework.stereotype.Repository;

import java.io.File;

/**
 * Created by yoyo on 15/05/17.
 */
@Repository
public class MyRepository {

    public String getHello(String name, File file) {
        return "Hello " + file.getName();
    }
}
