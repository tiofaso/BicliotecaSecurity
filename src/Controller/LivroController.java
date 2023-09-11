package Controller;

import Model.Livro;
import Service.LivroService;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @getMapping
    public List<Livro> getAllLivros() {
        return livroService.getAllLivros();
    }

    @getMapping("codigo")
    public Livro getLivroById(@PathVariable Long codigo) {
        return livroService.getLivroById(codigo);
    }

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroService.cadastrarLivro(livro);

        @PutMapping
        public Livro alterarLivro (@PathVariable Long codigo, @RequestBoby Livro livro){
            return livroService.alterarLivro(codigo, livro);
        }
        @DeleteMapping
        public void deletarLivro (@PathVariable Long codigo){
            livroService.deletarLivro(codigo);
        }
    }
