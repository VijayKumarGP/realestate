package com.vihan.realestate.repository;

import com.vihan.realestate.dto.PlatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatInfoRepository extends JpaRepository<PlatInfo, Long> {

}

