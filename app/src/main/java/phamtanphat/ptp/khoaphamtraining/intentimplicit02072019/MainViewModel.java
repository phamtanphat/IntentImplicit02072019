package phamtanphat.ptp.khoaphamtraining.intentimplicit02072019;

import android.database.Observable;
import android.graphics.Bitmap;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

public class MainViewModel implements LifecycleObserver {

    public MainViewModel() {

    }
    MutableLiveData<Bitmap> mBitmap = new MutableLiveData<>();
    public void setmBitmap(Bitmap bitmap){
        mBitmap.setValue(bitmap);
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
//    public void createMutableliveData(){
//        mBitmap = new MutableLiveData<>();
//    }
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    public void destroyMutableliveData(){
//        mBitmap = null;
//    }
}
