package com.jzy.order.web.controller.vo;

import com.jzy.order.db.tables.pojos.CommentDetailEntity;
import com.jzy.order.db.tables.pojos.CommentEntity;
import jodd.bean.BeanCopy;
import lombok.Data;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinziyu
 * @date 2020/4/24 22:21
 */
@Data
public class CommentVO {
    private String userName;
    private Integer allScore;
    private String briefComment;
    private Timestamp ctime;
    private List<CommentDetailVO> detailList;

    public static List<CommentVO> build(List<CommentEntity> commentEntityList, List<CommentDetailEntity> detailEntityList) {
        Map<Long, List<CommentDetailVO>> commentId2DetailVOList = new HashMap<>(16);
        detailEntityList.forEach(detailEntity -> {
            CommentDetailVO detailVO = new CommentDetailVO();
            BeanCopy.from(detailEntity).to(detailVO).copy();
            if (!commentId2DetailVOList.containsKey(detailEntity.getCommentId())) {
                commentId2DetailVOList.put(detailEntity.getCommentId(), new ArrayList<>());
            }
            commentId2DetailVOList.get(detailEntity.getCommentId()).add(detailVO);
        });
        List<CommentVO> res = new ArrayList<>();
        commentEntityList.forEach(entity -> {
            CommentVO commentVO = new CommentVO();
            BeanCopy.from(entity).to(commentVO).copy();
            commentVO.setDetailList(commentId2DetailVOList.get(entity.getId()));
            res.add(commentVO);
        });
        return res;
    }

}
