package healthcareapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prescription {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Case cases;
    private String prescription;
    @OneToMany
    private Set<Drug> drugs;
    private LocalDateTime datePrescribed = LocalDateTime.now(ZoneId.of("Africa/Lagos"));
}
