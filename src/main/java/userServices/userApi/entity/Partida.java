package userServices.userApi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Partidas")

public class Partida {
    @Id
    private Long id;
    private String deporte;
    private String ciudad;
    private String provincia;
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaComienzo;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

}