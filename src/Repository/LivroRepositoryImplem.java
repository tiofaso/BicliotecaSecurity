package Repository;
import Model.Livro;

import java.util.*;

@Repository
public class LivroRepositoryImplem implements LivroRepository{
    private final Map<Long, Livro> livros = new HashMap<>();
    private Long nextId = 1L;
    @Override
    public  List<Livro> findAll(){
        return new ArrayList<>(livros.values());
    }
    @Override
    public Optional<Livro> findById(Long codigo) {
        return Optional.ofNullable(livros.get(codigo));
    }

    @Override
    public Livro salvar(Livro livro) {
        if (livro.getCodigo() == null) {
            livro.getCodigo(nextId++);
        }
        livros.put(livro.getCodigo(), livro);
        return livro;
    }
    @Override
    public void  apagar(Long codigo){
        livros.remove(codigo);
        }
    }

