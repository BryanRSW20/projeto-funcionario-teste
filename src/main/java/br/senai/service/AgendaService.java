package br.senai.service;

import br.senai.model.Agenda;

import java.util.List;

public interface AgendaService {

    public List< Agenda > findAll();

    public Agenda findByNome (String nome);

    public Agenda findById (Long id);

    public Agenda save(Agenda agenda);
}
