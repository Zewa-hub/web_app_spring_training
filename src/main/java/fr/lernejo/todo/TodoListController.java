package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    private ArrayList<Todo> list = new ArrayList<Todo>();
    @PostMapping("/api/todo")
    public void addList(Todo t)
    {
        this.list.add(t);
    }
    @GetMapping("/api/todo")
    public ArrayList<Todo> getList()
    {
        return this.list;
    }
}
