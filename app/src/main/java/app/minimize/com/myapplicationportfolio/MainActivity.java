package app.minimize.com.myapplicationportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setup toolbar
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolBar);
        this.setSupportActionBar(toolBar);
        //init listeners for buttons
        findViewById(R.id.buttonMyApp).setOnClickListener(this);
        findViewById(R.id.buttonXyzReader).setOnClickListener(this);
        findViewById(R.id.buttonBuildItBigger).setOnClickListener(this);
        findViewById(R.id.buttonLibraryApp).setOnClickListener(this);
        findViewById(R.id.buttonScoresApp).setOnClickListener(this);
        findViewById(R.id.buttonSpotifyStreamer).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()){
            case R.id.buttonSpotifyStreamer:
                showToast(getResources().getString(R.string.launch_spotify));
                break;
            case R.id.buttonScoresApp:
                showToast(getResources().getString(R.string.launch_scores));
                break;
            case R.id.buttonLibraryApp:
                showToast(getResources().getString(R.string.launch_library));
                break;
            case R.id.buttonBuildItBigger:
                showToast(getResources().getString(R.string.launch_bigger));
                break;
            case R.id.buttonXyzReader:
                showToast(getResources().getString(R.string.launch_reader));
                break;
            case R.id.buttonMyApp:
                showToast(getResources().getString(R.string.launch_app));
                break;
        }
    }

    private void showToast(final String message) {
        if(mToast!=null)
            mToast.cancel();

        mToast = Toast.makeText(this,message,Toast.LENGTH_SHORT);
        mToast.show();
    }
}
