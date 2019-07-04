package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;

// This test is to check the Async task successfully retrieves a non-empty string
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    /**
     * The ActivityTestRule is a rule provided by Android used for functional testing of a single
     * activity. The activity that will be tested will be launched before each test that's annotated
     * with @Test and before methods annotated with @Before. The activity will be terminated after
     * the test and methods annotated with @After are complete. This rule allows you to directly
     * access the activity during the test.
     */
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void resultTest() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mActivityTestRule.getActivity());
        endpointsAsyncTask.execute();

        // This will retrieve the result from asyncTask execution
        String joke = endpointsAsyncTask.get();

        // To test if joke string is non-empty
        assertNotNull(joke);

    }
}
