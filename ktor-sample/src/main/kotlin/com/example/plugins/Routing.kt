package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/auth/{id}") {
            val id = call.parameters["id"]
            call.respondText("Got authentication request of id: #$id")
        }

        get("/get-users/{userId}") {

        }
    }
    routing {
    }
}
