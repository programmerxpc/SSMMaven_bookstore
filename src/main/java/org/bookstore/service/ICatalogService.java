package org.bookstore.service;

import org.bookstore.po.Catalog;

import java.util.List;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:56
 */
public interface ICatalogService {
    /**
     * 获取图书所有分类名
     * @return
     */
    public List<Catalog> findAllCatalogname();
}
