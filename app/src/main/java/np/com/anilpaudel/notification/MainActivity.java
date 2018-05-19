package np.com.anilpaudel.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button openActivityBtn,openBigCOntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivityBtn=(Button) findViewById(R.id.btnNotificationActivity);
        openBigCOntent=(Button) findViewById(R.id.bigContent);

        openActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.openActivityNotification(getApplicationContext());

            }
        });

    }
}
