package userServices.userApi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

@Table(name = "Partidas")

public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deporte;
    private String ciudad;
    private String provincia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaComienzo;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

    // Conexion con usuarios
    @ManyToMany
    @JoinTable(name = "partidas", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "partida_id"))
    private Usuario usuario;

}
