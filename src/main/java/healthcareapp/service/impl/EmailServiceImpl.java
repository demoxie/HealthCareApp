package healthcareapp.service.impl;

import healthcareapp.dto.MailDto;
import healthcareapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender mailSender;
    @Autowired
    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(MailDto mailDto) throws MessagingException {
        MimeMessage message  = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(mailDto.getEmail());
        helper.setSubject(mailDto.getSubject());
        helper.setText(mailDto.getText(), true);
        mailSender.send(message);

    }
}
