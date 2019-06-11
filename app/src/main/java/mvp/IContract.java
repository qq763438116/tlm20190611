package mvp;

import util.HttpUtil;

public interface IContract {
    interface IView{
        void data(String reslut);
    }

    interface IModel{
        void CallBack();
    }

    interface IPresenter{
        void attach(String reslut);

        void detach();
    }
}
