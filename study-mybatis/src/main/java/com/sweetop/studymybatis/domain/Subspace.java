package com.sweetop.studymybatis.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public class Subspace {
    private int storageId;
    private String subSpaceId;
    private List<CenterStorePlan> centerStorePlans;

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    public String getSubSpaceId() {
        return subSpaceId;
    }

    public void setSubSpaceId(String subSpaceId) {
        this.subSpaceId = subSpaceId;
    }

    public List<CenterStorePlan> getCenterStorePlans() {
        return centerStorePlans;
    }

    public void setCenterStorePlans(List<CenterStorePlan> centerStorePlans) {
        this.centerStorePlans = centerStorePlans;
    }

    @Override
    public String toString() {
        return "Subspace [storageId=" + storageId + ",subSpaceId=" + subSpaceId
                + ",centerStorePlans=" + centerStorePlans + "]";
    }
}
