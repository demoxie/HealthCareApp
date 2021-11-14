package healthcareapp.dto;

import lombok.Data;

@Data
public class MailDto {
    private String email;
    private String subject;
    private String text;
}
