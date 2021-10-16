package com.ninad.imageactions;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    ImageView mimageView;
    Button capButton,expandBtn,rotateBtn,moveBtn;
    Bitmap mphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        mimageView = findViewById(R.id.image_from_camera);
        capButton = findViewById(R.id.take_image_from_camera);
        expandBtn = findViewById(R.id.ExpandBtn);
        moveBtn = findViewById(R.id.MoveBtn);
        rotateBtn = findViewById(R.id.RotateBtn);
        capButton.setOnClickListener(view -> takeImageFromCamera());
        rotateBtn.setOnClickListener(view -> {
            mimageView.setImageBitmap(mphoto);
            Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_rotate);
            mimageView.startAnimation(startRotateAnimation);
        });
        expandBtn.setOnClickListener(view -> {
            mimageView.setImageBitmap(mphoto);
            Animation startExpandAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.img_expand);
            mimageView.startAnimation(startExpandAnimation);
        });
        moveBtn.setOnClickListener(view -> {
            mimageView.setImageBitmap(mphoto);
            Animation startMoveAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_move);
            mimageView.startAnimation(startMoveAnimation);
        });
    }

    public void takeImageFromCamera (){
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }
    protected void onActivityResult ( int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            mphoto = (Bitmap) data.getExtras().get("data");
            mimageView.setImageBitmap(mphoto);
        }
    }
}