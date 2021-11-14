package healthcareapp.model;

import healthcareapp.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name ="Person")
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
    
    
    
}
