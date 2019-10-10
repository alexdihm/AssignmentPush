package com.example.homeworkassignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    public ConstraintLayout London;
    public ConstraintLayout Sydney;
    public ConstraintLayout NewYork;
    public ConstraintLayout Russia;
    public ConstraintLayout Tokyo;
    public TextView cityOne;
    public TextView cityTwo;
    public TextView cityThree;
    public TextView cityFour;
    public TextView cityFive;
    public ImageView LondonPic;
    public ImageView SydneyPic;
    public ImageView NewYorkPic;
    public ImageView RussiaPic;
    public ImageView TokyoPic;
    public TextView timeOne;
    public TextView timeTwo;
    public TextView timeThree;
    public TextView timeFour;
    public TextView timeFive;
    public Button BtnTwelveHour;
    public Button BtnTwentyFourHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CityOne is London found by the use of findViewById and displayed in the first TextView box
        London = findViewById(R.id.London);
        cityOne = London.findViewById(R.id.City);
        cityOne.setText("London");
        //Display the picture for London in the ImageView box
        LondonPic = London.findViewById(R.id.Pic);
        LondonPic.setImageResource(R.drawable.london);

        //CityTwo is Sydney found by the use of findViewById and displayed in the second TextView box
        Sydney = findViewById(R.id.Sydney);
        cityTwo = Sydney.findViewById(R.id.City);
        cityTwo.setText("Sydney");
        //Display the picture for Sydney in the ImageView
        SydneyPic = Sydney.findViewById(R.id.Pic);
        SydneyPic.setImageResource(R.drawable.sydney);

        //CityThree is New York found by the use of findViewById and displayed in the third TextView box
        NewYork = findViewById(R.id.NewYork);
        cityThree = NewYork.findViewById(R.id.City);
        cityThree.setText("New York");
        //Display the picture for New York in the ImageView
        NewYorkPic = NewYork.findViewById(R.id.Pic);
        NewYorkPic.setImageResource(R.drawable.newyork);

        //CityFour is Moscow found by the use of findViewById and displayed in the fourth TextView box
        Russia = findViewById(R.id.Russia);
        cityFour = Russia.findViewById(R.id.City);
        cityFour.setText("Moscow");
        //Display the picture for Moscow in the ImageView
        RussiaPic = Russia.findViewById(R.id.Pic);
        RussiaPic.setImageResource(R.drawable.russia);

        //CityFive is Tokyo found by the use of findViewById and displayed in the fifth TextView box
        Tokyo = findViewById(R.id.Tokyo);
        cityFive = Tokyo.findViewById(R.id.City);
        cityFive.setText("Tokyo");
        //Display the picture for Tokyo in the ImageView
        TokyoPic = Tokyo.findViewById(R.id.Pic);
        TokyoPic.setImageResource(R.drawable.tokyo);

        twelveHour();

        BtnTwelveHour = findViewById(R.id.twelveHour);
        BtnTwelveHour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                twelveHour();

            }
        });
        BtnTwentyFourHour = findViewById(R.id.twentyfourHour);
        BtnTwentyFourHour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                twentyFourHour();
            }
        });
    }

    public void twelveHour() {

        timeOne = London.findViewById(R.id.Time);
        SimpleDateFormat londonTime = new SimpleDateFormat("h:mm a");
        londonTime.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String london = londonTime.format(new Date());
        timeOne.setText(london);

        timeTwo = Sydney.findViewById(R.id.Time);
        SimpleDateFormat sydneyTime = new SimpleDateFormat("h:mm a");
        sydneyTime.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String sydney = sydneyTime.format(new Date());
        timeTwo.setText(sydney);

        timeThree = NewYork.findViewById(R.id.Time);
        SimpleDateFormat newYorkTime = new SimpleDateFormat("h:mm a");
        newYorkTime.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String newYork = newYorkTime.format(new Date());
        timeThree.setText(newYork);

        timeFour = Russia.findViewById(R.id.Time);
        SimpleDateFormat russiaTime = new SimpleDateFormat("h:mm a");
        russiaTime.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        String moscow = russiaTime.format(new Date());
        timeFour.setText(moscow);

        timeFive = Tokyo.findViewById(R.id.Time);
        SimpleDateFormat tokyoTime = new SimpleDateFormat("h:mm a");
        tokyoTime.setTimeZone(TimeZone.getTimeZone("Japan/Tokyo"));
        String tokyo = tokyoTime.format(new Date());
        timeFive.setText(tokyo);
    }

    public void twentyFourHour() {

        timeOne = London.findViewById(R.id.Time);
        SimpleDateFormat londonTime = new SimpleDateFormat("HH:mm");
        londonTime.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String london = londonTime.format(new Date());
        timeOne.setText(london);

        timeTwo = Sydney.findViewById(R.id.Time);
        SimpleDateFormat sydneyTime = new SimpleDateFormat("HH:mm");
        sydneyTime.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String sydney = sydneyTime.format(new Date());
        timeTwo.setText(sydney);

        timeThree = NewYork.findViewById(R.id.Time);
        SimpleDateFormat newYorkTime = new SimpleDateFormat("HH:mm");
        newYorkTime.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String newYork = newYorkTime.format(new Date());
        timeThree.setText(newYork);

        timeFour = Russia.findViewById(R.id.Time);
        SimpleDateFormat russiaTime = new SimpleDateFormat("HH:mm");
        russiaTime.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        String moscow = russiaTime.format(new Date());
        timeFour.setText(moscow);

        timeFive = Tokyo.findViewById(R.id.Time);
        SimpleDateFormat tokyoTime = new SimpleDateFormat("HH:mm");
        tokyoTime.setTimeZone(TimeZone.getTimeZone("Japan/Tokyo"));
        String tokyo = tokyoTime.format(new Date());
        timeFive.setText(tokyo);

    }
}


