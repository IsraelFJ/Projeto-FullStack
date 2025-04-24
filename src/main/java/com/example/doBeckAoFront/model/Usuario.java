package com.example.doBeckAoFront.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O compa não pode ser vazio")
    @Email(message = "O email deve ser valido ")
    private String email;

    @NotBlank(message = "O campo senha não pode ser vazio")
    @Size(min = 6, message = "A senha precisa conter 6 digitos")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O compa não pode ser vazio") @Email(message = "O email deve ser valido ") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O compa não pode ser vazio") @Email(message = "O email deve ser valido ") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O campo senha não pode ser vazio") @Size(min = 6, message = "A senha precisa conter 6 digitos") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "O campo senha não pode ser vazio") @Size(min = 6, message = "A senha precisa conter 6 digitos") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
