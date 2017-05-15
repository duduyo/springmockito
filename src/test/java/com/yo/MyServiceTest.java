package com.yo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by yoyo on 15/05/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration //(classes = MyServiceTestConfig.class)
public class MyServiceTest {


    @Configuration
    static class Config {

        @Bean
        public MyRepository buildRepository() {
            MyRepository myRepository = new MyRepository();
//            MyRepository myRepository = mock(MyRepository.class);
//            when(myRepository.getHello(anyString(), (File)anyObject() )).thenReturn("Hello AnnotatedMock");
            return myRepository;
        }

        @Bean
        public MyService buildService(MyRepository myRepository) {
            return new MyService(myRepository);
        }
    }

    @Autowired
    private MyService myService;

    @Autowired
    private MyRepository myRepository;

    @Before
    public void init() {
//        when(myRepository.getHello(anyString())).thenReturn("Hello MOCK");
    }

    @Test
    public void test() {
        myService.hello("Lionel");
    }
}
