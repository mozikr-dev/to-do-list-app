package com.example.spring_boot_3_5_todo_application.services;

import com.example.spring_boot_3_5_todo_application.models.TodoItem;
import com.example.spring_boot_3_5_todo_application.resources.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<TodoItem> getAll(){
        return todoItemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }

    public TodoItem save(TodoItem todoItem){
        if(todoItem.getId() == null){
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(todoItem);
    }

    public void delete(TodoItem todoItem){
        todoItemRepository.delete(todoItem);
    }
}
