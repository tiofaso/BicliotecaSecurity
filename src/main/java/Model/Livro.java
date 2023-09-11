package Model;

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

    @Column(length = 100)
    private String nome;

    @Column(length = 50)
    private String autor;

    private LocalDate datadeLancamento;

}
