package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.TestScheduler;

/**
 * Implementation of BaseSchedulerProvider. Can be used for testing
 * @author alice.apps
 * @version 16.09.2020
 */
public class TestSchedulerProvider  implements BaseSchedulerProvider {
    TestScheduler testScheduler;

    /**
     * Initialises the Scheduler with provided TestScheduler
     * @param scheduler provides TestScheduler that should be used
     */
    TestSchedulerProvider(TestScheduler scheduler) {
        testScheduler = scheduler;
    }

    /**
     *
     * @return TestScheduler
     */
    @Override
    public Scheduler io() {
        return testScheduler;
    }

    /**
     *
     * @return TestScheduler
     */
    @Override
    public Scheduler ui() {
        return testScheduler;
    }

    /**
     *
     * @return TestScheduler
     */
    @Override
    public Scheduler computation() {
        return testScheduler;
    }
}
