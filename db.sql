CREATE SCHEMA IF NOT EXISTS email DEFAULT CHARACTER SET utf8;
USE email;

USE projetoemail;
CREATE TABLE email (
    emailId CHAR(36) PRIMARY KEY,
    ownerRef VARCHAR(255),
    emailFrom VARCHAR(255),
    emailTo VARCHAR(255),
    subject VARCHAR(255),
    text TEXT,
    sendDateEmail LocalDateTime,
    statusEmail VARCHAR(50)
);
