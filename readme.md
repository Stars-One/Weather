## 天气APP（名字暂定）
### 界面设计
主界面
查看当前位置，使用百度地图显示当前位置
关于界面，显示开发人员名单
### 功能
**基本功能：**
自动更新天气
打开的每一次都会自动更新定位与天气	
**额外功能：**
桌面的小部件，显示数据
动态更改启动图标显示
定时提醒设置，可以设置指定时间，提醒是否下雨

### 流程图

### 城市id
101300501 桂林
101300101 南宁
101300301 柳州
101300518 桂林雁山
### 实体类

#### 1.当前天气 Weather

|属性说明			|属性名		|类型	|json属性						|json数据			|
|--					|--			|--		|--								|--					|
|城市名				|cityName	|String	|city							|"西安"				|
|天气				|wea		|String	|data[0].wea					|"多云"				|
|天气图标			|weaImg		|icon	| wea_img						| "yun"				|
|温度				|tem		|String	|data[0].tem					|"18℃"				|
|最高温度			|maxTem		|String	|data[0].tem1					|"16℃"				|
|最低温度			|lowTem		|String	|data[0].tem2					|"30℃"				|
|空气质量和污染等级	|airLevel	|String	| data[0].air data[0].air_level	|143 轻度			|
|风速				|winSpeed	|String	|data[0].win[] data[0].win_speed			|"西南风" "东风"	"<3级"				|
|湿度				|humidity			|String		|data[0].humidity				|60					|
|					|			|		|								|					|
#### 2.小时天气 HourWeather

|属性说明	|属性名		|类型	|json属性		|json数据	|
|--			|--			|--		|--				|--			|
|时间			|	time		|String		|	data[0].hour[]			|	"15日08时"		|
|天气			|	web		|String		|	data[0].hour[].wea			|	"阴"		|
|温度			|	tem		|String		|	data[0].hour[].tem			|	"18℃"		|
|天气图标			|	webImg		|	Icon	|	根据天气返回的数据赋值			|			|

#### 3.未来一天 FutrueWeather

|属性说明	|属性名		|类型	|json属性		|json数据	|
|--			|--			|--		|--				|--			|
|时间			|	time		|String		|	data[].day			|"15日（今天）"			|
|天气			|	wea		|	String	|	data[].wea			|	"多云"		|
|天气图标			|weaImg			|	Icon	|	data[].wea_img			|"yun"			|
|最高温度			|maxTem			|	String	|	data[].tem1			|	"16℃"		|
|最低温度			|minTem			|	String	|	data[].tem2			|	"28℃"		|
#### 4.OtherMessage
|属性说明	|属性名		|类型	|json属性		|json数据	|
|--			|--			|--		|--				|--			|
|			|			|		|				|			|

