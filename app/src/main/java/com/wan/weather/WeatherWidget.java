package com.wan.weather;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import com.wan.weather.bean.JsonData;
import com.wan.weather.bean.Weather;
import com.wan.weather.bean.WeatherData;
import com.wan.weather.utils.DataUtil;
import com.wan.weather.utils.HttpUtil;

import org.litepal.LitePal;

/**
 * Implementation of App Widget functionality.
 */
public class WeatherWidget extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.weather_widget);

        JsonData jsonData = LitePal.findAll(JsonData.class).get(0);
        WeatherData weatherData = HttpUtil.parseJSONWithGSON(jsonData.getJsonData());
        Weather weather = new DataUtil(weatherData).getWeather();

        views.setTextViewText(R.id.widget_tv_city_name,weather.getCityName());
        views.setTextViewText(R.id.widget_tv_tem,weather.getTem());
        views.setTextViewText(R.id.widget_tv_wea,weather.getWea());
        views.setImageViewResource(R.id.widget_img_wea,weather.getWeaImgId());
        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

