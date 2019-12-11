package pl.piotrnowicki.springbootfirstproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrnowicki.springbootfirstproject.model.UserDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.BaseEntity;
import pl.piotrnowicki.springbootfirstproject.persistence.model.User;
import pl.piotrnowicki.springbootfirstproject.persistence.repository.UserRepo;

import java.io.Serializable;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepo> implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }
}
