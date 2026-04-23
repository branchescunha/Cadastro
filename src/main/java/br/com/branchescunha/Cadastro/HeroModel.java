package br.com.branchescunha.Cadastro;

import jakarta.persistence.*;

// Entity --> Turns a class into a database entity
// JPA --> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class HeroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String email;
    private int age;

    public HeroModel() {
    }

    public HeroModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
