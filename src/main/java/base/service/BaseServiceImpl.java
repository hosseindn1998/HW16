package base.service;

import base.entity.BaseEntity;
import base.exception.NotFoundException;
import base.repository.BaseRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;

@RequiredArgsConstructor
public class BaseServiceImpl<T extends BaseEntity<ID>,
        ID extends Serializable,
        R extends BaseRepository<T, ID>>
        implements BaseService<T, ID>{

    protected final R repository;


    @Override
    public T saveOrUpdate(T entity) {
        return repository.saveOrUpdate(entity);
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException(String.format("entity with %s not found", id)));
    }

    @Override
    public void delete(T t) {
        T foundedEntity = findById(t.getId());
        repository.delete(foundedEntity);
    }

    @Override
    public void deleteById(ID id) {
        T foundedEntity = findById(id);
        repository.delete(foundedEntity);
    }


}
