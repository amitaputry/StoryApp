package com.amita.storyapp.di

import com.amita.storyapp.data.StoryRepositoryImpl
import com.amita.storyapp.domain.repository.StoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideStoryRepository(
        storyRepositoryImpl: StoryRepositoryImpl
    ) : StoryRepository
}