package id.ac.umn.utsmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView textView = (TextView) findViewById(R.id.youtube1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView website1 = (TextView) findViewById(R.id.website1);
        website1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView website2 = (TextView) findViewById(R.id.website2);
        website2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView youtube2 = (TextView) findViewById(R.id.youtube2);
        youtube2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView youtube3 = (TextView) findViewById(R.id.youtube3);
        youtube3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView youtube4 = (TextView) findViewById(R.id.youtube4);
        youtube4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView youtube5 = (TextView) findViewById(R.id.youtube5);
        youtube5.setMovementMethod(LinkMovementMethod.getInstance());

        button = (Button) findViewById(R.id.bckbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMain();
            }
        });
    }

    public void  backToMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}