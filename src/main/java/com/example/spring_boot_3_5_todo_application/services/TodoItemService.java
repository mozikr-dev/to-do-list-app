package com.example.spring_boot_3_5_todo_application.services;

import com.example.spring_boot_3_5_todo_application.resources.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;
    //commit
}
