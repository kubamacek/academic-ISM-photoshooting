/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Comment;
import io.swagger.model.Post;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-29T16:53:00.885Z[GMT]")
@Api(value = "posts", description = "the posts API")
public interface PostsApi {

    @ApiOperation(value = "Add new post", nickname = "addPost", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request") })
    @RequestMapping(value = "/posts",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPost(@ApiParam(value = "Post object that needs to be created" ,required=true )  @Valid @RequestBody Post body
);


    @ApiOperation(value = "Add new comment to post", nickname = "addPostComment", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request") })
    @RequestMapping(value = "/posts/{id}/comments",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPostComment(@ApiParam(value = "Comment object that needs to be created" ,required=true )  @Valid @RequestBody Comment body
,@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Delete post", nickname = "deletePost", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Post not found") })
    @RequestMapping(value = "/posts/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePost(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Delete specific comment for specific post", nickname = "deletePostComment", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/posts/{postId}/comments/{commentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePostComment(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("postId") Integer postId
,@Min(1)@ApiParam(value = "Comment id",required=true, allowableValues="") @PathVariable("commentId") Integer commentId
);


    @ApiOperation(value = "Edit specific comment for specific post", nickname = "editPostComment", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/posts/{postId}/comments/{commentId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> editPostComment(@ApiParam(value = "Comment object that needs to be updated" ,required=true )  @Valid @RequestBody Comment body
,@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("postId") Integer postId
,@Min(1)@ApiParam(value = "Comment id",required=true, allowableValues="") @PathVariable("commentId") Integer commentId
);


    @ApiOperation(value = "Get post by id", nickname = "getPost", notes = "", response = Post.class, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Post not found") })
    @RequestMapping(value = "/posts/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Post> getPost(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Get specific comment for specific post", nickname = "getPostComment", notes = "", response = Comment.class, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/posts/{postId}/comments/{commentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Comment> getPostComment(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("postId") Integer postId
,@Min(1)@ApiParam(value = "Comment id",required=true, allowableValues="") @PathVariable("commentId") Integer commentId
);


    @ApiOperation(value = "Get post's comments", nickname = "getPostComments", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Post not found") })
    @RequestMapping(value = "/posts/{id}/comments",
        method = RequestMethod.GET)
    ResponseEntity<Void> getPostComments(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Get all posts", nickname = "getPosts", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request") })
    @RequestMapping(value = "/posts",
        method = RequestMethod.GET)
    ResponseEntity<Void> getPosts();


    @ApiOperation(value = "Like post", nickname = "likePost", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Post not found") })
    @RequestMapping(value = "/posts/{id}/like",
        method = RequestMethod.GET)
    ResponseEntity<Void> likePost(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Update post", nickname = "updatePost", notes = "", tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "Post not found") })
    @RequestMapping(value = "/posts/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatePost(@Min(1)@ApiParam(value = "Post id",required=true, allowableValues="") @PathVariable("id") Integer id
,@ApiParam(value = "Post object that needs to be updated"  )  @Valid @RequestBody Post body
);

}