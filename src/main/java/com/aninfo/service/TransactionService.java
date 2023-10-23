package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.aninfo.model.TransactionType.DEPOSIT;
import static com.aninfo.model.TransactionType.WITHDRAWAL;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    private AccountService accountService;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findTransactionById(id);
    }

    public List<Transaction> getTransactionsByCbu(Long cbu) {
        return transactionRepository.findTransactionByCbu(cbu);
    }

    public void deleteById(Long ID) {
        transactionRepository.deleteById(ID);
    }
}
