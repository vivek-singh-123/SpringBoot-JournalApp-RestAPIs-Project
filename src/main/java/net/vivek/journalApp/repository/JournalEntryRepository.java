package net.vivek.journalApp.repository;

import net.vivek.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
}
