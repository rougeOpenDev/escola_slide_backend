package br.rougeopendev.escoladeslidecourses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.rougeopendev.escoladeslidecourses.model.Course;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long> {
    
}
