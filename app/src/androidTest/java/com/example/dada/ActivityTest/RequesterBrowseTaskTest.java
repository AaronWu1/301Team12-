/* RequesterBrowseTaskTest
 *
 * Version 1.0
 *
 * March 15, 2018
 *
 * Copyright (c) 2018 Team 12 CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of licence in this project. Otherwise please contact contact sfeng3@ualberta.ca.
 */

package com.example.dada.ActivityTest;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.example.dada.R;
import com.example.dada.View.RequesterBrowseTaskActivity;
import com.robotium.solo.Solo;
import android.widget.EditText;
import com.example.dada.View.LoginActivity;

public class RequesterBrowseTaskTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public RequesterBrowseTaskTest() {
        super(com.example.dada.View.RequesterBrowseTaskActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    @Override
    public void setUp() throws Exception {
        Log.d("TAG1", "setUp()");
        solo = new Solo(getInstrumentation(), getActivity());
    }

    /**
     * Test for list click
     */
    public void Testrequest() {
        solo.assertCurrentActivity("Wrong Activity", RequesterBrowseTaskActivity.class);
        solo.clickInList(0);
    }


    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}