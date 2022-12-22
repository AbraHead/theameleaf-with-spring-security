package ru.starosta.theameleafwithspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.starosta.theameleafwithspringsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
