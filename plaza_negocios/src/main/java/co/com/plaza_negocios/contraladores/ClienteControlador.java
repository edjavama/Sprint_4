package co.com.plaza_negocios.contraladores;

import java.security.AccessController;
//import java.lang.StackWalker.Option;
import java.util.Optional;
import java.util.ResourceBundle.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.plaza_negocios.modelos.ClienteModelo;
import co.com.plaza_negocios.repositorios.ClienteRepository;

@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(path = "/cliente")
public class ClienteControlador {
    @Autowired
    ClienteRepository clienteRepositorio;
    
    @CrossOrigin(origins = "*")    
    @GetMapping()
    public Iterable<ClienteModelo> obtenerTodosLosClientes(){
        return clienteRepositorio.findAll();
    }
    //El método Get recibe el id de la base de datos de un usuario
    /**
     * @param id
     * @param clienteRepository TODO
     */
    
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<ClienteModelo> listarUsuariosId(@RequestParam("id") int id){
        return clienteRepositorio.findById(id);
    }
    /**
     * @param cliente
     * @return
     */
    @CrossOrigin(origins = "*")
    @PostMapping()
    public ClienteModelo guardarcliente(@RequestBody ClienteModelo cliente){
        return clienteRepositorio.save(cliente);
    }
    /**
     * @param cliente
     * @return
     */
    @PutMapping()
    public ClienteModelo editarcliente(@RequestBody ClienteModelo cliente){
        return clienteRepositorio.save(cliente);
    }

    /**
     * @param id
     */
    @CrossOrigin(origins = "*")
    @DeleteMapping(path = "/{id}")
    public void eliminarClientePorId(@PathVariable("id")int id){
        clienteRepositorio.deleteById(id);
    }

    public ClienteRepository getClienteRepositorio() {
        return clienteRepositorio;
    }

    public void setClienteRepositorio(ClienteRepository clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

}
