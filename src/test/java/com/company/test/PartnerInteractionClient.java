package com.company.test;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.File;

public class PartnerInteractionClient {

//    JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//
//		factory.getInInterceptors().add(new LoggingInInterceptor());
//		factory.getOutInterceptors().add(new LoggingOutInterceptor());
//		factory.setServiceClass(UploadService.class);
//		factory.setAddress("http://localhost:8090/service/upload");
//    UploadService client = (UploadService) factory.create();
//
//    UploadResponse output = new UploadResponse();
//
//    /* Setting the input values */
//    InputRequest input = new InputRequest();
//		input.setFilePath("/home/hakob/Documents/truckerDocs/Service/Sergey/example");
//		input.setFileType("demo.txt");
//    DataSource source = new FileDataSource(
//            new File("/home/hakob/Documents/truckerDocs/Service/Sergey/example/example.txt"));
//		input.setFile(((new DataHandler(source))));
//
//		try {
//        output = client.upload(input);
//        System.out.println(output.getResponse());
//    } catch (Exception e) {
//
//        System.out.println("EXCEPTION :" + e.getMessage());
//    }
//
//		System.out.println("Done");

}
