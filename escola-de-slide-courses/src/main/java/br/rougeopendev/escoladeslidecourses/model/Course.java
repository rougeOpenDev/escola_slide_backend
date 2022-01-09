package br.rougeopendev.escoladeslidecourses.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String label;

    @Column(length = 500, nullable = true)
    private String description;

    // tags

    @Column(length = 200, nullable = true)
    private String imgSrc;

    @Column
    private Boolean signed;

    // private Status status;

    // private CourseLeason leasons;
    
}
