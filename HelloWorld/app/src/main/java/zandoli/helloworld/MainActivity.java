package zandoli.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Look this is the layout file I am linking
        setContentView(R.layout.activity_main);
        String msg = getString(R.string.message);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
