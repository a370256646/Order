package com.modao.order_api.repository;

import com.modao.order_api.model.VersionInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VersionInfoRepository extends JpaRepository<VersionInfo,String> {
}
