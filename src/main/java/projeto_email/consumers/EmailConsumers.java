package projeto_email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import projeto_email.dto.EmailDTO;
import projeto_email.model.EmailModel;
import projeto_email.service.EmailService;
@Component
public class EmailConsumers {
    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDTO emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        EmailModel emailModel1 = emailService.sendEmail(emailModel);
        System.out.println("Email Status: " + emailModel1.getStatusEmail().toString());
    }
}