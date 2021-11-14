package healthcareapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="MedicalPersonnel")
public class MedicalPersonnel extends Person {

    private String title;
    private String qualification;
    private String description;
    private String specialty;
    @ElementCollection
    private List<Double> ratingCount;
    private Double rating = 0.0D;
    private String officeAddress;

}
