package com.jzy.order.web.controller;

import com.jzy.order.db.tables.pojos.CommentDetailEntity;
import com.jzy.order.db.tables.pojos.CommentEntity;
import com.jzy.order.domain.Page;
import com.jzy.order.service.CommentService;
import com.jzy.order.web.controller.params.CommentQueryParam;
import com.jzy.order.web.controller.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jinziyu
 * @date 2020/4/19 22:07
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/getLatestComment")
    public Page<CommentVO> getLatestComment(@RequestBody CommentQueryParam param) {
        Long count = commentService.getCountByShopId(param.getShopId());
        List<CommentEntity> commentEntityList = commentService.getListByShopId(param.getShopId(), param);
        List<Long> commentIdList = commentEntityList.stream().map(CommentEntity::getId).collect(Collectors.toList());
        List<CommentDetailEntity> commentDetailEntityList = commentService.getDetailListByCommentId(commentIdList);
        List<CommentVO> commentVOList = CommentVO.build(commentEntityList, commentDetailEntityList);
        return new Page<CommentVO>().total(count).page(param.getPageNo()).list(commentVOList);
    }
}
