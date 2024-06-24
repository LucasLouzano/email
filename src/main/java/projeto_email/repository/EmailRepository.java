package projeto_email.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto_email.model.EmailModel;

import java.util.UUID;
@Repository
public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
