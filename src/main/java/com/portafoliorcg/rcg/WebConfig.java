package com.portafoliorcg.rcg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
/** * Clase que habilita CORS * @author YOProgramo */
public class WebConfig implements WebMvcConfigurer {
         @Override public void addCorsMappings(CorsRegistry registry) {
             registry.addMapping("/**");
             }
     }


