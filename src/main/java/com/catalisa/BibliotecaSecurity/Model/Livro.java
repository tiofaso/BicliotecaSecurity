package com.catalisa.BibliotecaSecurity.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_livro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 50 , nullable = false)
    private String autor;

    @Column(length = 4, nullable = false)
    private String datadeLancamento;

    @Column(length = 14, nullable = false)
    private String isbn;

}
