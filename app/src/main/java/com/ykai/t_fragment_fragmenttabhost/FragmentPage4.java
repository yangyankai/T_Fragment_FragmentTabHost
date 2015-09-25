/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/24 3:36:35
 * Project: T_Fragment_FragmentTabHost
 * File: FragmentPage4.java
 * Class: FragmentPage4
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

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

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yangyankai on 2015/9/24.
 */
public class FragmentPage4 extends Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_4,null);
	}
}
