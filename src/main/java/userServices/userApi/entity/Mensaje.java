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
@Table(name = "Mensajes")

public class Mensaje {
    @Id
    private long id;
    private String creador;
    private String destinatario;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;
    private String contenido;
}
