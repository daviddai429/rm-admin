package com.gorilla.rm.service.configuration;

import com.gorilla.rm.base.service.BaseService;
import com.gorilla.rm.domain.configuration.Configuration;
import org.springframework.data.domain.Page;

public interface ConfigurationService extends BaseService {

    public Page<Configuration> findPage(Integer page, Integer size);

}
