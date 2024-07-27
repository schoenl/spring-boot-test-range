package com.schoenl.springboottestrange.note;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "note_generator")
    @SequenceGenerator(name = "note_generator", sequenceName = "note_id_seq")
    private Integer id;

    @Column
    @Version
    private Integer version;

    @Column
    private String title;

    @Column
    private String content;

    protected Note() {}

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", version=" + version +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
