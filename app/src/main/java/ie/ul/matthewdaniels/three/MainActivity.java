package ie.ul.matthewdaniels.three;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create some variables...
        final TextView messageOut = (TextView)findViewById(R.id.message_output);

        Button HelloButton = (Button) findViewById(R.id.HelloButton);
        Button HowYouDoing = (Button) findViewById(R.id.HowYouDoingButton);
        Button WatzUpButton = (Button) findViewById(R.id.WatzUpButton);
        Button SeeYaButton = (Button) findViewById(R.id.SeeYaButton);

        //make the buttons do something...

        HelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageOut.setText("Hello You");
            }
        });
        HowYouDoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageOut.setText("How You Buddy");
            }
        });

        WatzUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageOut.setText("WATZ UPPPPP");
            }
        });

        SeeYaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageOut.setText("Astalavista baby");
            }
        });

    }
}
