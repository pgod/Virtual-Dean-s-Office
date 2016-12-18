package godziszewski.patryk.VirtualDeansOffice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Patryk on 2016-12-18.
 */
@Configuration
@ComponentScan(basePackages = {"godziszewski.patryk.VirtualDeansOffice"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
public class RootConfig {
}
