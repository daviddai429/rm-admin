package com.gorilla.rm.service.item.item;

import com.gorilla.rm.dao.item.ItemDao;
import com.gorilla.rm.domain.item.Item;
import com.gorilla.rm.service.item.ItemService;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Search;
import org.elasticsearch.common.lucene.search.function.FiltersFunctionScoreQuery;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    private JestClient jestClient;

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findOneById(Long id) {
        return itemDao.findById(id).get();
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public List<Item> searchItems(String searchContent) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("title",searchContent));
        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex(Item.INDEX_NAME).addType(Item.TYPE).build();
        try {
            JestResult result = jestClient.execute(search);
            return result.getSourceAsObjectList(Item.class);
        } catch (IOException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }



}
