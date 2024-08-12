package projeto_email.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import projeto_email.dto.EmailDTO;
@Service
public class EmailProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.queue}")
    private String queue;

    public void sendToQueue(EmailDTO emailDTO) {
        rabbitTemplate.convertAndSend(queue, emailDTO);
    }
}

