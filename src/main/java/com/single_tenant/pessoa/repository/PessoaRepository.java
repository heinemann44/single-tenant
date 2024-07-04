package com.single_tenant.pessoa.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.single_tenant.pessoa.entity.PessoaEntity;

public interface PessoaRepository  extends CrudRepository<PessoaEntity, UUID>{

    @Query("FROM PessoaEntity WHERE buscaTermo ILIKE %:term%")
    List<PessoaEntity> findAllPersonByTerm(@Param("term") String term, Pageable pageable);

} 


