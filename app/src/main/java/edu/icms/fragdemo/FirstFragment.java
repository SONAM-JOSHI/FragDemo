package edu.icms.fragdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }
    EditText firstNum, secondNum;
    Button submit;
    TextView result ;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        firstNum=view.findViewById(R.id.firstNumber);
        secondNum=view.findViewById(R.id.secondNumber);
        submit=view.findViewById(R.id.btn);
        result=view.findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstValue=firstNum.getText().toString();
                String secondValue=secondNum.getText().toString();

                int first= Integer.parseInt(firstValue);
                int second= Integer.parseInt(secondValue);

                int resultValue = first + second;
                result.setText(resultValue+"");
            }
        });

         return view;
    }
}
//firstcommit