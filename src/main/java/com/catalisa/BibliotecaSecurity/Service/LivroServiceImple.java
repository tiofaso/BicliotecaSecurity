package com.catalisa.BibliotecaSecurity.Service;

import com.catalisa.BibliotecaSecurity.Model.Livro;
import com.catalisa.BibliotecaSecurity.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImple {
    @Autowired
    LivroRepository livroRepository;

    //Método que lista todos os livros
    public List<Livro> getAllLivros () {
            return livroRepository.findAll();
    }

    //Método que lista livros pelo ID
    public Optional<Livro> getLivroById (Long codigo){
            return livroRepository.findById(codigo);
    }

    //Método que cadastra livro
    public Livro cadastrarLivro (Livro livro){
            return livroRepository.save(livro);
    }

    //Método que altera livro
    public Livro alterarLivro (Long codigo, Livro livro){
           Livro livroExistente = livroRepository.findById(codigo).orElse(null);
            if (livroExistente != null) {
                livro.setCodigo(codigo);
                return livroRepository.save(livro);
            }
            return null;
    }

    //Método que deleta livro
    public void deletarLivro (Long codigo){
            livroRepository.deleteById(codigo);
    }
}
