package com.guli.pms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_sku_image
 * @author 
 */
@Data
public class ProductSkuImage implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * SKU_ID
     */
    private String skuId;

    /**
     * 图片名称
     */
    private String imageName;

    /**
     * 图片地址
     */
    private String imageUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}