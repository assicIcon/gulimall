package com.guli.member.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * level_privilege
 *
 * @author
 */
@Data
public class LevelPrivilege implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 等级ID
	 */
	private String levelId;

	/**
	 * 特权ID
	 */
	private String privilegeId;

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
