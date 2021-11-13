package healthcareapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diseaseId;
    private String name;
    @ManyToOne
    private DiseaseCategory category;
    @OneToMany
    private Set<Symptoms> symptoms;

}
