package space.sosnovskikh.thirdpractice;

import static space.sosnovskikh.thirdpractice.PathView.myPaint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathView(this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.brush_big:
                myPaint = new Paint();
                PathView.mySize=100;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                Log.e("TAG", Integer.toString(PathView.mySize) );
                break;

            case R.id.brush_medium:
                myPaint = new Paint();
                PathView.mySize=60;
                Log.e("TAG", Integer.toString(PathView.mySize) );
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;

            case R.id.brush_small:
                myPaint = new Paint();
                PathView.mySize=30;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;

            case R.id.color_red:
                myPaint = new Paint();
                PathView.myColor= Color.RED;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;

            case R.id.color_green:
                myPaint = new Paint();
                PathView.myColor= Color.GREEN;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;

            case R.id.color_blue:
                myPaint = new Paint();
                PathView.myColor= Color.BLUE;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;
            case R.id.lastik:
                myPaint = new Paint();
                PathView.myColor= Color.WHITE;
                myPaint.setAntiAlias(true);
                myPaint.setStrokeWidth(PathView.mySize);
                myPaint.setStyle(Paint.Style.STROKE);
                myPaint.setStrokeJoin(Paint.Join.ROUND);
                myPaint.setStrokeCap(Paint.Cap.ROUND);
                myPaint.setColor(PathView.myColor);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}