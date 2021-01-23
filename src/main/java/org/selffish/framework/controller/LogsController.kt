package org.selffish.framework.controller

import org.selffish.adapters.web.LogLevel
import org.selffish.adapters.web.LogsWebModel
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("logs")
class LogsController() {

    private val logger: Logger = LoggerFactory.getLogger(LogsController::class.java)

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun log(@RequestBody log: LogsWebModel): LogsWebModel {
        when (log.severity) {
            LogLevel.INFO -> {
                logger.info(log.message)
            }
            LogLevel.WARNING -> {
                logger.warn(log.message)
            }
            LogLevel.SEVERE -> {
                logger.error(log.message)
            }
        }

        return log
    }





}