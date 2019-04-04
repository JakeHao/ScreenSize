package com.jake.screensizeutils;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";
  private View mButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mButton = findViewById(R.id.button);
    mButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        getScreenSize2();
        getScreenSize3();
        getScreenSize4();
        getScreenSize5();
        getScreenSize6();
        getScreenSize7();
      }
    });
  }

  private void getScreenSize7() {
    Display defaultDisplay = getWindowManager().getDefaultDisplay();
    Log.e(TAG, "getScreenSize7->width=" + defaultDisplay.getWidth() + " height="
        + defaultDisplay.getHeight());
  }

  /**
   * 获取的尺寸大小
   *
   * width=1080 height=2029
   */
  private void getScreenSize2() {
    WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    DisplayMetrics displayMetrics = new DisplayMetrics();
    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
    Log.e(TAG, "getScreenSize2->width=" + displayMetrics.widthPixels + " height="
        + displayMetrics.heightPixels);
  }

  /**
   * 获取的尺寸大小
   *
   * width=1080 height=2029
   */
  private void getScreenSize4() {
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    Log.e(TAG, "getScreenSize4->width=" + displayMetrics.widthPixels + " height="
        + displayMetrics.heightPixels);
  }

  /**
   * 获取的尺寸大小
   *
   * width=1080 height=2248
   */
  private void getScreenSize5() {
    WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    Point point = new Point();
    windowManager.getDefaultDisplay().getSize(point);
    Log.e(TAG, "getScreenSize5->width=" + point.x + " height=" + point.y);
  }

  /**
   * 获取的尺寸大小
   *
   * width=1080 height=2029
   */
  private void getScreenSize6() {
    WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    Point point = new Point();
    windowManager.getDefaultDisplay().getRealSize(point);
    Log.e(TAG, "getScreenSize6->width=" + point.x + " height=" + point.y);
  }

  /**
   * 获取的尺寸大小
   *
   * width=1080 height=2248
   */
  private void getScreenSize3() {
    WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    DisplayMetrics displayMetrics = new DisplayMetrics();
    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
    Log.e(TAG, "getScreenSize3->width=" + displayMetrics.widthPixels + " height="
        + displayMetrics.heightPixels);
  }
}
