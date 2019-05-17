package com.wan.weather.bean;

import org.litepal.crud.LitePalSupport;

import java.util.List;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 14:09
 * @description
 */
public class WeatherData extends LitePalSupport{
    /**
     * cityid : 101110101
     * update_time : 2019-05-15 05:30:00
     * city : 西安
     * cityEn : xian
     * country : 中国
     * countryEn : China
     * data : [{"day":"15日（今天）","date":"2019-05-15","week":"星期三","wea":"多云","wea_img":"yun","air":143,"humidity":60,"air_level":"轻度","air_tips":"儿童、老年人及心脏病、呼吸系统疾病患者应尽量减少体力消耗大的户外活动。","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"tem1":"29℃","tem2":"13℃","tem":"18℃","win":["西南风","东风"],"win_speed":"<3级","hours":[{"day":"15日08时","wea":"阴","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"15日11时","wea":"多云","tem":"24℃","win":"西南风","win_speed":"<3级"},{"day":"15日14时","wea":"多云","tem":"28℃","win":"西南风","win_speed":"<3级"},{"day":"15日17时","wea":"多云","tem":"29℃","win":"西南风","win_speed":"<3级"},{"day":"15日20时","wea":"多云","tem":"22℃","win":"西南风","win_speed":"<3级"},{"day":"15日23时","wea":"多云","tem":"19℃","win":"东风","win_speed":"<3级"},{"day":"16日02时","wea":"多云","tem":"16℃","win":"东风","win_speed":"<3级"},{"day":"16日05时","wea":"多云","tem":"14℃","win":"东风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"16日（明天）","date":"2019-05-16","week":"星期四","wea":"阴转多云","wea_img":"yun","tem1":"30℃","tem2":"17℃","tem":"19℃","win":["东北风","南风"],"win_speed":"3-4级转<3级","hours":[{"day":"16日08时","wea":"多云","tem":"19℃","win":"东风","win_speed":"<3级"},{"day":"16日11时","wea":"阴","tem":"27℃","win":"东北风","win_speed":"<3级"},{"day":"16日14时","wea":"阴","tem":"29℃","win":"东北风","win_speed":"3-4级"},{"day":"16日17时","wea":"阴","tem":"26℃","win":"东北风","win_speed":"3-4级"},{"day":"16日20时","wea":"阴","tem":"23℃","win":"东北风","win_speed":"<3级"},{"day":"16日23时","wea":"多云","tem":"21℃","win":"南风","win_speed":"<3级"},{"day":"17日02时","wea":"多云","tem":"19℃","win":"南风","win_speed":"<3级"},{"day":"17日05时","wea":"多云","tem":"17℃","win":"南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"<\/em><em>","level":null,"desc":"风有点大，可选择室内运动燃脂。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"17日（后天）","date":"2019-05-17","week":"星期五","wea":"晴转阴","wea_img":"yin","tem1":"32℃","tem2":"18℃","tem":"21℃","win":["东北风","东风"],"win_speed":"<3级","hours":[{"day":"17日08时","wea":"晴","tem":"21℃","win":"南风","win_speed":"<3级"},{"day":"17日11时","wea":"晴","tem":"26℃","win":"东北风","win_speed":"<3级"},{"day":"17日14时","wea":"晴","tem":"31℃","win":"东北风","win_speed":"<3级"},{"day":"17日17时","wea":"晴","tem":"31℃","win":"东北风","win_speed":"<3级"},{"day":"17日20时","wea":"晴","tem":"25℃","win":"东北风","win_speed":"<3级"},{"day":"17日23时","wea":"晴","tem":"22℃","win":"东风","win_speed":"<3级"},{"day":"18日02时","wea":"多云","tem":"23℃","win":"东风","win_speed":"<3级"},{"day":"18日05时","wea":"多云","tem":"18℃","win":"东风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"强","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"18日（周六）","date":"2019-05-18","week":"星期六","wea":"小雨","wea_img":"yu","tem1":"35℃","tem2":"13℃","tem":"22℃","win":["西风","西风"],"win_speed":"4-5级","hours":[{"day":"18日08时","wea":"阴","tem":"22℃","win":"东风","win_speed":"<3级"},{"day":"18日14时","wea":"小雨","tem":"34℃","win":"西风","win_speed":"4-5级"},{"day":"18日20时","wea":"小雨","tem":"26℃","win":"西风","win_speed":"3-4级"},{"day":"19日02时","wea":"中雨","tem":"16℃","win":"西风","win_speed":"4-5级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气闷热，坚持室内低强度运动。"},{"title":"健臻·血糖指数","level":"易波动","desc":"高温闷热，血糖易波动，注意避免食欲不振。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"19日（周日）","date":"2019-05-19","week":"星期日","wea":"多云","wea_img":"yun","tem1":"26℃","tem2":"11℃","tem":"15℃","win":["西风","西南风"],"win_speed":"<3级","hours":[{"day":"19日08时","wea":"小雨","tem":"15℃","win":"西风","win_speed":"4-5级"},{"day":"19日14时","wea":"多云","tem":"25℃","win":"西风","win_speed":"<3级"},{"day":"19日20时","wea":"多云","tem":"19℃","win":"西风","win_speed":"<3级"},{"day":"20日02时","wea":"晴","tem":"14℃","win":"西南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"减肥指数","level":null,"desc":"夏天悄然到，肉已无处藏。天气较舒适，快去运动吧。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温多变，血糖易波动，请注意监测。"},{"title":"穿衣指数","level":"舒适","desc":"建议穿长袖衬衫单裤等服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"20日（周一）","date":"2019-05-20","week":"星期一","wea":"阴转多云","wea_img":"yun","tem1":"28℃","tem2":"12℃","tem":"17℃","win":["北风","东南风"],"win_speed":"<3级","hours":[{"day":"20日08时","wea":"多云","tem":"17℃","win":"西南风","win_speed":"<3级"},{"day":"20日14时","wea":"晴","tem":"28℃","win":"北风","win_speed":"<3级"},{"day":"20日20时","wea":"阴","tem":"21℃","win":"北风","win_speed":"<3级"},{"day":"21日02时","wea":"多云","tem":"14℃","win":"东南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"<\/em><em>","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"较差","desc":"气象条件较不利于空气污染物扩散。。"}]},{"day":"21日（周二）","date":"2019-05-21","week":"星期二","wea":"多云","wea_img":"yun","tem1":"31℃","tem2":"11℃","tem":"20℃","win":["东北风","东北风"],"win_speed":"3-4级","hours":[{"day":"21日08时","wea":"多云","tem":"20℃","win":"东南风","win_speed":"<3级"},{"day":"21日14时","wea":"多云","tem":"31℃","win":"东北风","win_speed":"3-4级"},{"day":"21日20时","wea":"晴","tem":"21℃","win":"东北风","win_speed":"<3级"},{"day":"22日02时","wea":"多云","tem":"13℃","win":"东北风","win_speed":"3-4级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em>","level":null,"desc":"风有点大，可选择室内运动燃脂。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]}]
     */

