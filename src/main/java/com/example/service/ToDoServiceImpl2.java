package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;

@Service("toDoServiceImpl2")
public class ToDoServiceImpl2 implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> getAllToDo() {
        return new ArrayList<>();
    }

    @Override
    public ToDo getToDoById(long id) {
        Optional<ToDo> obj= toDoRepository.findById(id);
        return obj.get();
    }

    @Override
    public ToDo saveToDo(ToDo todo) {
        return toDoRepository.save(todo);
    }

    @Override
    public void removeToDo(ToDo todo) {
        toDoRepository.delete(todo);
    }


}