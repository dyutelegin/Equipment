package com.zadanie.module.repos;

import com.zadanie.module.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByEquipment(String equipment);
}
