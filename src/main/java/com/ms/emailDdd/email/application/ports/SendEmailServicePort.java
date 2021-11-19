package com.ms.emailDdd.email.application.ports;


import com.ms.emailDdd.email.application.domain.Email;


public interface SendEmailServicePort {
    void sendEmailSmtp(Email email);

}
