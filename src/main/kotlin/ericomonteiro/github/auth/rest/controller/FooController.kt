package ericomonteiro.github.auth.rest.controller

import ericomonteiro.github.auth.rest.dto.FooDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("foo")
class FooController {

    @GetMapping
    fun getAllFoo(): List<FooDto> = listOf(
        FooDto(1L, "Demo Name"),
        FooDto(2L, "Other Name")
    )

}