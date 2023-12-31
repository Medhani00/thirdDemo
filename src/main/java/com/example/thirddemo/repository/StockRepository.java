package com.example.thirddemo.repository;

import com.example.thirddemo.model.Product;
import com.example.thirddemo.model.Stock;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class StockRepository implements JpaRepository<Stock, Long> {
    @Override
    public List<Stock> findAll() {
        return null;
    }

    @Override
    public List<Stock> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Stock> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Stock> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Stock entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Stock> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Stock> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Stock> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Stock> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Stock> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Stock> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Stock> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Stock getOne(Long aLong) {
        return null;
    }

    @Override
    public Stock getById(Long aLong) {
        return null;
    }

    @Override
    public Stock getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Stock> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Stock> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Stock> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Stock> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Stock> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Stock> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Stock, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
