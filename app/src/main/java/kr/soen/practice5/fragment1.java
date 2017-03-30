package kr.soen.practice5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by manggi on 2017. 3. 30..
 */

public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragview = inflater.inflate(R.layout.fragment1,container,false);
        //TextView textView = (TextView)fragview.findViewById(R.id.)
        return fragview;
    }
}
