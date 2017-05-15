package com.yo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by yoyo on 15/05/17.
 */
@Configuration
public class MyServiceTestConfig {

        @Bean
        public MyRepository buildRepository() {
//            MyRepository myRepository = new MyRepository();
            MyRepository myRepository = mock(MyRepository.class);
            when(myRepository.getHello(anyString(), (File)anyObject())).thenReturn("Hello AnnotatedMock");
            return myRepository;
        }

        @Bean
        public MyService buildService(MyRepository myRepository) {
            return new MyService(myRepository);
        }
}
