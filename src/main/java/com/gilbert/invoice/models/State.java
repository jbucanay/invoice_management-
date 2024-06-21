package com.gilbert.invoice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Table(name = "state",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = "stateName",
                        name = "state_name_unique"
                )
        }
)
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stateId;
    @Column(nullable = false)
    private String stateName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_code", nullable = false)
    private Tax tax;
}
