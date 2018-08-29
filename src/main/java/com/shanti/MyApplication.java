package com.shanti;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.shanti.service").register(JacksonFeature.class);
    }
}
