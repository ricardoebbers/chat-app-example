package br.ufpe.cin.recl.chatbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatBackendApplication

fun main(args: Array<String>) {
	runApplication<ChatBackendApplication>(*args)
}
