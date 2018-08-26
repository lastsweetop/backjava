package com.sweetop.studymybatis.mapping;

import com.sweetop.studymybatis.domain.CenterStorePlan;
import com.sweetop.studymybatis.domain.Subspace;
import com.sweetop.studymybatis.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cache.decorators.FifoCache;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
@CacheNamespace(flushInterval = 60000, size = 512, eviction = FifoCache.class, readWrite = false)
public interface SubspaceMapper1 {
    @Select("select * from subspacetbl where storageId=#{storageId}")
    @Results({
            @Result(id = true, column = "storageId", property = "storageId"),
            @Result(column = "subSpaceId", property = "subSpaceId"),
            @Result(column = "storageId", property = "centerStorePlans", many = @Many(
                    select = "com.sweetop.studymybatis.mapping.SubspaceMapper1.getCenterStorePlan", fetchType = FetchType.LAZY
            ))
    })
    public Subspace getById(int id);


    @Select({"select * from centerstoreplantbl where storageId=#{storageId}"})
    public List<CenterStorePlan> getCenterStorePlan();
}
