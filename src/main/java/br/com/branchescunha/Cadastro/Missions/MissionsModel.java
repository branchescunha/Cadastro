package br.com.branchescunha.Cadastro.Missions;

import br.com.branchescunha.Cadastro.Heros.HeroModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificult;
    @OneToMany(mappedBy = "missions") // A mission can have multiple heros
    private List<HeroModel> heros;

}
