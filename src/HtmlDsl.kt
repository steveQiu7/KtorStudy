package com.example

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.util.pipeline.*
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.li
import kotlinx.html.ul

suspend fun PipelineContext<Unit, ApplicationCall>.htmlDsl() {
    call.respondHtml {
        body {
            h1 { +"HTML" }
            ul {
                for (n in 1..10) {
                    li { +"$n" }
                }
            }
        }
    }
}