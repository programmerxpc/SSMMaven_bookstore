package org.bookstore.po;

/**
 * @author XiaoPengCheng
 * @create 2019-02-01 19:16
 */
public class Catalog {
    private Integer catalogid;

    private String catalogname;

    public Integer getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(Integer catalogid) {
        this.catalogid = catalogid;
    }

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname == null ? null : catalogname.trim();
    }
}
