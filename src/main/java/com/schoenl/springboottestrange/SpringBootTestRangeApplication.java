package com.schoenl.springboottestrange;

import com.schoenl.springboottestrange.note.Note;
import com.schoenl.springboottestrange.note.NoteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootTestRangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestRangeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(NoteService noteService) {
        return args -> {
            Note note = new Note("Title", "Content");
            note = noteService.saveNote(note);
            System.out.println(note);

            note.setTitle("A");
            note = noteService.saveNote(note);
            System.out.println(note);

            note.setTitle("A");
            note = noteService.saveNote(note);
            System.out.println(note);

            note.setTitle("B");
//            note.setVersion(0);
            note = noteService.saveNote(note);
            System.out.println(note);


        };
    }

}
