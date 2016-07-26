package tomerbu.edu.animationdemos;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CardFlipActivity extends AppCompatActivity {

    ImageView ivFace;
    ImageView ivBack;
    boolean isShowingBack = true;
    private Animator cardOut;
    private Animator cardIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_flip);
        ivBack = (ImageView) findViewById(R.id.cardBack);
        ivFace = (ImageView) findViewById(R.id.cardFace);

        ivBack.setCameraDistance(10000);
        ivFace.setCameraDistance(10000);

        cardOut = AnimatorInflater.loadAnimator(this, R.animator.card_out);
        cardIn = AnimatorInflater.loadAnimator(this, R.animator.card_in);
    }


    public void flip(View view) {
        if (isShowingBack) {
            cardOut.setTarget(ivBack);
            cardIn.setTarget(ivFace);
        } else {
            cardOut.setTarget(ivFace);
            cardIn.setTarget(ivBack);
        }
        isShowingBack = !isShowingBack;

        cardOut.start();
        cardIn.start();
    }
}
