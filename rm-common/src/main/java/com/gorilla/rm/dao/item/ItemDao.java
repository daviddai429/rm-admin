package com.gorilla.rm.dao.item;

import com.gorilla.rm.domain.item.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

public interface ItemDao extends JpaRepository<Item,Long>,JpaSpecificationExecutor<Item> {

}
