package co.com.plaza_negocios.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity

@Table(name="cliente")
public class ClienteModelo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//campo autoincrementado
    private int idcliente;
    private String numident_clie;
    private String nombre_clie;
    private String apellidos_clie;
    private String email_clie;
    private String numtelf_clie;
}
