package br.senai.repository;

import br.senai.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
    public interface FuncionarioRepository extends JpaRepository <Funcionario,Long> {

        public Funcionario findByCpf(String cpf);
        public Funcionario findByNomeAndEmail(String nome, String email);
        public Funcionario findById (long id);
        public List<Funcionario> findByTelefoneLike (String telefone);
}
