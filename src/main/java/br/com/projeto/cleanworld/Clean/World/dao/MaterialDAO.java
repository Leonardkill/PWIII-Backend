package br.com.projeto.cleanworld.Clean.World.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.cleanworld.Clean.World.model.Material;

public interface MaterialDAO extends JpaRepository<Material, Integer> {

}
