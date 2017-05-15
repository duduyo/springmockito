package com.yo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by yoyo on 15/05/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext-test.xml")
public class MyServiceTest {

@Autowired
private MyService myService;

@Autowired
private MyRepository myRepository;

    @Before
    public void init(){
        when(myRepository.getHello(anyString())).thenReturn("Hello MOCK");
    }

    @Test
    public void test() {
        myService.hello("Lionel");


    }
}
