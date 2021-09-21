package com.developervijay.imagesearchapp.api

import com.developervijay.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)