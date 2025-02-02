package com.amita.storyapp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.amita.storyapp.domain.Response
import com.amita.storyapp.domain.Story
import com.amita.storyapp.domain.repository.StoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val storyRepository: StoryRepository) : ViewModel() {

    fun getDetailStory(token: String, id: String): LiveData<Response<Story>> {
        return storyRepository.getDetailStory(token, id)
    }

}