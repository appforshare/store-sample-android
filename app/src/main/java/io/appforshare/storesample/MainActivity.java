package io.appforshare.storesample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText(R.string.hello);
        text.setGravity(Gravity.CENTER);
        text.setTextSize(20);
        setContentView(text);
    }
}
