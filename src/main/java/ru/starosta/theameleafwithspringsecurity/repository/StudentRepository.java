package ru.starosta.theameleafwithspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.starosta.theameleafwithspringsecurity.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
