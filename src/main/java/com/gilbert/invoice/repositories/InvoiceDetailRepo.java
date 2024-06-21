package com.gilbert.invoice.repositories;

import com.gilbert.invoice.models.InvoiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDetailRepo extends JpaRepository<InvoiceDetail, Long> {
}
