package com.example.wangkuan.celakuangdome_1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private Toolbar tb;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //找这个控件
        nv = (NavigationView) findViewById(R.id.left_drawer);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //设置toolbar
        tb = (Toolbar) findViewById(R.id.a1);
        tb.setNavigationIcon(R.mipmap.ic_launcher);
        tb.setTitle("历史的今天");
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里设置的方向应该跟下面xml文件里面的gravity方向相同，不然会报错,start和LEFT都为从左边出现
                //点击标题栏弹出侧拉框
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        //Navigationview点击事件
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_common:
                        Toast.makeText(MainActivity.this, "点击了第1个菜单", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_menu:
                        Toast.makeText(MainActivity.this, "点击了第2个菜单", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_transform:
                        Toast.makeText(MainActivity.this, "点击了第3个菜单", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_qq:
                        Toast.makeText(MainActivity.this, "点击了第4个菜单", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_weixin:
                        Toast.makeText(MainActivity.this, "点击了第5个菜单", Toast.LENGTH_SHORT).show();
                        break;
                }
                item.setChecked(true);
                //关闭抽屉
                mDrawerLayout.closeDrawer(nv);
                //或者：drawerLayout.closeDrawers();
                return true;
            }
        });

       /* // 动态插入一个Fragment到FrameLayout当中
        Fragment contentFragment = new ContentFragment();
        Bundle args = new Bundle();
        args.putString("text", menuLists.get(i));
        contentFragment.setArguments(args);


        android.support.v4.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.beginTransaction().replace(R.id.content_frame, contentFragment)
                .commit();
        //这个的意思是点击完条目以后，直接隐藏侧拉框
        mDrawerLayout.closeDrawer(mDrawerList);*/
    }
}
