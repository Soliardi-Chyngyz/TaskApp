package com.chyngyz.taskapp.data.models

import java.io.Serializable

data class Object(
    var id: Int,
    var type: String? = "general",
    var setup: String? = null,
    var punchline: String? = null,
) : Serializable
