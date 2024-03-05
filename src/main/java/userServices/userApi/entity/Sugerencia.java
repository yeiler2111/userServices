package userServices.userApi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name = "Sugerencia")
public class Sugerencia {
    @Id
    private Long id;
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime create_at;
}
