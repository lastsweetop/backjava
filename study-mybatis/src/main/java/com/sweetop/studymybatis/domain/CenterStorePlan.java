package com.sweetop.studymybatis.domain;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午1:57
 * To change this template use File | Settings | File Templates.
 */
public class CenterStorePlan {
    private int id;
    private int storageId;
    private String chanPubId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    public String getChanPubId() {
        return chanPubId;
    }

    public void setChanPubId(String chanPubId) {
        this.chanPubId = chanPubId;
    }

    @Override
    public String toString() {
        return "CenterStorePlan [id="+id+",chanPubId="+chanPubId+"]";
    }
}
