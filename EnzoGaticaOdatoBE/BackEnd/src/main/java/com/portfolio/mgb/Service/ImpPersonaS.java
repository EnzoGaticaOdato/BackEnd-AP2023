package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mgb.Repository.IPersonaRepo;
import java.util.Optional;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaS {

    @Autowired
    IPersonaRepo ipersonaRepository;
    
    public List<Persona> list(){
         return ipersonaRepository.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return ipersonaRepository.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return ipersonaRepository.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         ipersonaRepository.save(persona);
     }
     
     public void delete(int id){
         ipersonaRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return ipersonaRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return ipersonaRepository.existsByNombre(nombre);
     }
}
