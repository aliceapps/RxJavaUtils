package com.aliceapps.rxjavautils;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * AutoDisposable class implements LifecycleObserver.
 * It creates a CompositeDisposable object that will be automatically disposed when parent's lifecycle is destroyed.
 *
 * @author alice.apps
 * @version 16.09.2020
 */
public class AutoDisposable implements LifecycleObserver {
    private CompositeDisposable compositeDisposable;

    /**
     * AutoDisposable constructor. Creates new CompositeDisposable object and adds lifecycle observer.
     * @param lifecycle - observes this lifecycle
     */
    public AutoDisposable(@NonNull  Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        compositeDisposable = new CompositeDisposable();
    }

    /**
     * Adds disposable to CompositeDisposable object
     * @param disposable - disposable that will be added
     * @throws Throwable - throws error if CompositeDisposable was not created yet
     */
    public void add(Disposable disposable) throws Throwable {
        if (compositeDisposable != null)
            compositeDisposable.add(disposable);
        else
            throw new Throwable("must bind AutoDisposable to a Lifecycle first");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onStop() {
        compositeDisposable.clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        compositeDisposable.dispose();
    }
}
