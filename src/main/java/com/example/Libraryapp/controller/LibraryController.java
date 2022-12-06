package com.example.Libraryapp.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/")
    public String Adminlogin(){
        return "Welcome to my Admin login page";
    }
    @PostMapping("/signup")
    public String Adminsignup(){
        return "Welcome to my Admin Signup page";
    }
    @PostMapping("/entry")
    public String Booksentry(){
        return "Welcome to my Books Entry page";
    }
    @PostMapping("/search")
    public String BooksSearch(){
        return "Welcome to my Books Search page";
    }
}
