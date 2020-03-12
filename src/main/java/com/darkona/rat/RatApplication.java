package com.darkona.rat;


import com.darkona.rat.configuration.WebMvcConfig;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Component
@Log4j

public class RatApplication  extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        log.info("****************Starting rats****************");
        return new String[]{"/"};
    }
}
