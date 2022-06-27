package br.senai.repository;

import br.senai.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository < Agenda,Long> {

    public Agenda findByNome(String nome);

    public Agenda findById (long id);

}
