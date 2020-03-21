package com.grupi4.projekt2.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Projekti 2 krijuar nga Grupi 4");
    }

    public LiveData<String> getText() {
        return mText;
    }
}