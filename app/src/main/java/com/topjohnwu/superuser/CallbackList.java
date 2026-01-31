package com.topjohnwu.superuser;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import java.util.AbstractList;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class CallbackList<E> extends AbstractList<E> {
    protected List<E> mBase;
    protected Executor mExecutor;

    /* renamed from: onAddElement */
    public abstract void m240lambda$add$0$comtopjohnwusuperuserCallbackList(E e);

    protected CallbackList() {
        this(UiThreadHandler.executor, null);
    }

    protected CallbackList(List<E> base) {
        this(UiThreadHandler.executor, base);
    }

    protected CallbackList(Executor executor) {
        this(executor, null);
    }

    protected CallbackList(Executor executor, List<E> base) {
        this.mExecutor = executor;
        this.mBase = base;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E s) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.set(i, s);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, final E s) {
        List<E> list = this.mBase;
        if (list != null) {
            list.add(i, s);
        }
        this.mExecutor.execute(new Runnable() { // from class: com.topjohnwu.superuser.CallbackList$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CallbackList.this.m240lambda$add$0$comtopjohnwusuperuserCallbackList(s);
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<E> list = this.mBase;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
