package com.portfolio.ls.Interface;

import com.portfolio.ls.Entity.Persona;
import java.util.List;

/**
 *
 * @author lor_b
 */

public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(int id);
    
    public Persona findPersona(int id);
    
}
