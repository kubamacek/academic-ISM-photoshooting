/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
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
@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Add new user", nickname = "createUser", notes = "", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@ApiParam(value = "User object that needs to be created" ,required=true )  @Valid @RequestBody User body
);


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Min(1)@ApiParam(value = "User id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Update user", nickname = "editUser", notes = "", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> editUser(@ApiParam(value = "User object that needs to be updated" ,required=true )  @Valid @RequestBody User body
,@Min(1)@ApiParam(value = "User id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Get user by id", nickname = "getUser", notes = "", response = User.class, tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUser(@Min(1)@ApiParam(value = "User id",required=true, allowableValues="") @PathVariable("id") Integer id
);


    @ApiOperation(value = "Get all users", nickname = "getUsers", notes = "", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad request") })
    @RequestMapping(value = "/users",
        method = RequestMethod.GET)
    ResponseEntity<Void> getUsers();

}
