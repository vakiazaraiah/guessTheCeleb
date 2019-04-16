package au.edu.jcu.cp3406.guesstheceleb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;

public class ImageManager {
    private String assetPath;
    private String[] imageNames;
    private AssetManager assetManager;

    ImageManager(AssetManager assetManager, String assetPath){

        this.assetManager = assetManager;
        this.assetPath = assetPath;


    }

    Bitmap get(int i) {return null;}


}
