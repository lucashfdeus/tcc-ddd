package com.ms.emailDdd.email.adapters.configuration;


import com.ms.emailDdd.email.EmailApplication;
import com.ms.emailDdd.email.application.ports.EmailRepositoryPort;
import com.ms.emailDdd.email.application.ports.SendEmailServicePort;
import com.ms.emailDdd.email.application.services.EmailServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = EmailApplication.class)
public class BeanConfiguration {

    @Bean
    EmailServiceImpl emailServiceImpl(EmailRepositoryPort repository, SendEmailServicePort sendEmailServicePort) {
        return new EmailServiceImpl(repository, sendEmailServicePort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
