package pl.akademiaspring.ksb2pracadomowa6.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.akademiaspring.ksb2pracadomowa6.service.MailService;

import javax.mail.MessagingException;

@Aspect
@Controller
public class EmailController {

    private MailService mailService;

    @Autowired
    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @After(value = "@annotation(pl.akademiaspring.ksb2pracadomowa6.model.Email)")
    public void send() throws MessagingException {
        mailService.sendMail(
                "adres@odbiorcy.pl",
                "Wiadomość Ze Strony: Baza Filmów",
                "Dodano nowy film", false);
    }

}
