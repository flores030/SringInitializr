package com.senaiweb.pessoa.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.pessoa.modelos.PessoaModelo;

@Repository
public interface PessoaRepositorio extends CrudRepository<PessoaModelo,Long>{

   
}