package com.gilbert.invoice.repositories;

import com.gilbert.invoice.models.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepo extends JpaRepository<Tax, Long> {

}
