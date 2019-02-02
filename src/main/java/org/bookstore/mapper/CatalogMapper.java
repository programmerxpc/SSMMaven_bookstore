package org.bookstore.mapper;

import org.bookstore.po.Catalog;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:44
 */
public interface CatalogMapper {
    //查找所有图书类名
    public List<Catalog> findAllCatalogname();
}
