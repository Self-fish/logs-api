package org.selffish.adapters.web

data class LogsWebModel(val severity: LogLevel, val message: String)

enum class LogLevel {
    INFO, WARNING, SEVERE
}