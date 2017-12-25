package tictactoe.jc.com.tic_tac_toe;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer mediaPlayer;
    public AudioManager audioManager;
    public ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    public int i = 2;
    public int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "To be Played by 2 players", Toast.LENGTH_SHORT).show();
        i1 = (ImageView)findViewById(R.id.i1);
        i2 = (ImageView)findViewById(R.id.i2);
        i3 = (ImageView)findViewById(R.id.i3);
        i4 = (ImageView)findViewById(R.id.i4);
        i5 = (ImageView)findViewById(R.id.i5);
        i6 = (ImageView)findViewById(R.id.i6);
        i7 = (ImageView)findViewById(R.id.i7);
        i8 = (ImageView)findViewById(R.id.i8);
        i9 = (ImageView)findViewById(R.id.i9);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.drawable.icon);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9932CC")));
        audioManager = (AudioManager)this.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC),0);
    }


    public void turn(View view) {


        String id = view.getResources().getResourceEntryName(view.getId());
        switch (id)
        {
            case "i1":
                if(i%2==0) {

                    i1.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();
                   // delay();
                    c1++;
                    i++;
                }
                else {
                    i1.setImageResource(R.drawable.newcircle);
                    //Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();

                    // delay();
                    c1--;
                    i++;
                }
                check();
                break;
            case "i2":
                if(i%2==0) {

                    i2.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c2++;
                    i++;
                }
                else {
                    i2.setImageResource(R.drawable.newcircle);
                    //Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    // delay();
                    c2--;
                    i++;
                }
                check();
                break;
            case "i3":
                if(i%2==0) {

                    i3.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    // delay();
                    c3++;
                    i++;
                }
                else {
                    i3.setImageResource(R.drawable.newcircle);
                    //Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    // delay();
                    c3--;
                    i++;
                }
                check();
                break;
            case "i4":
                if(i%2==0) {

                    i4.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    // delay();
                    c4++;
                    i++;
                }
                else {
                    i4.setImageResource(R.drawable.newcircle);
                   // Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c4--;
                    i++;
                }
                check();
                break;
            case "i5":
                if(i%2==0) {

                    i5.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c5++;
                    i++;
                }
                else {
                    i5.setImageResource(R.drawable.newcircle);
                    //Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c5--;
                    i++;
                }
                check();
                break;
            case "i6":
                if(i%2==0) {

                    i6.setImageResource(R.drawable.newcross);
                   // Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c6++;
                    i++;
                }
                else {
                    i6.setImageResource(R.drawable.newcircle);
                   // Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c6--;
                    i++;
                }
                check();
                break;
            case "i7":
                if(i%2==0) {

                    i7.setImageResource(R.drawable.newcross);
                   // Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c7++;
                    i++;
                }
                else {
                    i7.setImageResource(R.drawable.newcircle);
                   // Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c7--;
                    i++;
                }
                check();
                break;
            case "i8":
                if(i%2==0) {

                    i8.setImageResource(R.drawable.newcross);
                    //Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c8++;
                    i++;
                }
                else {
                    i8.setImageResource(R.drawable.newcircle);
                   // Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c8--;
                    i++;
                }
                check();
                break;
            case "i9":
                if(i%2==0) {

                    i9.setImageResource(R.drawable.newcross);
                  //  Toast.makeText(this, "Player O's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c9++;
                    i++;
                }
                else {
                    i9.setImageResource(R.drawable.newcircle);
                  //  Toast.makeText(this, "Player X's turn", Toast.LENGTH_SHORT).show();
                    sound();


                    //delay();
                    c9--;
                    i++;
                }
                check();
                break;

        }
    }

    private void check() {


        if(c1==c2&&c2==c3&&c2==1)//r1
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c1==c2&&c2==c3&&c2==-1)//r1
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }
        else if(c4==c5&&c5==c6&&c5==1)//r2
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c4==c5&&c5==c6&&c5==-1)//r2
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        } else if(c7==c8&&c8==c9&&c8==1)//r3
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c7==c8&&c8==c9&&c8==-1)//r3
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c1==c4&&c4==c7&&c4==1)//c1
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c1==c4&&c4==c7&&c4==-1)//c1
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c2==c5&&c5==c8&&c5==1)//c2
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c2==c5&&c5==c8&&c5==-1)//c2
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c3==c6&&c6==c9&&c6==1)//c3
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }else if(c3==c6&&c6==c9&&c6==-1)//c3
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }
        else if(c1==c5&&c5==c9&&c5==1)//d1
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }
        else if(c1==c5&&c5==c9&&c5==-1)//d1
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }
        else if(c3==c5&&c5==c7&&c5==1)//d2
        {
            win();
            Toast.makeText(this, "Player X win", Toast.LENGTH_SHORT).show();
            reset();
        }
        else if(c3==c5&&c5==c7&&c5==-1)//d2
        {
            wino();
            Toast.makeText(this, "Player O win", Toast.LENGTH_SHORT).show();
            reset();
        }




    }
    private void reset()
    {
        i1.setImageResource(R.drawable.blank);
        i2.setImageResource(R.drawable.blank);
        i3.setImageResource(R.drawable.blank);
        i4.setImageResource(R.drawable.blank);
        i5.setImageResource(R.drawable.blank);
        i6.setImageResource(R.drawable.blank);
        i7.setImageResource(R.drawable.blank);
        i8.setImageResource(R.drawable.blank);
        i9.setImageResource(R.drawable.blank);
        c1=0;
        c2=0;
        c3=0;
        c4=0;
        c5=0;
        c6=0;
        c7=0;
        c8=0;
        c9=0;
        i=2;
    }



    public void resetGame(View view) {
        i1.setImageResource(R.drawable.blank);
        i2.setImageResource(R.drawable.blank);
        i3.setImageResource(R.drawable.blank);
        i4.setImageResource(R.drawable.blank);
        i5.setImageResource(R.drawable.blank);
        i6.setImageResource(R.drawable.blank);
        i7.setImageResource(R.drawable.blank);
        i8.setImageResource(R.drawable.blank);
        i9.setImageResource(R.drawable.blank);
        c1=0;
        c2=0;
        c3=0;
        c4=0;
        c5=0;
        c6=0;
        c7=0;
        c8=0;
        c9=0;
        i=2;
        Toast.makeText(this, "Game is Reset ! PlayAgain", Toast.LENGTH_SHORT).show();
    }
    public void sound()
    {
        mediaPlayer = MediaPlayer.create(this,R.raw.click);
        mediaPlayer.start();
    }
    public void win()
    {
        mediaPlayer = MediaPlayer.create(this,R.raw.win);
        mediaPlayer.start();
    }
    public void wino()
    {
        mediaPlayer = MediaPlayer.create(this,R.raw.wino);
        mediaPlayer.start();
    }

}
