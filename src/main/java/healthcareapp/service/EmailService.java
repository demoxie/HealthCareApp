package healthcareapp.service;

import healthcareapp.dto.MailDto;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public interface EmailService {
    void sendEmail(MailDto mailDto) throws MessagingException;
}
