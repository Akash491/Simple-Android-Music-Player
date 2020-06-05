package music.music.com.akash_music;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {
    Button play,pause,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        play=(Button)findViewById(R.id.play);
        pause=(Button)findViewById(R.id.pause);
        stop=(Button)findViewById(R.id.stop);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.b);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });
    }
}