    private String cityid;
    private String update_time;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private List<DataBean> data;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "cityid='" + cityid + '\'' +
                ", update_time='" + update_time + '\'' +
                ", city='" + city + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", country='" + country + '\'' +
                ", countryEn='" + countryEn + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        /**
         * day : 15日（今天）
         * date : 2019-05-15
         * week : 星期三
         * wea : 多云
         * wea_img : yun
         * air : 143
         * humidity : 60
         * air_level : 轻度
         * air_tips : 儿童、老年人及心脏病、呼吸系统疾病患者应尽量减少体力消耗大的户外活动。
         * alarm : {"alarm_type":"","alarm_level":"","alarm_content":""}
         * tem1 : 29℃
         * tem2 : 13℃
         * tem : 18℃
         * win : ["西南风","东风"]
         * win_speed : <3级
         * hours : [{"day":"15日08时","wea":"阴","tem":"18℃","win":"西南风","win_speed":"<3级"},{"day":"15日11时","wea":"多云","tem":"24℃","win":"西南风","win_speed":"<3级"},{"day":"15日14时","wea":"多云","tem":"28℃","win":"西南风","win_speed":"<3级"},{"day":"15日17时","wea":"多云","tem":"29℃","win":"西南风","win_speed":"<3级"},{"day":"15日20时","wea":"多云","tem":"22℃","win":"西南风","win_speed":"<3级"},{"day":"15日23时","wea":"多云","tem":"19℃","win":"东风","win_speed":"<3级"},{"day":"16日02时","wea":"多云","tem":"16℃","win":"东风","win_speed":"<3级"},{"day":"16日05时","wea":"多云","tem":"14℃","win":"东风","win_speed":"<3级"}]
         * index : [{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"减肥指数","level":null,"desc":"天气较舒适，减肥正当时。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]
         */

