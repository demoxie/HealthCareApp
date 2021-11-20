package healthcareapp.model;

import healthcareapp.enums.AccountStatus;
import healthcareapp.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
//@MappedSuperclass
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private String dateOfBirth;
    private String address;
    private String mobilePhone;
    private String officePhone;
    private String email;
    private String password;
    private AccountStatus accountStatus;
    private String dateJoined;
    private boolean isEnabled;
    
    
    
}
