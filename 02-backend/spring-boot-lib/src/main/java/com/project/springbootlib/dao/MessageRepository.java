package com.project.springbootlib.dao;

import com.project.springbootlib.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface MessageRepository extends JpaRepository<Message, Long> {

    //endpoint for user
    Page<Message> findByUserEmail(@RequestParam("user_email") String userEmail, Pageable pageable);

    //endpoint for admin, finding messages by all users
    Page<Message> findByClosed(@RequestParam("closed") boolean closed, Pageable pageable);

}