        private String day;
        private String date;
        private String week;
        private String wea;
        private String wea_img;
        private int air;
        private int humidity;
        private String air_level;
        private String air_tips;
        private AlarmBean alarm;
        private String tem1;
        private String tem2;
        private String tem;
        private String win_speed;
        private List<String> win;
        private List<HoursBean> hours;
        private List<IndexBean> index;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWea() {
            return wea;
        }

        public void setWea(String wea) {
            this.wea = wea;
        }

        public String getWea_img() {
            return wea_img;
        }

        public void setWea_img(String wea_img) {
            this.wea_img = wea_img;
        }

        public int getAir() {
            return air;
        }

        public void setAir(int air) {
            this.air = air;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public String getAir_level() {
            return air_level;
        }

        public void setAir_level(String air_level) {
            this.air_level = air_level;
        }

        public String getAir_tips() {
            return air_tips;
        }

        public void setAir_tips(String air_tips) {
            this.air_tips = air_tips;
        }

        public AlarmBean getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmBean alarm) {
            this.alarm = alarm;
        }

        public String getTem1() {
            return tem1;
        }

        public void setTem1(String tem1) {
            this.tem1 = tem1;
        }

        public String getTem2() {
            return tem2;
        }

        public void setTem2(String tem2) {
            this.tem2 = tem2;
        }

        public String getTem() {
            return tem;
        }

        public void setTem(String tem) {
            this.tem = tem;
        }

        public String getWin_speed() {
            return win_speed;
        }

        public void setWin_speed(String win_speed) {
            this.win_speed = win_speed;
        }

        public List<String> getWin() {
            return win;
        }

        public void setWin(List<String> win) {
            this.win = win;
        }

        public List<HoursBean> getHours() {
            return hours;
        }

        public void setHours(List<HoursBean> hours) {
            this.hours = hours;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public static class AlarmBean {
            /**
             * alarm_type :
             * alarm_level :
             * alarm_content :
             */

            private String alarm_type;
            private String alarm_level;
            private String alarm_content;

            public String getAlarm_type() {
                return alarm_type;
            }

            public void setAlarm_type(String alarm_type) {
                this.alarm_type = alarm_type;
            }

            public String getAlarm_level() {
                return alarm_level;
            }

            public void setAlarm_level(String alarm_level) {
                this.alarm_level = alarm_level;
            }

            public String getAlarm_content() {
                return alarm_content;
            }

            public void setAlarm_content(String alarm_content) {
                this.alarm_content = alarm_content;
            }
        }

        public static class HoursBean {
            /**
             * day : 15日08时
             * wea : 阴
             * tem : 18℃
             * win : 西南风
             * win_speed : <3级
             */

            private String day;
            private String wea;
            private String tem;
            private String win;
            private String win_speed;

            public String getDay() {
                return day;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public String getWea() {
                return wea;
            }

            public void setWea(String wea) {
                this.wea = wea;
            }

            public String getTem() {
                return tem;
            }

            public void setTem(String tem) {
                this.tem = tem;
            }

            public String getWin() {
                return win;
            }

            public void setWin(String win) {
                this.win = win;
            }

            public String getWin_speed() {
                return win_speed;
            }

            public void setWin_speed(String win_speed) {
                this.win_speed = win_speed;
            }
        }

        public static class IndexBean {
            /**
             * title : 紫外线指数
             * level : 弱
             * desc : 辐射较弱，涂擦SPF12-15、PA+护肤品。
             */

            private String title;
            private String level;
            private String desc;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }
    }
}
