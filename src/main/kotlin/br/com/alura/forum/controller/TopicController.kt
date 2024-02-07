package br.com.alura.forum.controller

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.StatusTopico
import br.com.alura.forum.model.Topic
import br.com.alura.forum.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topics")
class TopicController {

    @GetMapping
    fun list(): List<Topic> {
        val topic = Topic(
                id = 1,
                titulo = "Duvida",
                mensagem = "Variaveis no kotlin",
                curso = Curso(1, "KOtlin", "Programacao"),
                autor = Usuario(1, "Joao paulo", "joao@email.com"),
                status = StatusTopico.NAO_RESPONDIDO,
                resposta = emptyList()
        )

        return listOf(topic, topic, topic)
    }
}