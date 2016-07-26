package tomerbu.edu.animationdemos;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void startAnimation(View view) {
        //Load the animation:
        Animator explode = AnimatorInflater.loadAnimator(this, R.animator.explode);

        //Set the target
        explode.setTarget(view);

        //start the animation
        explode.start();
    }
}
