package io.springbootstarter;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@ComponentScan({"springapplication"})
@EntityScan("rentIt.Spring.BO")
@EnableJpaRepositories("io.springbootstarter.topic")
public class CourseStart {
	 @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World1";
	    }
	public static void main(String[] args) {
		SpringApplication.run(CourseStart.class, args);
	}
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/registerUser").allowedOrigins("http://localhost:4200");
                registry.addMapping("/validateLogin").allowedOrigins("http://localhost:4200");
            }

			@Override
			public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			
			@Override
			public void addFormatters(FormatterRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addInterceptors(InterceptorRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addResourceHandlers(ResourceHandlerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addViewControllers(ViewControllerRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureContentNegotiation(ContentNegotiationConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureMessageConverters(List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configurePathMatch(PathMatchConfigurer arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void configureViewResolvers(ViewResolverRegistry arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void extendMessageConverters(List<HttpMessageConverter<?>> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public MessageCodesResolver getMessageCodesResolver() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Validator getValidator() {
				// TODO Auto-generated method stub
				return null;
			}
        };
    }
}
