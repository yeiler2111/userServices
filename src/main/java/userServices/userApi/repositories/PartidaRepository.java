package userServices.userApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import userServices.userApi.entity.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long> {

}
