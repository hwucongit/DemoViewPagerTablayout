package com.huucong.demoviewpagertablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    private String content;
    private TextView textContent;
    public FirstFragment(String content){
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_first, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        textContent = view.findViewById(R.id.text_content);
        textContent.setText(this.content);
    }
}
