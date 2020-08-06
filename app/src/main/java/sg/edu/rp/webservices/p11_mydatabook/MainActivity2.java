package sg.edu.rp.webservices.p11_mydatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv = findViewById(R.id.iv);

        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
    }
}