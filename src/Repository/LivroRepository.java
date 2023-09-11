package Repository;

import Model.Livro;

import java.util.List;
import java.util.Optional;

public interface LivroRepository {
    List<Livro> findAll();

    Optional<Livro> findByID(Long codigo);

    Livro save(Livro livro);

    void delete(Long codigo);
}
