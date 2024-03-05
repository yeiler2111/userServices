package userServices.userApi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Mensajes")

public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String creador;
    private String destinatario;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;
    private String contenido;
    //conexion con clase padre
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;
}
