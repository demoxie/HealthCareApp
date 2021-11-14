package healthcareapp.model;

import healthcareapp.enums.OccurrenceFrequency;
import healthcareapp.enums.SymptomDegree;
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
@Table(name ="Symptom")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @ElementCollection
    private List<SymptomDegree> symptomDegrees;
    @ElementCollection
    private List<OccurrenceFrequency> occurrenceFrequencies;
}
