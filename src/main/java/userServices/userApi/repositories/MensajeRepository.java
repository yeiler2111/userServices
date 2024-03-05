package userServices.userApi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import userServices.userApi.entity.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    
}
