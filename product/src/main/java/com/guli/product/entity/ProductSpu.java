package com.guli.product.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * product_spu
 *
 * @author
 */
@Data
public class ProductSpu implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * SPU_ID
	 */
	private String spuId;

	/**
	 * 品牌ID
	 */
	private String brandId;

	/**
	 * 分类ID
	 */
	private String categoryId;

	/**
	 * 产品名称
	 */
	private String productName;

	/**
	 * 生效状态: 0-无效; 1-有效;
	 */
	private Byte validStatus;

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
