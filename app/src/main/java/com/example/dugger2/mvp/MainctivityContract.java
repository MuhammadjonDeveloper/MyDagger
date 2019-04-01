package com.example.dugger2.mvp;

import com.example.dugger2.pojo.CryptoData;

import java.util.List;

public interface MainctivityContract {
    interface View {
        void showData(List<CryptoData> date);

        void showError(String massage);

        void showComplate();

        void showProgress();

        void hideProgress();
    }
    interface Presenter{

        void loadDate();

    }
}
