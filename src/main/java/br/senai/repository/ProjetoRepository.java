package br.senai.repository;

import br.senai.model.Funcionario;
import br.senai.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository < Projeto, Long> {

    public Funcionario findByNome(String nome);
    public Funcionario findById (long id);
}
