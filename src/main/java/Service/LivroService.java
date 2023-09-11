package Service;

import Model.Livro;

import java.util.List;

public interface LivroService {
    List<Livro> getAllLivros();

    Livro getLivroById(Long codigo);

    Livro cadastrarLivro(Livro livro);

    Livro alterarLivro(Long codigo, Livro livro);

    void deletarLivro(Long codigo);
}
