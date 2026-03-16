package com.aulaback.aula.Aula2.Exercicio2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

// Anotação para indicar que esta classe é um controlador REST
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    // Lista para armazenar os alunos em memória
    private List<Aluno> alunos = new ArrayList<>();

    // Construtor para inicializar a lista com alguns alunos
    public AlunoController(){
        alunos.add(new Aluno(1, "Matheus", "leonematheus@gmail.com"));
        alunos.add(new Aluno(2,"Breno", "brenoalmeida@gmail"));
        alunos.add(new Aluno(3, "Lucas", "yoshidalucas@gmail.com"));
    }

    // GET - listar todos
    @GetMapping
    public List<Aluno> listar(){
        return alunos;
    }

    // GET - buscar por RA
    @GetMapping("/{ra}")
    public Aluno porRa(@PathVariable int ra){
        for (Aluno a : alunos){
            if (a.getRa() == ra){
                return a;
            }
        }
        return null;
    }

    // POST - cadastrar aluno
    @PostMapping
    public String gravarAluno(@RequestBody Aluno aluno){
        // Validações necessárias, como verificar se o nome não é vazio, se o email é válido, etc.
        if(aluno.getNome() == null || aluno.getNome().isEmpty()){
            return "Erro: Nome não pode ser vazio";
        }

        if(aluno.getEmail() == null || !aluno.getEmail().contains("@")){
            return "Erro: Email inválido";
        }

        for(Aluno a : alunos){
            if(a.getRa() == aluno.getRa()){
                return "Erro: RA já cadastrado";
            }
        }

        alunos.add(aluno);
        return "Aluno cadastrado com sucesso";
    }

    // PUT - atualizar aluno
    @PutMapping("/{ra}")
    public String atualizaAluno(@PathVariable int ra, @RequestBody Aluno aluno){

        if(aluno.getNome() == null || aluno.getNome().isEmpty()){
            return "Erro: Nome não pode ser vazio";
        }

        if(aluno.getEmail() == null || !aluno.getEmail().contains("@")){
            return "Erro: Email inválido";
        }

        for (Aluno a : alunos){
            if(a.getRa() == ra){
                a.setNome(aluno.getNome());
                a.setEmail(aluno.getEmail());
                return "Aluno atualizado com sucesso";
            }
        }

        return "Aluno não encontrado";
    }

    // DELETE - excluir aluno
    @DeleteMapping("/{ra}")
    public String excluiAluno(@PathVariable int ra){
        for(Aluno a : alunos){
            if (a.getRa() == ra){
                alunos.remove(a);
                return "Aluno excluído com sucesso!";
            }
        }
        return "Aluno não encontrado!";
    }
}