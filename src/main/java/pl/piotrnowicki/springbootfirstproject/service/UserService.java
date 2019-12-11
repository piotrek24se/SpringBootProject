package pl.piotrnowicki.springbootfirstproject.service;

import pl.piotrnowicki.springbootfirstproject.model.UserDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.User;
import pl.piotrnowicki.springbootfirstproject.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);

}
