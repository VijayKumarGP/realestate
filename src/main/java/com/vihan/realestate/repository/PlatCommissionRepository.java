package com.vihan.realestate.repository;

import com.vihan.realestate.dto.PlatCommissionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatCommissionRepository extends JpaRepository<PlatCommissionDetails, Long> {

}
