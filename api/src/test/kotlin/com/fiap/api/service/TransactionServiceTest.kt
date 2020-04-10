package com.fiap.api.service

import com.fiap.api.domain.Transaction
import com.fiap.api.entities.request.CreateTransactionRequest
import com.fiap.api.repository.TransactionRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener

@RunWith(SpringRunner::class)
@SpringBootTest
@TestExecutionListeners(DependencyInjectionTestExecutionListener::class)
class TransactionServiceTest {

    @Autowired
    private lateinit var transactionService: TransactionService

    @Autowired
    @MockBean
    private lateinit var transactionRepository: TransactionRepository

    val userDoc = "12345"
    val transaction = Transaction(userDoc = userDoc, description = "fiap", amount = 10.0)
    val createTransactionRequest = CreateTransactionRequest(userDoc = userDoc, description = "fiap", amount = 10.0)

    @Test
    fun test_saveTransaction() {
        Mockito.`when`(transactionRepository.save(transaction)).thenReturn(transaction)

        val expected = transactionService.saveTransaction(transaction).toFuture().get()
        Assert.assertEquals(true, expected.userDoc == userDoc)
    }
}
