package com.robillo.gesturedetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    TextView mTextView;
    GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text_view);
        mGestureDetector = new GestureDetector(this, this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        mTextView.setText("On Single Tap Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        mTextView.setText("On Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        mTextView.setText("On Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mTextView.setText("On Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        mTextView.setText("On Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        mTextView.setText("On Single Tap Up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        mTextView.setText("On Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        mTextView.setText("On Long Press");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        mTextView.setText("On Fling");
        return true;
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
