package br.senai.service;

import br.senai.model.Projeto;

import java.util.List;

public interface ProjetoService {
    public List< Projeto > findAll();
    public Projeto findByNome (String nome);
    public Projeto findById (Long id);
    public Projeto save(Projeto projeto);
}
