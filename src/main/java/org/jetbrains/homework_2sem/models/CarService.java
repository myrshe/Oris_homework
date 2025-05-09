package org.jetbrains.homework_2sem.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class CarService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Long phone;
    private int rating;

    @OneToMany(mappedBy = "carService", cascade = CascadeType.ALL)
    private List<ServiceRecord> serviceRecords;
}
