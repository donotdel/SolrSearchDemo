package com.zcit.SolrSearchDemo.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置component
 * @author dell
 *
 */
@Configuration
public class WebConfiguration {
	
	@Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }
	
	@Bean
	@SuppressWarnings("unchecked")
	public FilterRegistrationBean testFilterRegister(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
		return registration;
	}
	
	

	public class MyFilter implements Filter{

		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest myrequest  = (HttpServletRequest)request;
			System.out.println("this is my Filter:" + myrequest.getRequestURI());
			chain.doFilter(request, response);
			
		}

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
