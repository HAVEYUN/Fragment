package zzy.fragment03;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements MenuFragment.MenuItem{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //2、activity中实现接口
    @Override
    public void onSelect(int posiotion) {
        String msg = "";
        if(posiotion==0){
            msg = "Android是一种基于Linux的自由及开放源代码的操作系统，主要使用于移动设备，如智能手机和平板电脑，由Google公司和开放手机联盟领导及开发。";
        }if(posiotion==1){
            msg = "iOS是由苹果公司开发的移动操作系统。苹果公司最早于2007年1月9日的Macworld大会上公布这个系统，" +
                    "最初是设计给iPhone使用的，后来陆续套用到iPod touch、iPad以及Apple TV等产品上";
        }if(posiotion==2){
            msg = "Windows Phone（简称：WP）是微软发布的一款手机操作系统。它将微软旗下的Xbox Live游戏、Xbox Music音乐与独特的视频体验集成至手机中。";
        }

        ContentFragment menuFragment = (ContentFragment) getSupportFragmentManager().findFragmentById(R.id.ftCont);
        menuFragment.ShowMsgContent(msg);

    }
}
