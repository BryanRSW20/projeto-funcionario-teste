package br.senai.service;

import br.senai.model.Agenda;
import br.senai.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    AgendaRepository agendaRepository;

    @Override
    public List< Agenda > findAll() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda findByNome(String nome) {
        return null;
    }

    @Override
    public Agenda findById(Long id){
        Agenda agen = agendaRepository.findById(id).get();
        return agen != null ? agen : new Agenda();
    }


    @Override
    public Agenda save(Agenda agenda){
        try {
            return agendaRepository.save(agenda);
        } catch (Exception e){
            throw e;
        }
    }

}
