package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean
    public Foo foo()
    {
       // return new Foo(bar());
        return null;
    }

    @Bean
    public Bar bar()
    {
        //return new Bar();
        return null;
    }
}

//@Configuration
/*public class AppConfig
{
    @Bean
    @Scope("prototype")
    public Foo foo()
    {
        return new Foo();
    }
}*/