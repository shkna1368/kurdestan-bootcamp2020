package com.kurdestan.bootcamp.post;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-15T00:20:38+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post toPost(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post post = new Post();

        post.setId( postDTO.getId() );
        post.setTitle( postDTO.getTitle() );

        return post;
    }

    @Override
    public PostDTO toPostDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO postDTO = new PostDTO();

        postDTO.setId( post.getId() );
        postDTO.setTitle( post.getTitle() );

        return postDTO;
    }

    @Override
    public List<PostDTO> toPostDTOs(List<Post> posts) {
        if ( posts == null ) {
            return null;
        }

        List<PostDTO> list = new ArrayList<PostDTO>( posts.size() );
        for ( Post post : posts ) {
            list.add( toPostDTO( post ) );
        }

        return list;
    }
}
