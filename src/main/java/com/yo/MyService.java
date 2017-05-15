package com.yo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by yoyo on 15/05/17.
 */
@Service
public class MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void hello(String name) {
        System.out.println(myRepository.getHello(name, new File("notMockedFileName")));
    }
}
