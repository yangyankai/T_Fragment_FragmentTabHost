package com.ykai.t_fragment_fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

	// 定义 FragmentTabHost 对象
	private FragmentTabHost mFragmentTabHost;

	// 定义一个布局
	private LayoutInflater mLayoutInflater;

	// 数组来存放 Fragment 界面
	private Class fragmentArray[] = {FragmentPage1.class, FragmentPage2.class, FragmentPage3.class, FragmentPage4.class, FragmentPage5.class};

	// 定义数组来存放按钮图片
	private int mImageViewArray[] = {R.drawable.tab_home_btn, R.drawable.tab_message_btn, R.drawable
			.tab_selfinfo_btn, R.drawable.tab_square_btn, R.drawable.tab_more_btn};

	//Tab 选项卡文字
	private String mTextViewArray[] = {"首页", "消息", "好友", "广场", "更多"};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_tab_layout);
		initView();
	}

	private void initView()
	{
		// 实例化布局对象
		mLayoutInflater = LayoutInflater.from(this);

		//实例化 FragmentTabHost
		mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		//得到 Fragment个数
		int count = fragmentArray.length;
		for (int i = 0; i < count; i++)
		{
			//为每一个 Tab 设置图标/文字/背景
			TabHost.TabSpec tabSpec = mFragmentTabHost.newTabSpec(mTextViewArray[i]).setIndicator(getTabItemView(i));

			//将Tab按钮添加到 Tab 选项卡中
			mFragmentTabHost.addTab(tabSpec, fragmentArray[i], null);
			//设置 Tab 按钮背景
			mFragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);
		}
	}

	/**
	 * 给 Tab 按钮设置图标和文字
	 * @param index
	 * @return
	 */
	private View getTabItemView(int index)
	{
		View      view      = mLayoutInflater.inflate(R.layout.tab_item_view, null);

		//取到 ImageView，并设置 ImageView的图标
		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		imageView.setImageResource(mImageViewArray[index]);

		//取到 TextView， 并设置 TextView的文本
		TextView textView = (TextView) view.findViewById(R.id.textview);
		textView.setText(mTextViewArray[index]);

		return view;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
