package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.TestScheduler;

public class TestSchedulerProvider  implements BaseSchedulerProvider {
    TestScheduler testScheduler;

    TestSchedulerProvider(TestScheduler scheduler) {
        testScheduler = scheduler;
    }

    @Override
    public Scheduler io() {
        return testScheduler;
    }

    @Override
    public Scheduler ui() {
        return testScheduler;
    }

    @Override
    public Scheduler computation() {
        return testScheduler;
    }
}
