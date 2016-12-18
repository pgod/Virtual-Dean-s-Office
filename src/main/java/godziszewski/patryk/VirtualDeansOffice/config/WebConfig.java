package godziszewski.patryk.VirtualDeansOffice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Patryk on 2016-12-18.
 */
@Configuration
@ComponentScan(basePackages = "godziszewski.patryk.VirtualDeansOffice.web")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
}
