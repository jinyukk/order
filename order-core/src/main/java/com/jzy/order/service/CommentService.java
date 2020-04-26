package com.jzy.order.service;

import com.jzy.order.db.tables.pojos.CommentDetailEntity;
import com.jzy.order.db.tables.pojos.CommentEntity;
import com.jzy.order.domain.PageQueryParam;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/20 20:49
 */
public interface CommentService {
    Long getCountByShopId(Long shopId);

    List<CommentEntity> getListByShopId(Long shopId, PageQueryParam param);

    List<CommentDetailEntity> getDetailListByCommentId(List<Long> commentIdList);

}
