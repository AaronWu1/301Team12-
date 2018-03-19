package com.example.dada.ActivityTest;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.example.dada.R;
import com.robotium.solo.Solo;
import android.widget.EditText;
import com.example.dada.View.UserEditProfileActivity;

import junit.framework.TestCase;

/**
 * Test for edit profile
 */
public class UserEaditProfilrTest extends ActivityInstrumentationTestCase2{
    private Solo solo;

    public UserEaditProfilrTest(){
        super(com.example.dada.View.UserEditProfileActivity.class);
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
     * Test for edit profile with valid and invalid format
     */
    public void Testeditprofile(){
        solo.assertCurrentActivity("Wrong Activity", UserEditProfileActivity.class);

        // invalid edit
        solo.enterText((EditText) solo.getView(R.id.editText_userName_EditUserProfileActivity), "user");
        solo.enterText((EditText) solo.getView(R.id.R.id.editText_email_EditUserProfileActivity),
                "user");
        solo.enterText((EditText) solo.getView(R.id.R.id.editText_mobile_EditUserProfileActivity), "911");
        solo.clickOnButton("SaveButton");
        assertTrue(solo.waitForText("Username/Email/Mobile is not valid."));


        // valid edit
        solo.clearEditText((EditText) solo.getView(R.id.R.id.editText_userName_EditUserProfileActivity));
        solo.clearEditText((EditText) solo.getView(R.id.R.id.editText_email_EditUserProfileActivity));
        solo.clearEditText((EditText) solo.getView(R.id.R.id.editText_mobile_EditUserProfileActivity));
        solo.enterText((EditText) solo.getView(R.id.editText_userName_EditUserProfileActivity), "user");
        solo.enterText((EditText) solo.getView(R.id.R.id.editText_email_EditUserProfileActivity),
                "user@ualberta.ca");
        solo.enterText((EditText) solo.getView(R.id.R.id.editText_mobile_EditUserProfileActivity), "911");
        solo.clickOnButton("SaveButton");
    }


    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
