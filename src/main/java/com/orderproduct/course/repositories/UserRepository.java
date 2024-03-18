package com.orderproduct.course.repositories;

import com.orderproduct.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//não necessita de annotation porque já está herdando de um JPARepository
public interface UserRepository extends JpaRepository<User,Long> {
}
