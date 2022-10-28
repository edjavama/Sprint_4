package co.com.plaza_negocios.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.plaza_negocios.modelos.ClienteModelo;
@Repository
public interface ClienteRepository extends CrudRepository<ClienteModelo,Integer>{
    
}
