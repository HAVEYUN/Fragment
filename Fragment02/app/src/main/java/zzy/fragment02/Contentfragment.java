package zzy.fragment02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/3 10:30
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class Contentfragment extends Fragment {
    View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content, null);
        return mView;

    }
}
