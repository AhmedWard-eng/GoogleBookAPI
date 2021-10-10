package com.demo.googlebookapi.viewmodels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.demo.googlebookapi.models.VolumesResponse;
import com.demo.googlebookapi.repositories.BookRepository;


public class BookSearchViewModel extends ViewModel {
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;


    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
        bookRepository.searchVolumes(keyword, author);
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}
