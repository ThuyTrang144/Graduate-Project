package com.dtu.capstone2.ereading.network.request

import com.google.gson.annotations.SerializedName

data class TranslateNewFeedAgainRequest(@SerializedName("url_source_feed") val urlSourceFeed: String,
                                        @SerializedName("position_content") val positionContent: Int,
                                        val words: String,
                                        val vocabularies: List<Vocabulary>)
