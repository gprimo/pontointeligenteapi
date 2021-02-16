package com.pontointeligente.api.repositories;

import com.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository< Empresa , Long > {
    Empresa findByCnpj (String cnpj );
}
