package br.senai.service;

import br.senai.model.Funcionario;
import br.senai.model.Projeto;
import br.senai.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServiceImpl implements ProjetoService{

    @Autowired
    ProjetoRepository projetoRepository;

    @Override
    public List< Projeto > findAll(){
        return projetoRepository.findAll();
    }

    @Override
    public Projeto findByNome(String nome) {
        return null;
    }

    @Override
    public Projeto findById(Long id){
        Projeto proj = projetoRepository.findById(id).get();
        return proj != null ? proj : new Projeto();
    }

    @Override
    public Projeto save(Projeto projeto){
        try {
            return projetoRepository.save(projeto);
        }catch (Exception e){
            throw e;
        }
    }
}

