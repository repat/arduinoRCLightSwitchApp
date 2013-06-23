package de.repat.arduinorclightswitch;

import de.repat.lichtsteuerung.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements Requests {

    private final int WDH = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButton1Clicked(View v) {

        boolean on = ((ToggleButton) v).isChecked();

        if (on) {
            loop(LICHT1ON);
        } else {
            loop(LICHT1OFF);
        }
    }

    public void onToggleButton2Clicked(View v) {

        boolean on = ((ToggleButton) v).isChecked();

        if (on) {
            loop(LICHT2ON);
        } else {
            loop(LICHT2OFF);
        }
    }

    public void onToggleButton3Clicked(View v) {

        boolean on = ((ToggleButton) v).isChecked();

        if (on) {
            loop(LICHT3ON);
        } else {
            loop(LICHT3OFF);
        }
    }

    private void loop(String light) {
        for (int i = 0; i < WDH; i++) {
            new Network().execute(light);
        }
    }
}
