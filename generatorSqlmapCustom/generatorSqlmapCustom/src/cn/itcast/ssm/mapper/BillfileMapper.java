package cn.itcast.ssm.mapper;

import com.i2f.mbap.model.Billfile;

public interface BillfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(Billfile record);

    int insertSelective(Billfile record);

    Billfile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Billfile record);

    int updateByPrimaryKey(Billfile record);
}