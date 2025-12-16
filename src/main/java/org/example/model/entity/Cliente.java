package org.example.model.entity;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
//Do Lombok. Os getters e setters são gerados em tempo de compilação,
// Além do toString hashCodeIcones e construtores com e sem parâmetros.
@Data
public class Cliente {
    @Id
    //O BD que se encarrega do auto incremento
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 155)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column
    private LocalDate dataCadastro;
}
