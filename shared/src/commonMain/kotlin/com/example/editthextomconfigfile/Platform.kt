package com.example.editthextomconfigfile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform