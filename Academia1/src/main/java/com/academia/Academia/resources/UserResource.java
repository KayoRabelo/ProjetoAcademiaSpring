package com.academia.Academia.resources;

import com.academia.Academia.entities.User;
import com.academia.Academia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 @RequestMapping (value = "/users")
public class UserResource {

    @Autowired
    private UserService service;


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
        public ResponseEntity<User> findById(@PathVariable Long id) {
         User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

@PostMapping
    public ResponseEntity<User> insert (@RequestBody User obj) {
        obj = service.insert(obj);
        return ResponseEntity.status(201).body(obj);
}

@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();

}

@PutMapping (value = "/{id}")
public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
}


}
