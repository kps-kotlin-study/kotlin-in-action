package com.project.agit.common.person

import com.project.agit.common.domain.person.Person
import com.project.agit.common.person.constant.Location
import com.project.agit.common.test.RepositoryTest
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.extensions.spring.SpringTestExtension
import io.kotest.extensions.spring.SpringTestLifecycleMode
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.mockk.clearAllMocks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@RepositoryTest
class PersonRepositoryTest @Autowired constructor(
    val personRepository: PersonRepository,
    val entityManager: TestEntityManager
) : ExpectSpec({
    extensions(SpringTestExtension(SpringTestLifecycleMode.Root))

    context("유저 조회") {
        personRepository.saveAll(
            listOf(
                Person(name = "brett", age = 32, location = Location.LOBBY)
            )
        )

        expect("유저 이름으로 조회한다") {
            val actual = personRepository.findByNameOrNull("brett")
            actual.shouldNotBeNull()
            actual.name shouldBe "brett"
        }
    }

    afterEach {
        entityManager.flush()
        entityManager.clear()
    }

    afterTest {
        personRepository.deleteAll()
    }

    afterContainer {
        clearAllMocks()
    }
})
