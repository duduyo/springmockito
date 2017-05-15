package com.yo;

import org.springframework.stereotype.Repository;

/**
 * Created by yoyo on 15/05/17.
 */
@Repository
public class MyRepository {

    public String getHello(String name) {
        return "Hello " + name;
    }
}
