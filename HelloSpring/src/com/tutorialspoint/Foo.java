package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Foo
{
    public void init()
    {
        // initialization logic
    }

    public void cleanup()
    {
        // destruction logic
    }
}

//@Configuration
/*public class AppConfig
{
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Foo foo()
    {
        return new Foo();
    }
}
*/