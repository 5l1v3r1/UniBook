package com.universitycoventry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


    ImageView mSingIn;

    @Bind(R.id.iv_university)
    ImageView ivUniversity;
    @Bind(R.id.mUniversity)
    LinearLayout mUniversity;
    @Bind(R.id.iv_staff)
    ImageView ivStaff;
    @Bind(R.id.mStaff)
    LinearLayout mStaff;
    @Bind(R.id.iv_student)
    ImageView ivStudent;
    @Bind(R.id.mStudent)
    LinearLayout mStudent;
    @Bind(R.id.email)
    EditText email;
    @Bind(R.id.password)
    EditText password;
    @Bind(R.id.tUniversity)
    TextView tUniversity;
    @Bind(R.id.tStaff)
    TextView tStaff;
    @Bind(R.id.tStudent)
    TextView tStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mSingIn = (ImageView) findViewById(R.id.mSingIn);
        mSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        mUniversity.performClick();

    }

    @OnClick({R.id.mUniversity, R.id.mStaff, R.id.mStudent})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mUniversity:
                setselection(R.id.mUniversity);
                break;
            case R.id.mStaff:
                setselection(R.id.mStaff);
                break;
            case R.id.mStudent:
                setselection(R.id.mStudent);
                break;
        }
    }

    private void setselection(int id) {
        if (id == R.id.mUniversity) {
            mUniversity.setBackground(getResources().getDrawable(R.drawable.white_bg));
            ivUniversity.setImageResource(R.drawable.university_black);
            tUniversity.setTextColor(getResources().getColor(R.color.black));
        } else {
            mUniversity.setBackgroundColor(getResources().getColor(R.color.trans));
            ivUniversity.setImageResource(R.drawable.university_white);
            tUniversity.setTextColor(getResources().getColor(R.color.white));
        }

        if (id == R.id.mStaff) {
            ivStaff.setImageResource(R.drawable.studentscap_black);
            tStaff.setTextColor(getResources().getColor(R.color.black));
            mStaff.setBackground(getResources().getDrawable(R.drawable.white_bg));
        } else {
            mStaff.setBackgroundColor(getResources().getColor(R.color.trans));
            ivStaff.setImageResource(R.drawable.studentscap_white);
            tStaff.setTextColor(getResources().getColor(R.color.white));
        }

        if (id == R.id.mStudent) {
            ivStudent.setImageResource(R.drawable.student_black);
            tStudent.setTextColor(getResources().getColor(R.color.black));
            mStudent.setBackground(getResources().getDrawable(R.drawable.white_bg));
        } else {
            mStudent.setBackgroundColor(getResources().getColor(R.color.trans));
            ivStudent.setImageResource(R.drawable.student_white);
            tStudent.setTextColor(getResources().getColor(R.color.white));
        }

    }

}
