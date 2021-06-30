package com.serpent.stock.mapper;

import com.serpent.stock.beans.RecentMaxWin;
import com.serpent.stock.beans.RecentMaxWinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecentMaxWinMapper {
    long countByExample(RecentMaxWinExample example);

    int deleteByExample(RecentMaxWinExample example);

    int deleteByPrimaryKey(Integer pkRecentWin);

    int insert(RecentMaxWin record);

    int insertSelective(RecentMaxWin record);

    List<RecentMaxWin> selectByExample(RecentMaxWinExample example);

    RecentMaxWin selectByPrimaryKey(Integer pkRecentWin);

    int updateByExampleSelective(@Param("record") RecentMaxWin record, @Param("example") RecentMaxWinExample example);

    int updateByExample(@Param("record") RecentMaxWin record, @Param("example") RecentMaxWinExample example);

    int updateByPrimaryKeySelective(RecentMaxWin record);

    int updateByPrimaryKey(RecentMaxWin record);
}