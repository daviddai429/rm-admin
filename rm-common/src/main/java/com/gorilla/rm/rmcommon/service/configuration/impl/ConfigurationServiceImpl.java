package com.gorilla.rm.rmcommon.service.configuration.impl;

import com.gorilla.rm.rmcommon.dao.configuration.ConfigurationDao;
import com.gorilla.rm.rmcommon.domain.configuration.Configuration;
import com.gorilla.rm.rmcommon.service.configuration.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationDao configurationDao;

    @Override
    public List findAll() {
        return configurationDao.findAll();
    }

    @Override
    public Object findOneById(Long id) {
        return null;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public Object update(Object o) {
        return null;
    }

    /**
     * 无参数分页查询
     * @param page 页数
     * @param size 每页显示条数
     * @return
     */
    @Override
    public Page<Configuration> findPage(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page,size,Sort.Direction.ASC,"id");
        return configurationDao.findAll(pageable);
    }
}
