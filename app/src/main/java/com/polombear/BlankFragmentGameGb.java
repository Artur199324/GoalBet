package com.polombear;

import static com.polombear.GB.navController;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BlankFragmentGameGb extends Fragment {

    ImageView uada;
    ConstraintLayout uyada;
    private Handler mHandler = new Handler();
    ImageView qqsq, cczcs;
    TextView vvcvah;
    int a;
    int c =0;
    public static GB gb;
    public static boolean bak = false;

    private List<ImageView> uyda;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank_game_gb, container, false);
        uada = view.findViewById(R.id.imageView);
        cczcs = view.findViewById(R.id.imageViewMenu);
        uyada = view.findViewById(R.id.constrainLayout);
        vvcvah = view.findViewById(R.id.textViewCount);
        uyda = new ArrayList<ImageView>();
        bak = true;
        mHandler.post(runnableCloud);
        mHandler.post(runnableDropsCreation);
        mHandler.post(runnableDropsRun);

        cczcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.blankFragmentMenuGameGB);
            }
        });
        return view;
    }

    private Runnable runnableCloud = new Runnable() {
        @Override
        public void run() {
            float x = uada.getX();
            uada.setX(x - 5);
            a = uada.getWidth();
            if (uada.getX() < 0 - a){
                uada.setX(GB.width + a);
            }

            mHandler.postDelayed(this::run,10);

        }
    };

    private Runnable runnableDropsCreation = new Runnable() {
        @Override
        public void run() {



            qqsq = new ImageView(gb.getApplicationContext());
            Random random = new Random();
            int x = random.nextInt(4);
            switch (x){
                case 1:
                    qqsq.setImageResource(R.drawable.ic_slot_2);
                    break;
                case 2:
                    qqsq.setImageResource(R.drawable.ic_slot_3);
                    break;
                case 3:
                    qqsq.setImageResource(R.drawable.ic_slot_4);
                    break;
            }
            ConstraintLayout.LayoutParams imageViewLayoutParams =
                    new ConstraintLayout.LayoutParams(GB.width/5, GB.width/5);
            qqsq.setLayoutParams(imageViewLayoutParams);
            uyada.addView(qqsq);
            qqsq.setX(uada.getX() + uada.getWidth()/2);
            qqsq.setY(uada.getY() + uada.getHeight());
            uyda.add(qqsq);
            mHandler.postDelayed(this::run,500);
        }
    };

    private Runnable runnableDropsRun = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < uyda.size(); i++){
                ImageView imageView = uyda.get(i);
                imageView.setY(imageView.getY() + 5);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        uyda.remove(imageView);
                        uyada.removeView(imageView);
                        c++;

                        vvcvah.setText(""+c);
                    }
                });
            }

            mHandler.postDelayed(this::run,10);
        }
    };

}