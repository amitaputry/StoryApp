package com.amita.storyapp.domain.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.amita.storyapp.data.local.entity.StoryEntity
import com.amita.storyapp.domain.Login
import com.amita.storyapp.domain.Register
import com.amita.storyapp.domain.Response
import com.amita.storyapp.domain.Story
import java.io.File

interface StoryRepository {

    fun register(name: String, email: String, password: String): LiveData<Response<Register>>

    fun login(email: String, password: String): LiveData<Response<Login>>

    fun getStories(token: String): LiveData<PagingData<StoryEntity>>

    fun getDetailStory(token: String, id: String): LiveData<Response<Story>>

    fun getStoriesWithLatLng(token: String): LiveData<Response<List<Story>>>

    fun addNewStory(
        token: String,
        image: File,
        description: String,
        latitude: Double? = null,
        longitude: Double? = null
    ): LiveData<Response<String>>
}