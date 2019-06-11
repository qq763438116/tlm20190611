package mvp;

import util.HttpUtil;

public class IModelImpi implements IContract.IModel{

    private HttpUtil util;
    @Override
    public void CallBack() {
        util = new HttpUtil();
    }
}
