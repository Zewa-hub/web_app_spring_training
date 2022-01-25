package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
    public TodoRepository object ;
    public TodoListController(TodoRepository object)
    {
        this.object = object;
    }
    @PostMapping("/api/todo")
    public void addList(@RequestBody TodoEntity t)
    {
        this.object.save(t);
    }
    @GetMapping("/api/todo")
    public Iterable<TodoEntity> getList()
    {
        return this.object.findAll();
    }
}