### 示例返回json数据
```

{
  "cityid": "101110101",
  "update_time": "2019-05-15 05:30:00",
  "city": "西安",
  "cityEn": "xian",
  "country": "中国",
  "countryEn": "China",
  "data": [
    {
      "day": "15日（今天）",
      "date": "2019-05-15",
      "week": "星期三",
      "wea": "多云",
      "wea_img": "yun",
      "air": 143,
      "humidity": 60,
      "air_level": "轻度",
      "air_tips": "儿童、老年人及心脏病、呼吸系统疾病患者应尽量减少体力消耗大的户外活动。",
      "alarm": {
        "alarm_type": "",
        "alarm_level": "",
        "alarm_content": ""
      },
      "tem1": "29℃",
      "tem2": "13℃",
      "tem": "18℃",
      "win": [
        "西南风",
        "东风"
      ],
      "win_speed": "<3级",
      "hours": [
        {
          "day": "15日08时",
          "wea": "阴",
          "tem": "18℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "15日11时",
          "wea": "多云",
          "tem": "24℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "15日14时",
          "wea": "多云",
          "tem": "28℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "15日17时",
          "wea": "多云",
          "tem": "29℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "15日20时",
          "wea": "多云",
          "tem": "22℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "15日23时",
          "wea": "多云",
          "tem": "19℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "16日02时",
          "wea": "多云",
          "tem": "16℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "16日05时",
          "wea": "多云",
          "tem": "14℃",
          "win": "东风",
          "win_speed": "<3级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "弱",
          "desc": "辐射较弱，涂擦SPF12-15、PA+护肤品。"
        },
        {
          "title": "减肥指数",
          "level": null,
          "desc": "天气较舒适，减肥正当时。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "血糖易波动，注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "热",
          "desc": "适合穿T恤、短薄外套等夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "中",
          "desc": "易感人群应适当减少室外活动。"
        }
      ]
    },
    {
      "day": "16日（明天）",
      "date": "2019-05-16",
      "week": "星期四",
      "wea": "阴转多云",
      "wea_img": "yun",
      "tem1": "30℃",
      "tem2": "17℃",
      "tem": "19℃",
      "win": [
        "东北风",
        "南风"
      ],
      "win_speed": "3-4级转<3级",
      "hours": [
        {
          "day": "16日08时",
          "wea": "多云",
          "tem": "19℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "16日11时",
          "wea": "阴",
          "tem": "27℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "16日14时",
          "wea": "阴",
          "tem": "29℃",
          "win": "东北风",
          "win_speed": "3-4级"
        },
        {
          "day": "16日17时",
          "wea": "阴",
          "tem": "26℃",
          "win": "东北风",
          "win_speed": "3-4级"
        },
        {
          "day": "16日20时",
          "wea": "阴",
          "tem": "23℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "16日23时",
          "wea": "多云",
          "tem": "21℃",
          "win": "南风",
          "win_speed": "<3级"
        },
        {
          "day": "17日02时",
          "wea": "多云",
          "tem": "19℃",
          "win": "南风",
          "win_speed": "<3级"
        },
        {
          "day": "17日05时",
          "wea": "多云",
          "tem": "17℃",
          "win": "南风",
          "win_speed": "<3级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "弱",
          "desc": "辐射较弱，涂擦SPF12-15、PA+护肤品。"
        },
        {
          "title": "<\/em><em>",
          "level": null,
          "desc": "风有点大，可选择室内运动燃脂。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "血糖易波动，注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "热",
          "desc": "适合穿T恤、短薄外套等夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "良",
          "desc": "气象条件有利于空气污染物扩散。"
        }
      ]
    },
    {
      "day": "17日（后天）",
      "date": "2019-05-17",
      "week": "星期五",
      "wea": "晴转阴",
      "wea_img": "yin",
      "tem1": "32℃",
      "tem2": "18℃",
      "tem": "21℃",
      "win": [
        "东北风",
        "东风"
      ],
      "win_speed": "<3级",
      "hours": [
        {
          "day": "17日08时",
          "wea": "晴",
          "tem": "21℃",
          "win": "南风",
          "win_speed": "<3级"
        },
        {
          "day": "17日11时",
          "wea": "晴",
          "tem": "26℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "17日14时",
          "wea": "晴",
          "tem": "31℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "17日17时",
          "wea": "晴",
          "tem": "31℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "17日20时",
          "wea": "晴",
          "tem": "25℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "17日23时",
          "wea": "晴",
          "tem": "22℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "18日02时",
          "wea": "多云",
          "tem": "23℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "18日05时",
          "wea": "多云",
          "tem": "18℃",
          "win": "东风",
          "win_speed": "<3级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "强",
          "desc": "涂擦SPF大于15、PA+防晒护肤品。"
        },
        {
          "title": "<\/em><em><\/em><em><\/em><em>",
          "level": null,
          "desc": "天气有点热，运动多补水。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "血糖易波动，注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "炎热",
          "desc": "建议穿短衫、短裤等清凉夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "中",
          "desc": "易感人群应适当减少室外活动。"
        }
      ]
    },
    {
      "day": "18日（周六）",
      "date": "2019-05-18",
      "week": "星期六",
      "wea": "小雨",
      "wea_img": "yu",
      "tem1": "35℃",
      "tem2": "13℃",
      "tem": "22℃",
      "win": [
        "西风",
        "西风"
      ],
      "win_speed": "4-5级",
      "hours": [
        {
          "day": "18日08时",
          "wea": "阴",
          "tem": "22℃",
          "win": "东风",
          "win_speed": "<3级"
        },
        {
          "day": "18日14时",
          "wea": "小雨",
          "tem": "34℃",
          "win": "西风",
          "win_speed": "4-5级"
        },
        {
          "day": "18日20时",
          "wea": "小雨",
          "tem": "26℃",
          "win": "西风",
          "win_speed": "3-4级"
        },
        {
          "day": "19日02时",
          "wea": "中雨",
          "tem": "16℃",
          "win": "西风",
          "win_speed": "4-5级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "弱",
          "desc": "辐射较弱，涂擦SPF12-15、PA+护肤品。"
        },
        {
          "title": "<\/em><em><\/em><em><\/em><em>",
          "level": null,
          "desc": "天气闷热，坚持室内低强度运动。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "高温闷热，血糖易波动，注意避免食欲不振。"
        },
        {
          "title": "穿衣指数",
          "level": "炎热",
          "desc": "建议穿短衫、短裤等清凉夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "不宜",
          "desc": "有雨，雨水和泥水会弄脏爱车。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "良",
          "desc": "气象条件有利于空气污染物扩散。"
        }
      ]
    },
    {
      "day": "19日（周日）",
      "date": "2019-05-19",
      "week": "星期日",
      "wea": "多云",
      "wea_img": "yun",
      "tem1": "26℃",
      "tem2": "11℃",
      "tem": "15℃",
      "win": [
        "西风",
        "西南风"
      ],
      "win_speed": "<3级",
      "hours": [
        {
          "day": "19日08时",
          "wea": "小雨",
          "tem": "15℃",
          "win": "西风",
          "win_speed": "4-5级"
        },
        {
          "day": "19日14时",
          "wea": "多云",
          "tem": "25℃",
          "win": "西风",
          "win_speed": "<3级"
        },
        {
          "day": "19日20时",
          "wea": "多云",
          "tem": "19℃",
          "win": "西风",
          "win_speed": "<3级"
        },
        {
          "day": "20日02时",
          "wea": "晴",
          "tem": "14℃",
          "win": "西南风",
          "win_speed": "<3级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "弱",
          "desc": "辐射较弱，涂擦SPF12-15、PA+护肤品。"
        },
        {
          "title": "减肥指数",
          "level": null,
          "desc": "夏天悄然到，肉已无处藏。天气较舒适，快去运动吧。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "气温多变，血糖易波动，请注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "舒适",
          "desc": "建议穿长袖衬衫单裤等服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "中",
          "desc": "易感人群应适当减少室外活动。"
        }
      ]
    },
    {
      "day": "20日（周一）",
      "date": "2019-05-20",
      "week": "星期一",
      "wea": "阴转多云",
      "wea_img": "yun",
      "tem1": "28℃",
      "tem2": "12℃",
      "tem": "17℃",
      "win": [
        "北风",
        "东南风"
      ],
      "win_speed": "<3级",
      "hours": [
        {
          "day": "20日08时",
          "wea": "多云",
          "tem": "17℃",
          "win": "西南风",
          "win_speed": "<3级"
        },
        {
          "day": "20日14时",
          "wea": "晴",
          "tem": "28℃",
          "win": "北风",
          "win_speed": "<3级"
        },
        {
          "day": "20日20时",
          "wea": "阴",
          "tem": "21℃",
          "win": "北风",
          "win_speed": "<3级"
        },
        {
          "day": "21日02时",
          "wea": "多云",
          "tem": "14℃",
          "win": "东南风",
          "win_speed": "<3级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "弱",
          "desc": "辐射较弱，涂擦SPF12-15、PA+护肤品。"
        },
        {
          "title": "<\/em><em>",
          "level": null,
          "desc": "天气较舒适，减肥正当时。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "较易波动",
          "desc": "血糖较易波动，注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "热",
          "desc": "适合穿T恤、短薄外套等夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "较差",
          "desc": "气象条件较不利于空气污染物扩散。。"
        }
      ]
    },
    {
      "day": "21日（周二）",
      "date": "2019-05-21",
      "week": "星期二",
      "wea": "多云",
      "wea_img": "yun",
      "tem1": "31℃",
      "tem2": "11℃",
      "tem": "20℃",
      "win": [
        "东北风",
        "东北风"
      ],
      "win_speed": "3-4级",
      "hours": [
        {
          "day": "21日08时",
          "wea": "多云",
          "tem": "20℃",
          "win": "东南风",
          "win_speed": "<3级"
        },
        {
          "day": "21日14时",
          "wea": "多云",
          "tem": "31℃",
          "win": "东北风",
          "win_speed": "3-4级"
        },
        {
          "day": "21日20时",
          "wea": "晴",
          "tem": "21℃",
          "win": "东北风",
          "win_speed": "<3级"
        },
        {
          "day": "22日02时",
          "wea": "多云",
          "tem": "13℃",
          "win": "东北风",
          "win_speed": "3-4级"
        }
      ],
      "index": [
        {
          "title": "紫外线指数",
          "level": "中等",
          "desc": "涂擦SPF大于15、PA+防晒护肤品。"
        },
        {
          "title": "<\/em><em>",
          "level": null,
          "desc": "风有点大，可选择室内运动燃脂。"
        },
        {
          "title": "健臻·血糖指数",
          "level": "易波动",
          "desc": "血糖易波动，注意监测。"
        },
        {
          "title": "穿衣指数",
          "level": "热",
          "desc": "适合穿T恤、短薄外套等夏季服装。"
        },
        {
          "title": "洗车指数",
          "level": "较适宜",
          "desc": "无雨且风力较小，易保持清洁度。"
        },
        {
          "title": "空气污染扩散指数",
          "level": "良",
          "desc": "气象条件有利于空气污染物扩散。"
        }
      ]
    }
  ]
}

```