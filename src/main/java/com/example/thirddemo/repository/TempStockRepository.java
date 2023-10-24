package com.example.thirddemo.repository;

import com.example.thirddemo.model.Product;
import com.example.thirddemo.model.TempStock;
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
public class TempStockRepository implements JpaRepository<TempStock, Long> {
    @Override
    public List<TempStock> findAll() {
        return null;
    }

    @Override
    public List<TempStock> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TempStock> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TempStock> findAllById(Iterable<Long> longs) {
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
    public void delete(TempStock entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TempStock> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TempStock> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TempStock> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TempStock> findById(Long aLong) {
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
    public <S extends TempStock> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TempStock> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TempStock> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TempStock getOne(Long aLong) {
        return null;
    }

    @Override
    public TempStock getById(Long aLong) {
        return null;
    }

    @Override
    public TempStock getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends TempStock> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TempStock> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TempStock> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TempStock> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TempStock> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TempStock> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TempStock, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
