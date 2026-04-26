package br.com.branchescunha.Cadastro.Heroes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<HeroModel, Long> {
}
