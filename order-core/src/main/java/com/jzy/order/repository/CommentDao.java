package com.jzy.order.repository;

import com.jzy.order.db.tables.pojos.CommentDetailEntity;
import com.jzy.order.db.tables.pojos.CommentEntity;
import com.jzy.order.domain.PageQueryParam;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jzy.order.db.Tables.COMMENT;
import static com.jzy.order.db.Tables.COMMENT_DETAIL;


/**
 * @author jinziyu
 * @date 2020/4/20 20:13
 */
@Repository
public class CommentDao {
    @Autowired
    private DSLContext dslContext;

    public Long getCountByShopId(Long shopId) {
        return dslContext.selectCount()
                .from(COMMENT)
                .where(COMMENT.SHOP_ID.eq(shopId))
                .fetchOne()
                .into(Long.class);
    }

    public List<CommentEntity> getListByShopId(Long shopId, PageQueryParam param) {
        return dslContext.select()
                .from(COMMENT)
                .where(COMMENT.SHOP_ID.eq(shopId))
                .orderBy(COMMENT.ID.desc())
                .limit(param.getOffset(), param.getPageSize())
                .fetch()
                .into(CommentEntity.class);
    }

    public List<CommentDetailEntity> getDetailListByCommentId(List<Long> commentIdList) {
        return dslContext.select().from(COMMENT_DETAIL)
                .where(COMMENT_DETAIL.COMMENT_ID.in(commentIdList))
                .fetch()
                .into(CommentDetailEntity.class);
    }

}
