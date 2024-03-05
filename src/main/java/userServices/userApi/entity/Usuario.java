package userServices.userApi.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String password;
    private String repPassword;
    private Boolean enabled;
    private String foto;
    private String rol;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;
    //conexionc con sugerencias 1-muchos
    @OneToMany(mappedBy = "usuario")
    private List<Sugerencia> listSugerencias;
    //conexion con mensajes 1-muchos
    @OneToMany(mappedBy = "usuario")
    private List<Mensaje> listMensajes;

    //conexion muchos a muchos
    @ManyToMany(nullable)

}
