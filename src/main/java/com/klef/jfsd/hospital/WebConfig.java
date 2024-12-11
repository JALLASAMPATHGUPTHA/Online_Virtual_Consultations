package com.klef.jfsd.hospital;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer 
{
    @Override
    public void addCorsMappings(CorsRegistry registry) 
    {
    	registry.addMapping("/**") // Allow CORS 
                .allowedOrigins("https://onlinevirtualconsultations.up.railway.app","https://onlinevirtualconsultations.netlify.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*") // accept all 
                .allowCredentials(true);// cookies 
   
    }
}
