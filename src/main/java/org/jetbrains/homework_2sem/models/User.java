package org.jetbrains.homework_2sem.models;




import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String email;
    private Long phone;
    private String confirmed;
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Car> cars;
}
