package com.guli.product.service.impl;

import com.common.service.impl.ServiceImpl;
import com.guli.product.entity.Attr;
import com.guli.product.mapper.AttrMapper;
import com.guli.product.service.AttrService;
import org.springframework.stereotype.Service;

/**
 * AttrService
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class AttrServiceImpl extends ServiceImpl<Attr> implements AttrService {

	protected AttrServiceImpl(AttrMapper mapper) {
		super(mapper);
	}
}
