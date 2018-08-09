package com.gorilla.rm.rmcommon.dao.configuration;

import com.gorilla.rm.rmcommon.base.dao.BaseDao;
import com.gorilla.rm.rmcommon.domain.configuration.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationDao extends JpaRepository<Configuration, String>,JpaSpecificationExecutor<Configuration> {
}
