package au.edu.jcu.cp3406.guesstheceleb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager manager = getAssets();
        try {
            String[] names = manager.list("celebs");
            System.out.println(Arrays.toString(names));

            ImageView imageView = findViewById(R.id.image);

            InputStream stream = manager.open("celebs/" + names[0]);
            Bitmap bitmap = BitmapFactory.decodeStream(stream);

            imageView.setImageBitmap(bitmap);
        }catch (IOException e){
            System.out.println("Failed to get names");
        }
    }
}
