package net.vivek.journalApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity(name = "journal_entry")
@Data  //lombok
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @Column(name = "date", columnDefinition = "TIMESTAMP")
    private LocalDateTime date;

}