package br.com.branchescunha.Cadastro.Missions;

import br.com.branchescunha.Cadastro.Heroes.HeroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String difficult;
    @OneToMany(mappedBy = "missions") // A mission can have multiple heroes
    private List<HeroModel> heroes;

}
