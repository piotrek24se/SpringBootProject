package pl.piotrnowicki.springbootfirstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.piotrnowicki.springbootfirstproject.exception.WrongIdException;
import pl.piotrnowicki.springbootfirstproject.model.UserDTO;
import pl.piotrnowicki.springbootfirstproject.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public UserDTO registry(@RequestBody UserDTO userDTO) {
        if(idExist(userDTO)) throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID.");
        return userService.createUser(userDTO);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public UserDTO edit(@RequestBody UserDTO userDTO) {
        if(idExist(userDTO)) throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID.");
        return userService.editUser(userDTO);
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public UserDTO confirm(@PathVariable(value = "id") Long id) {
        return new UserDTO();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public UserDTO add(@RequestBody UserDTO userDTO) {
        if(idExist(userDTO)) throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID.");
        return userService.createUser(userDTO);
    }

    private boolean idExist(UserDTO userDTO) {
        return userDTO.getId() != null;
    }

}
