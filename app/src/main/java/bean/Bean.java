package bean;

import java.util.List;

public class Bean {
    //Bean 包
    public String message;
    public String status;
    public Result result;

    public class Result{
        public Mlss mlss;
        public Pzsh pzsh;
        public Rxxp rxxp;

        public class Mlss{
            public List<commodityList> commodityList;
        }

        public class Pzsh{
            public List<commodityList> commodityList;
        }

        public class Rxxp{
            public List<commodityList> commodityList;
        }

        public class commodityList{
            public String masterPic;
            public String commodityName;
        }

    }
}
