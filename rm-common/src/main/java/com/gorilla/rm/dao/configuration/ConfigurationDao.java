package com.gorilla.rm.dao.configuration;

import com.gorilla.rm.domain.configuration.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

public interface ConfigurationDao extends JpaRepository<Configuration, Long>,JpaSpecificationExecutor<Configuration> {
}
