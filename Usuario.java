package br.senac.tads.dsw.exercicio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "USUARIOS")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATA_NASCIMENTO")
    private String dataDeNascimento;
}
