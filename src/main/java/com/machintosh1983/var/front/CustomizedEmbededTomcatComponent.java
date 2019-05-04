package com.machintosh1983.var.front;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

@Component() 
public class CustomizedEmbededTomcatComponent extends TomcatEmbeddedServletContainerFactory { 
	private final static Logger logger = LoggerFactory.getLogger(CustomizedEmbededTomcatComponent.class); 

	 public EmbeddedServletContainer getEmbeddedServletContainer(ServletContextInitializer... initializers) { 
		  //设置端口 
		  //this.setPort(8081); 
		  return super.getEmbeddedServletContainer(initializers); 
	 } 
	   
	 protected void customizeConnector(Connector connector) { 
		  super.customizeConnector(connector); 
		  Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler(); 
		  //设置最大连接数 
		  logger.info("Embeded container's max connections: "+protocol.getMaxConnections());
		  logger.info("Embeded container's max threads: "+protocol.getMaxThreads());
		  logger.info("Embeded container's connection timeout: "+protocol.getConnectionTimeout());
		  //protocol.setMaxConnections(800); 
		  //设置最大线程数 
		  //protocol.setMaxThreads(250); 
		  //protocol.setConnectionTimeout(30000); 
	 } 
}