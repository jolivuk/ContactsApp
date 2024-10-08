package com.demo.contacts.controllers;

import com.demo.contacts.model.RawData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getItemById(@PathVariable("id") String value) {
        String response = String.format("Передано значение: %s", value);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/postItem")
    public ResponseEntity<String> postItemWithValue(@RequestBody RawData data) {
        String response = String.format("postItemWithValue получил данные: %s", data.data);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> postItem(@RequestBody RawData data) {
        String response = String.format("postItem получил данные: %s", data.data);
        return ResponseEntity.ok(response);
    }
}
