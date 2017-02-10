package com.practice.appdownloader;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.appdownloader.http.RetrofitService;
import com.practice.appdownloader.model.CategoryDetailResponse;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryDetailFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryDetailFrag extends Fragment {
    private static final String TAG = CategoryDetailFrag.class.getSimpleName();
    private static final String URL = "URL";

    Retrofit retrofit;
    RetrofitService retrofitService;
    RecyclerView mainRv;
    CategoryDetailRecyclerViewAdapter categoryDetailRecyclerViewAdapter;
    View mainRvEmptyView;

    public CategoryDetailFrag() {
    }


    // TODO: Rename and change types and number of parameters
    public static CategoryDetailFrag newInstance(String url) {
        CategoryDetailFrag fragment = new CategoryDetailFrag();
        Bundle args = new Bundle();
        args.putString(URL, url);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category_detail, container, false);
        mainRv = (RecyclerView) view.findViewById(R.id.mainRv);
        mainRvEmptyView = view.findViewById(R.id.mainRvEmptyView);
        mainRv.setLayoutManager(new LinearLayoutManager(getContext()));
        categoryDetailRecyclerViewAdapter = new CategoryDetailRecyclerViewAdapter(this, mainRv, mainRvEmptyView);
        mainRv.setAdapter(categoryDetailRecyclerViewAdapter);
        retrofitService.getAppCategoryDetail(getArguments().getString(URL))
                .subscribeOn(Schedulers.io())
                .onBackpressureBuffer()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CategoryDetailResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: " + Log.getStackTraceString(e));
                    }

                    @Override
                    public void onNext(CategoryDetailResponse categoryDetailResponse) {
                        Log.e(TAG, "onNext: " + categoryDetailResponse.getData()[0]);
                        categoryDetailRecyclerViewAdapter.addAll(categoryDetailResponse.getData());
                    }
                });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coolapk.com")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitService = retrofit.create(RetrofitService.class);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
