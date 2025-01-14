package com.kurdestanbootcamp.postservice.post;

import com.kurdestanbootcamp.postservice.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PostService implements IPostService {


    private  final PostRepository repository;


    @Override
    public Post save(Post post) {

        return repository.save(post);
    }


    @Override
    public void delete(Long id) {


        repository.deleteById(id);
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> optionalPost=repository.findById(id);

        if (!optionalPost.isPresent()){

            throw new NotFoundException("Not Found");
        }


        return optionalPost.get();
    }

    @Override
    public List<Post> getAll() {
        return (List<Post>) repository.findAll();
    }



}
