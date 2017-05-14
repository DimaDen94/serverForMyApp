package ru.halturka.app.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dmitry on 14.05.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.halturka.app.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
