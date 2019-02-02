package org.bookstore.service.impl;

import org.bookstore.mapper.CatalogMapper;
import org.bookstore.po.Catalog;
import org.bookstore.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 20:12
 */
@Service
public class ICatalogServiceImpl implements ICatalogService {

    @Autowired
    private CatalogMapper catalogMapper;

    @Override
    public List<Catalog> findAllCatalogname() {
        return catalogMapper.findAllCatalogname();
    }
}
