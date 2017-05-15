package com.yo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yoyo on 15/05/17.
 */
@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public void hello(String name) {
        System.out.println(myRepository.getHello(name));
    }
}
