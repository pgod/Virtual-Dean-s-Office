package godziszewski.patryk.VirtualDeansOffice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Patryk on 2016-12-18.
 */
@Configuration
public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                RootConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
                WebConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }
}
