package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.Money;
import com.kaluka.domain.Sign;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface SignService {

        /**
         * 增加用户
         * @param sign
         * @return
         */
        public boolean addSign(Sign sign);
        /**
         * 按id发布签到与签到
         * @param sign
         * @return
         */
        public boolean updateSign(Sign sign);
        /**
         * 按id删除
         * @param uId
         * @return
         */
        public boolean deleteSign(Integer uId);
        /**
         * 查询所有员工
         * @return
         */
        /*public List<Sign> getAllUserSign();*/
        PageInfo<Sign> getAllUserSign(int pageNum);
        /**
         * 按id查找
         * @param uSign
         * @return
         */
        public List<Sign> getSignById(Integer uSign);
        boolean sign();
        boolean Sign(Integer uId);

}
