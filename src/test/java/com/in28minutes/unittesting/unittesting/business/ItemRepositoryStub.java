package com.in28minutes.unittesting.unittesting.business;

import java.util.List;
import java.util.Optional;

import java.util.Arrays;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

public class ItemRepositoryStub implements ItemRepository {

	@Override
	public List<Item> findAll() {
		return Arrays.asList(new Item(1,"Ball",10,100),new Item(1,"Ball",10,100));
	}

	@Override
	public List<Item> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Item> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Item> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Item getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Item> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Item> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Item entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Item> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Item> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Item> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Item> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
