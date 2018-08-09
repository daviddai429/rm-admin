package com.gorilla.rm.rmcommon.service.configuration;

import com.gorilla.rm.rmcommon.base.service.BaseService;
import com.gorilla.rm.rmcommon.domain.configuration.Configuration;
import org.springframework.data.domain.Page;

public interface ConfigurationService extends BaseService{

    public Page<Configuration> findPage(Integer page,Integer size);

}
