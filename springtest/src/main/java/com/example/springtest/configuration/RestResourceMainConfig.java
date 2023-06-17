package com.example.springtest.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.springtest.flows.HelloWebRestService;
import com.example.springtest.flows.ImageWebRestService;

@Component
public class RestResourceMainConfig extends ResourceConfig {
  public RestResourceMainConfig(){
    System.out.println("Registering Rest Configuration");
    register(HelloWebRestService.class);
    register(ImageWebRestService.class);
    register(CORSResponseFilter.class);
  }    
}
