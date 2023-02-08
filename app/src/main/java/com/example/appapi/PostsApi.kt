package com.example.appapi

interface PostsApi {
    suspend fun getPosts(): List<Post>
}