package br.com.branchescunha.Cadastro.Heroes;

import br.com.branchescunha.Cadastro.Missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity --> Turns a class into a database entity
// JPA --> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "age")
    private int age;

    @ManyToOne // A hero has a single mission
    @JoinColumn(name = "missions_id") // FK --> Foreign Key
    private MissionsModel missions;

}
