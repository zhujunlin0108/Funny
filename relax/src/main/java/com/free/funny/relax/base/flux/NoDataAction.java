package com.free.funny.relax.base.flux;

/**
 * Created by zhujunlin on 2017/5/26.
 */

public class NoDataAction extends BaseAction {

    @Override
    public <T> T getData() {
        return null;
    }

}
