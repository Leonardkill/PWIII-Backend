package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Material;

public interface MaterialDAO extends JpaRepository<Material, Long> {

}
