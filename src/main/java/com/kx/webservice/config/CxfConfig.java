package com.kx.webservice.config;

import com.kx.webservice.services.ILoginService;
import com.kx.webservice.services.impl.LoginServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Bean
    public ServletRegistrationBean dispatcherServlet2() {
        return new ServletRegistrationBean(new CXFServlet(), "/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public ILoginService loginService() {
        return new LoginServiceImpl();
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), loginService());
        endpoint.publish("/loginApi");
        return endpoint;
    }
}
