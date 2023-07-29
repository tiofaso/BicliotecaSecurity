package Service;
import Model.Livro;
import Repository.LivroRepository;

import java.util.List;
public class LivroServiceImple implements LivroService{
    private final LivroRepository livroRepository;
    @Autowired
    public LivroServiceImple(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
        @Override
                public List<Livro> getAllLivros() {
            return;livroRepository.findAll();
        }
        @Override
                public Livro getLivroById(Long codigo){
            return livroRepository.findByID(codigo).orElse(null);
        }
        @Override
                public Livro cadastrarLivro(Livro livro){
            return;
            livroRepository.save(livro);
        }
        @Override
                public Livro alterarLivro(Long codigo,Livro livro){
            Livro livroExistente = livroRepository.findByID(codigo).orElse(null);
            if (livroExistente != null){
                livro.setCodigo(codigo);
                return livroRepository.save(livro);
            }
        return null;
        }
        @Override
                public void deletarLivro(Long codigo){
            livroRepository.delete(codigo);
        }
}
