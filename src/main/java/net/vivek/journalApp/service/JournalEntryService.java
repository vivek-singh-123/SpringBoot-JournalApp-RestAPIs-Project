package net.vivek.journalApp.service;

import net.vivek.journalApp.entity.JournalEntry;
import net.vivek.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(Long id){
        return journalEntryRepository.findById(id);
    }

    public void deleteById(Long id){
        journalEntryRepository.deleteById(id);
    }
}

//controller -->service -->repository
