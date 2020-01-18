package com.ToDoListApp.ToDoListApp.historico.repository;

import com.ToDoListApp.ToDoListApp.historico.Historico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long> {
}
