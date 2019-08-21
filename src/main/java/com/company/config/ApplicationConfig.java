package com.company.config;

import javax.xml.ws.Endpoint;

import de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001_wsdl.PartnerInteraction;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.example.uploadfile.mtom.service.UploadService;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

	@Bean
	public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(),
				"/service/*");
	}
	
	@Bean
	@Primary
	public DispatcherServletPath dispatcherServletPathProvider() {
	    return () -> "";
	}

	@Bean(name=Bus.DEFAULT_BUS_ID)
	public SpringBus springBus(LoggingFeature loggingFeature) {
		
		SpringBus cxfBus = new  SpringBus();
		cxfBus.getFeatures().add(loggingFeature);
		
		return cxfBus;
	}

	@Bean
	public LoggingFeature loggingFeature() {
		
		LoggingFeature loggingFeature = new LoggingFeature();
		loggingFeature.setPrettyLogging(true);
		
		return loggingFeature;
	}

	@Bean
	public Endpoint uplEndpoint(Bus bus, UploadService uploadServiceEndpoint) {

		EndpointImpl endpoint = new EndpointImpl(bus, uploadServiceEndpoint);
		endpoint.publish("/upload");
		
		return endpoint;
	}

	@Bean
	public Endpoint interactEndpoint(Bus bus, PartnerInteraction interactServiceEndpoint) {

		EndpointImpl endpoint = new EndpointImpl(bus, interactServiceEndpoint);
		endpoint.publish("/upload");

		return endpoint;
	}

}