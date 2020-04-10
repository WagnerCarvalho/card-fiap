package com.fiap.api.repository

import com.fiap.api.domain.Transaction
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TransactionRepository : MongoRepository<Transaction, String> {

    fun findByUserDoc(userDoc: String): MutableList<Transaction>
}
