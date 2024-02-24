package com.dgn.relationonetomany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Table(name = "T_USER")
@Entity(name = "T_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @OneToMany(mappedBy = "user",
            fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<UserDetail> userDetail = new ArrayList<>();
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
