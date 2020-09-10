package com.aliceapps.rxjavautils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class AutoDisposable implements LifecycleObserver {
    private CompositeDisposable compositeDisposable;

    public AutoDisposable(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        compositeDisposable = new CompositeDisposable();
    }

   /* public void bindTo(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        compositeDisposable = new CompositeDisposable();
    }*/

    public void add(Disposable disposable) throws Throwable {
        if (compositeDisposable != null)
            compositeDisposable.add(disposable);
        else
            throw new Throwable("must bind AutoDisposable to a Lifecycle first");
    }

  /*  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        compositeDisposable.clear();
    }*/

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        compositeDisposable.dispose();
    }
}
