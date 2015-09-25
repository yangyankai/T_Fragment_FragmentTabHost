/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/24 3:34:45
 * Project: T_Fragment_FragmentTabHost
 * File: FragmentPage1.java
 * Class: FragmentPage1
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.ykai.t_fragment_fragmenttabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yangyankai on 2015/9/24.
 */
public class FragmentPage1 extends Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_1,null);
	}
}
