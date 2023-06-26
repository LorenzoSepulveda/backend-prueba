package com.portfolio.ls.Service;

import com.portfolio.ls.Entity.Persona;
import com.portfolio.ls.Interface.IPersonaService;
import com.portfolio.ls.Repository.IPersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Transactional
    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Transactional
    @Override
    public void deletePersona(int id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
      Persona persona = ipersonaRepository.findById(id).orElse(null);
      return persona;
    }
    
}
