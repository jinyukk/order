package com.jzy.order.service.impl;

import com.jzy.order.db.tables.pojos.CommentDetailEntity;
import com.jzy.order.db.tables.pojos.CommentEntity;
import com.jzy.order.domain.PageQueryParam;
import com.jzy.order.repository.CommentDao;
import com.jzy.order.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinziyu
 * @date 2020/4/20 20:49
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public Long getCountByShopId(Long shopId) {
        return commentDao.getCountByShopId(shopId);
    }

    @Override
    public List<CommentEntity> getListByShopId(Long shopId, PageQueryParam param) {
        return commentDao.getListByShopId(shopId, param);
    }

    @Override
    public List<CommentDetailEntity> getDetailListByCommentId(List<Long> commentIdList) {
        return commentDao.getDetailListByCommentId(commentIdList);
    }
}
