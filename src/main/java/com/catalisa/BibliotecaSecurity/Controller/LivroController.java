package com.catalisa.BibliotecaSecurity.Controller;

import com.catalisa.BibliotecaSecurity.Model.Livro;
import com.catalisa.BibliotecaSecurity.Service.LivroServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bibliotecasecurity")
public class LivroController {
    @Autowired
    LivroServiceImple livroServiceImple;

    //Endpoint de consulta (get)
    @GetMapping ///todo testar
    public List<Livro> getAllLivros() {
        return livroServiceImple.getAllLivros();
    }

    //Endpoint de consulta por id (get)
    @GetMapping(path = "/{codigo}")
    public Optional<Livro> getLivroById(@PathVariable Long codigo) {
        return livroServiceImple.getLivroById(codigo);
    }

    //End point de inserção (post)
    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroServiceImple.cadastrarLivro(livro);
    }

    //Endpoint de atualização (put)
    @PutMapping(path = "/{codigo}")
        public Livro alterarLivro (@PathVariable Long codigo, @RequestBody Livro livro){
            return livroServiceImple.alterarLivro(codigo, livro);
    }

    //Endpoint de deleção (delete)
    @DeleteMapping(path ="/{codigo}")
        public void deletarLivro (@PathVariable Long codigo){
        livroServiceImple.deletarLivro(codigo);
    }
}
