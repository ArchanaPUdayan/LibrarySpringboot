package com.example.Libraryapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping("/edit")
    public String BookEdit(){
        return "Welcome to my Book Entry page";
    }
    @PostMapping("/delete")
    public String BookDelete(){
        return "Welcome to my Book Delete page";
    }
    @PostMapping("/issue")
    public String Bookissue(){
        return "Welcome to my Book Issue page";
    }
    @GetMapping("/view")
    public String Booksview(){
        return "Welcome to my Book view page";
    }
}
